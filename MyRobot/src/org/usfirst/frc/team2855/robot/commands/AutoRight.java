package org.usfirst.frc.team2855.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoRight extends CommandGroup {

	public AutoRight() {
		addSequential(new SetToSlow());
		addSequential(new AutoForward(0.5));
		addSequential(new RightArrangementCheck());
	}
	
}
