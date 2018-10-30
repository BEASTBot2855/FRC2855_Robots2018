package org.usfirst.frc.team2855.robot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.ConditionalCommand;

public class LeftArrangementCheck extends ConditionalCommand {

	public LeftArrangementCheck() { super(new CommandGroupSwitchLeft(), new ShouldWeScaleLeft()); }
	
	protected boolean condition() {
		System.out.println("-----LeftArrangementCheck has run-----");
		String gameData = DriverStation.getInstance().getGameSpecificMessage();
		if (gameData.length() > 0) {
			return gameData.charAt(0) == 'L';
		} else { return false; }
	}
	
}
