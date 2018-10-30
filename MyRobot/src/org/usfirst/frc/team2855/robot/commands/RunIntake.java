package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;
import org.usfirst.frc.team2855.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

public class RunIntake extends Command {

	private Intake intake;
	
	public RunIntake() { requires(Robot.intake); }
	
	protected void initialize() {}
	
	protected void execute() {}
	
	protected boolean isFinished() { return false; }
	
	protected void end() {}
	
	protected void interrupted() {}
	
}
