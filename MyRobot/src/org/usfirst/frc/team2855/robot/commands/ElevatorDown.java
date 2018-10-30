package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;
import org.usfirst.frc.team2855.robot.subsystems.Elevator;

import edu.wpi.first.wpilibj.command.Command;

public class ElevatorDown extends Command {

	private Elevator elevator;
	
	public ElevatorDown() { requires(Robot.elevator); }
	
	protected void initialize() { elevator = Robot.elevator; }
	
	protected void execute() { elevator.elevate(-0.75); }
	
	protected boolean isFinished() { return false; }
	
	protected void end() { elevator.elevate(0.0); }
	
	protected void interrupted() { end(); }
	
}
