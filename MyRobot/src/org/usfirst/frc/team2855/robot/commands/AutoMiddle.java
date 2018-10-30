package org.usfirst.frc.team2855.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoMiddle extends CommandGroup {

	public AutoMiddle() {
		addSequential(new SetToSlow());
		addSequential(new AutoElevatorUp(2.5));
		addSequential(new AutoForward(2.0));
	}
	
}
