/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2855.robot;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team2855.robot.commands.AutoLeft;
import org.usfirst.frc.team2855.robot.commands.AutoLeftScale;
import org.usfirst.frc.team2855.robot.commands.AutoMiddle;
import org.usfirst.frc.team2855.robot.commands.AutoRight;
import org.usfirst.frc.team2855.robot.commands.AutoRightScale;
import org.usfirst.frc.team2855.robot.commands.CommandGroupScaleLeft;
import org.usfirst.frc.team2855.robot.commands.CommandGroupScaleRight;
import org.usfirst.frc.team2855.robot.commands.CommandGroupSwitchLeft;
import org.usfirst.frc.team2855.robot.commands.CommandGroupSwitchRight;
import org.usfirst.frc.team2855.robot.subsystems.Drive;
import org.usfirst.frc.team2855.robot.subsystems.Elevator;
import org.usfirst.frc.team2855.robot.subsystems.Intake;
import org.usfirst.frc.team2855.robot.subsystems.IntakeMotor;
import org.usfirst.frc.team2855.robot.subsystems.Shifter;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends TimedRobot {	

	Command autonomousCommand;
	public static OI oi;
	public static Intake intake;
	public static IntakeMotor intakeMotor;
	public static Drive drive;
	public static Shifter shifter;
	public static Elevator elevator;
	public static UsbCamera usbcam;
	
	SendableChooser<Command> m_chooser = new SendableChooser<>();

	


	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		RobotMap.init();
		intake = new Intake();
		intakeMotor = new IntakeMotor();
		drive = new Drive();
		shifter = new Shifter();
		elevator = new Elevator();
		UsbCamera camera = CameraServer.getInstance().startAutomaticCapture();
		oi = new OI();
		m_chooser.addDefault("Auto Middle", new AutoMiddle());
		m_chooser.addObject("Auto Left", new AutoLeft());
		m_chooser.addObject("Auto Right", new AutoRight());
		m_chooser.addObject("Auto Scale Left", new AutoLeftScale());
		m_chooser.addObject("Auto Scale Right", new AutoRightScale());
		m_chooser.addObject("Auto Scale Preset Left", new CommandGroupScaleLeft());
		m_chooser.addObject("Auto Scale Preset Right", new CommandGroupScaleRight());
		m_chooser.addObject("Auto Switch Left", new CommandGroupSwitchLeft());
		m_chooser.addObject("Auto Switch Right", new CommandGroupSwitchRight());
		
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * <p>You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		autonomousCommand = m_chooser.getSelected();

		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */

		// schedule the autonomous command (example)
		if (autonomousCommand != null) {
			autonomousCommand.start();
		}
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (autonomousCommand != null) {
			autonomousCommand.cancel();
		}
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}
