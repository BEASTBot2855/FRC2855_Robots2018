package org.usfirst.frc.team2855.robot.subsystems;

import org.usfirst.frc.team2855.robot.RobotMap;
import org.usfirst.frc.team2855.robot.commands.DriveRobot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drive extends Subsystem {

	private final WPI_TalonSRX rightBottom;
	private final WPI_TalonSRX rightTop;
	private final SpeedControllerGroup speedControllerGroupRight;
	private final WPI_TalonSRX leftTop;
	private final WPI_TalonSRX leftBottom;
	private final SpeedControllerGroup speedControllerGroupLeft;
	private final DifferentialDrive differentialDrive1;
	
	public Drive() {
		rightBottom = RobotMap.driverightBottom;
		rightTop = RobotMap.driverightTop;
		speedControllerGroupRight = RobotMap.driveSpeedControllerGroupRight;
		leftTop = RobotMap.driveleftTop;
		leftBottom = RobotMap.driveleftBottom;
		speedControllerGroupLeft = RobotMap.driveSpeedControllerGroupLeft;
		differentialDrive1 = RobotMap.driveDifferentialDrive1;
	}
	
	public void initDefaultCommand() {setDefaultCommand(new DriveRobot());}
	
	public void periodic() {}
	
	public void driveRobot(double leftSpeed, double rightSpeed) {
		differentialDrive1.tankDrive(leftSpeed, rightSpeed, false);
	}
	
}
