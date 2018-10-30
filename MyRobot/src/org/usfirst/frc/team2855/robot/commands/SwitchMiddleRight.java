package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.RobotMap;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class SwitchMiddleRight extends CommandGroup {

	public SwitchMiddleRight() {
		addSequential(new AutoTurnRight(RobotMap.preferences.getDouble("MiddleTurn", 1.0)));
		addSequential(new AutoForward(RobotMap.preferences.getDouble("MiddleOut", 1.0)));
		addParallel(new AutoElevatorUp(RobotMap.preferences.getDouble("ElevatorToSwitch", 1.0)));
		addSequential(new AutoTurnLeft(RobotMap.preferences.getDouble("MiddleTurn2", 1.0)));
		addSequential(new AutoForward(RobotMap.preferences.getDouble("Turn2ToSwitch", 1.0)));
		addSequential(new ReleaseCube());
	}
	
}

