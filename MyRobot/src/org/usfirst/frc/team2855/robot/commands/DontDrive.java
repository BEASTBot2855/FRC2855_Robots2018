package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class DontDrive extends InstantCommand {

	public DontDrive() { requires(Robot.drive); }
	
	protected void initialize() { System.out.println("-----DontDrive has run-----"); }
	
}
