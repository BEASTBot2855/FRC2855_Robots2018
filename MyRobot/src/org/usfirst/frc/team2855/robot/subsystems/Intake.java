package org.usfirst.frc.team2855.robot.subsystems;

import org.usfirst.frc.team2855.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {
	
	private final SpeedController leftIntake;
	private final Solenoid leftSolenoid;
	private final Solenoid rightSolenoid;
	private final DoubleSolenoid leftDoubleSolenoid;
	private final DoubleSolenoid rightDoubleSolenoid;
	
	public Intake() {
		leftIntake = RobotMap.intakeleftIntake;
		leftSolenoid = RobotMap.intakeleftSolenoid;
		rightSolenoid = RobotMap.intakerightSolenoid;
		leftDoubleSolenoid = RobotMap.intakeleftDoubleSolenoid;
		rightDoubleSolenoid = RobotMap.intakerightDoubleSolenoid;
	}

	public void initDefaultCommand() {}
	
	public void periodic() {}
	
	public void moveGrabber(boolean grab) {
		leftSolenoid.set(grab);
		rightSolenoid.set(grab);
		if (grab) {
			leftDoubleSolenoid.set(Value.kForward);
			rightDoubleSolenoid.set(Value.kForward);
		} else {
			leftDoubleSolenoid.set(Value.kReverse);
			rightDoubleSolenoid.set(Value.kReverse);
		}
	}
	
}
