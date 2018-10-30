package org.usfirst.frc.team2855.robot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.ConditionalCommand;

public class RightArrangementCheckScale extends ConditionalCommand {

	public RightArrangementCheckScale() { super(new CommandGroupScaleRight(), new RightArrangementCheck()); }
	
	protected boolean condition() {
		System.out.println("-----RightArrangementCheckScale has run-----");
		String gameData = DriverStation.getInstance().getGameSpecificMessage();
		if (gameData.length() > 0) {
			return gameData.charAt(1) == 'R';
		} else { return false; }
	}
	
}
