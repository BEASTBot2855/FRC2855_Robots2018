package org.usfirst.frc.team2855.robot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.ConditionalCommand;

public class ShouldWeScaleRight extends ConditionalCommand {

	public ShouldWeScaleRight() { super(new CommandGroupScaleRight(), new DontDrive()); }
	
	protected boolean condition() {
		System.out.println("-----ShouldWeScaleRight has run-----");
		String gameData = DriverStation.getInstance().getGameSpecificMessage();
		if (gameData.length() > 0) {
			return gameData.charAt(1) == 'R';
		} else { return false; }
	}
	
}
