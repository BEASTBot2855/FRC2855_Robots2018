package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;
import org.usfirst.frc.team2855.robot.subsystems.IntakeMotor;

import edu.wpi.first.wpilibj.command.Command;

public class EjectCube extends Command {

	private IntakeMotor motor;
	
	public EjectCube() { requires(Robot.intakeMotor); }
	
	protected void initialize() { motor = Robot.intakeMotor; }
	
	protected void execute() { motor.runIntake(-1.0); }
	
	protected boolean isFinished() { return false; }
	
	protected void end() { motor.runIntake(0.0); }
	
	protected void interrupted() { end(); }
	
	
}
