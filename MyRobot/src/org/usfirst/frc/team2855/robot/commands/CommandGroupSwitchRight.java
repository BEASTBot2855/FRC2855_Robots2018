package org.usfirst.frc.team2855.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class CommandGroupSwitchRight extends CommandGroup {

	public CommandGroupSwitchRight() {
		addSequential(new ReleaseCube());
	}
	
}
