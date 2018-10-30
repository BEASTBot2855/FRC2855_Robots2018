package org.usfirst.frc.team2855.robot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.ConditionalCommand;

public class LeftArrangementCheckScale extends ConditionalCommand {

	public LeftArrangementCheckScale() { super(new CommandGroupScaleLeft(), new LeftArrangementCheck()); }
	
	protected boolean condition() {
		System.out.println("-----LeftArrangementCheckScale has run-----");
		String gameData = DriverStation.getInstance().getGameSpecificMessage();
		if (gameData.length() > 0) {
			return gameData.charAt(1) == 'L';
		} else { return false; }
	}
	
}
