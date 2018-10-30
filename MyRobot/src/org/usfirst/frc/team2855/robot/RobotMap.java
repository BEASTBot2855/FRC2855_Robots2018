/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2855.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	
	public static SpeedController intakeleftIntake;
	public static Solenoid intakeleftSolenoid;
	public static Solenoid intakerightSolenoid;
	public static DoubleSolenoid intakeleftDoubleSolenoid;
	public static DoubleSolenoid intakerightDoubleSolenoid;
	public static WPI_TalonSRX driverightBottom;
	public static WPI_TalonSRX driverightTop;
	public static SpeedControllerGroup driveSpeedControllerGroupRight;
	public static WPI_TalonSRX driveleftTop;
	public static WPI_TalonSRX driveleftBottom;
	public static SpeedControllerGroup driveSpeedControllerGroupLeft;
	public static DifferentialDrive driveDifferentialDrive1;
	public static DoubleSolenoid shiftershift1;
	public static Encoder elevatorelevatorencoder;
	public static SpeedController elevatorwinch;
	public static Preferences preferences;
	public static CameraServer camera;
	
	
	public static void init() {
		intakeleftIntake = new Spark(1);
		intakeleftSolenoid = new Solenoid(0, 2);
		intakerightSolenoid = new Solenoid(0, 3);
		intakeleftDoubleSolenoid = new DoubleSolenoid(0, 4, 5);
		intakerightDoubleSolenoid = new DoubleSolenoid(0, 6, 7);
		
		driverightBottom = new WPI_TalonSRX(2);
		driverightTop = new WPI_TalonSRX(1);
		driveSpeedControllerGroupRight = new SpeedControllerGroup(driverightTop, new SpeedController[] {driverightBottom});
		driveleftTop = new WPI_TalonSRX(3);
		driveleftBottom = new WPI_TalonSRX(4);
		driveSpeedControllerGroupLeft = new SpeedControllerGroup(driveleftTop, new SpeedController[] {driveleftBottom});
		driveDifferentialDrive1 = new DifferentialDrive(driveSpeedControllerGroupLeft, driveSpeedControllerGroupRight);
		driveDifferentialDrive1.setSafetyEnabled(true);
		driveDifferentialDrive1.setExpiration(0.1);
		driveDifferentialDrive1.setMaxOutput(1.0);
		
		shiftershift1 = new DoubleSolenoid(0, 0, 1);
		
		elevatorelevatorencoder = new Encoder(3, 2, false, EncodingType.k4X);
		elevatorelevatorencoder.setDistancePerPulse(1.0);
		elevatorelevatorencoder.setPIDSourceType(PIDSourceType.kRate);
		elevatorwinch = new Spark(0);
		elevatorwinch.setInverted(false);
		
		CameraServer.getInstance().startAutomaticCapture();
		
		preferences = Preferences.getInstance();
		
	}
	
}
