package org.usfirst.frc.team2855.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class CommandGroupSwitchLeft extends CommandGroup {

	public CommandGroupSwitchLeft() {
		addSequential(new ReleaseCube());
	}
	
}
