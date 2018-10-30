package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class DoNothing extends InstantCommand {

	public DoNothing() { requires(Robot.drive); }
	
	protected void initialize() {}
	
}
