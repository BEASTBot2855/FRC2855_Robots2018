package org.usfirst.frc.team2855.robot.subsystems;

import org.usfirst.frc.team2855.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Elevator extends Subsystem {

	private final Encoder elevatorencoder;
	private final SpeedController winch;
	
	public Elevator() {
		elevatorencoder = RobotMap.elevatorelevatorencoder;
		winch = RobotMap.elevatorwinch;
	}
	
	public void initDefaultCommand() {}
	
	public void periodic() { SmartDashboard.putNumber("Elevator Height", (double) elevatorencoder.get()); }
	
	public void elevate(double direction) { winch.set(direction); }
	
}
