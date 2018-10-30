package org.usfirst.frc.team2855.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class CommandGroupScaleRight extends CommandGroup {

	public CommandGroupScaleRight() {
		addSequential(new AutoForward(0.5));
		addParallel(new AutoTurnLeft(0.25));
		addSequential(new AutoElevatorUp(0.5));
		addSequential(new AutoForward(0.1));
		addSequential(new ReleaseCube());
	}
	
}
