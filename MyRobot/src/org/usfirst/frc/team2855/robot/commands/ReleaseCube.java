package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;
import org.usfirst.frc.team2855.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

public class ReleaseCube extends Command {

	private Intake grabber;
	
	public ReleaseCube() { requires(Robot.intake); }
	
	protected void initialize() {
		System.out.println("-----ReleaseCube has run-----");
		grabber = Robot.intake;
	}
	
	protected void execute() { grabber.moveGrabber(true); }
	
	protected boolean isFinished() { return false; }
	
	protected void end() { grabber.moveGrabber(false); }
	
	protected void interrupted() { end(); }
	
}
