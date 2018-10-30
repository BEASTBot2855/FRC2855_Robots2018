package org.usfirst.frc.team2855.robot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.ConditionalCommand;

public class MiddleArrangementCheck extends ConditionalCommand {

	public MiddleArrangementCheck() { super(new SwitchMiddleLeft(), new SwitchMiddleRight()); }
	
	protected boolean condition() {
		System.out.println("-----MiddleArrangementCheck has run-----");
		String gameData = DriverStation.getInstance().getGameSpecificMessage();
		if (gameData.length() > 0) {
			return gameData.charAt(0) == 'L';
		} else { return false; }
	}
	
}
