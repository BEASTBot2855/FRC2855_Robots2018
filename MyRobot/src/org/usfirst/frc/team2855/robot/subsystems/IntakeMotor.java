package org.usfirst.frc.team2855.robot.subsystems;

import org.usfirst.frc.team2855.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class IntakeMotor extends Subsystem {
	
	private final SpeedController leftIntake;
	private final Solenoid leftSolenoid;
	private final Solenoid rightSolenoid;
	private final DoubleSolenoid leftDoubleSolenoid;
	private final DoubleSolenoid rightDoubleSolenoid;
	
	public IntakeMotor() {
		leftIntake = RobotMap.intakeleftIntake;
		leftSolenoid = RobotMap.intakeleftSolenoid;
		rightSolenoid = RobotMap.intakerightSolenoid;
		leftDoubleSolenoid = RobotMap.intakeleftDoubleSolenoid;
		rightDoubleSolenoid = RobotMap.intakerightDoubleSolenoid;
	}

	public void initDefaultCommand() {}
	
	public void periodic() {}
	
	public void runIntake(double direction) { leftIntake.set(direction); }
	
}
