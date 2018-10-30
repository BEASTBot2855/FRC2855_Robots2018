package org.usfirst.frc.team2855.robot.subsystems;

import org.usfirst.frc.team2855.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shifter extends Subsystem {

	private final DoubleSolenoid shift1;
	
	public Shifter() { shift1 = RobotMap.shiftershift1; }
	
	public void initDefaultCommand() {}
	
	public void periodic() {}
	
	public void setOff() { shift1.set(Value.kOff); }
	
	public void setSlow() { shift1.set(Value.kForward); }
	
	public void setFast() { shift1.set(Value.kReverse); }

	
}
