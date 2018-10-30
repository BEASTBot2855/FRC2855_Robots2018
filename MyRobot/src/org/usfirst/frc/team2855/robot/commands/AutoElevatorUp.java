package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;
import org.usfirst.frc.team2855.robot.RobotMap;
import org.usfirst.frc.team2855.robot.subsystems.Elevator;

import edu.wpi.first.wpilibj.command.TimedCommand;

public class AutoElevatorUp extends TimedCommand {

	private Elevator elevator;
	
	public AutoElevatorUp() { this(0.0); }
	
	public AutoElevatorUp(double timeout) { super(timeout); }
	
	protected void initialize() {
		System.out.println("-----AutoElevatorUp has run-----");
		System.out.println("ElevatorToSwitch = " + RobotMap.preferences.getDouble("ElevatorToSwitch", 1.0));
		System.out.println("ElevatorToScale = " + RobotMap.preferences.getDouble("ElevatorToScale", 1.0));
		elevator = Robot.elevator;
	}
	
	protected void execute() { elevator.elevate(0.75); }
	
	protected void end() { elevator.elevate(0.0); }
	
	protected void interrupted() { end(); }
	
}
