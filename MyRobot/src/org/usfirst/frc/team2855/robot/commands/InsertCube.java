package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;
import org.usfirst.frc.team2855.robot.subsystems.IntakeMotor;

import edu.wpi.first.wpilibj.command.Command;

public class InsertCube extends Command {

	private IntakeMotor motor;
	
	public InsertCube() { requires(Robot.intakeMotor); }
	
	protected void initialize() { motor = Robot.intakeMotor; }
	
	protected void execute() { motor.runIntake(1.0); }
	
	protected boolean isFinished() { return false; }
	
	protected void end() { motor.runIntake(0.0); }
	
	protected void interrupted() { end(); }
	
}
