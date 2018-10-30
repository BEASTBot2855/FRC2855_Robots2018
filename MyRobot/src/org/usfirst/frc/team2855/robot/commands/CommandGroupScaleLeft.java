package org.usfirst.frc.team2855.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class CommandGroupScaleLeft extends CommandGroup {

	public CommandGroupScaleLeft() {
		addSequential(new AutoForward(0.5));
		addParallel(new AutoTurnRight(0.25));
		addSequential(new AutoElevatorUp(0.5));
		addSequential(new AutoForward(0.1));
		addSequential(new ReleaseCube());
	}
	
}
