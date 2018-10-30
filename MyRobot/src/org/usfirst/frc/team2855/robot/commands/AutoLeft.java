package org.usfirst.frc.team2855.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoLeft extends CommandGroup {

	public AutoLeft() {
		addSequential(new SetToSlow());
		addSequential(new AutoForward(0.5));
		addSequential(new LeftArrangementCheck());
	}
	
}
