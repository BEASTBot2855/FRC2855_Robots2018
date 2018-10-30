package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;
import org.usfirst.frc.team2855.robot.subsystems.Elevator;

import edu.wpi.first.wpilibj.command.Command;

public class ElevatorUp extends Command {

	private Elevator elevator;
	
	public ElevatorUp() { requires(Robot.elevator); }
	
	protected void initialize() { elevator = Robot.elevator; }
	
	protected void execute() { elevator.elevate(1.0); }
	
	protected boolean isFinished() { return false; }
	
	protected void end() { elevator.elevate(0.0); }
	
	protected void interrupted() { end(); }
	
}
