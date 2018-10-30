package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.RobotMap;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoLeftScale extends CommandGroup {

	public AutoLeftScale() {
		addSequential(new SetToSlow());
		addSequential(new AutoForward(RobotMap.preferences.getDouble("WallToTurn", 1.0)));
		addSequential(new LeftArrangementCheckScale());
	}
	
}
