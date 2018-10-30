package org.usfirst.frc.team2855.robot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.ConditionalCommand;

public class RightArrangementCheck extends ConditionalCommand {

	public RightArrangementCheck() { super(new CommandGroupSwitchRight(), new ShouldWeScaleRight()); }
	
	protected boolean condition() {
		System.out.println("-----RightArrangementCheck has run-----");
		String gameData = DriverStation.getInstance().getGameSpecificMessage();
		if (gameData.length() > 0) {
			return gameData.charAt(0) == 'R';
		} else { return false; }
	}
	
}
