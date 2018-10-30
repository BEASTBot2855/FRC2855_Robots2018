/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2855.robot;

import org.usfirst.frc.team2855.robot.commands.AutoElevatorUp;
import org.usfirst.frc.team2855.robot.commands.AutoForward;
import org.usfirst.frc.team2855.robot.commands.AutoLeft;
import org.usfirst.frc.team2855.robot.commands.AutoLeftScale;
import org.usfirst.frc.team2855.robot.commands.AutoMiddle;
import org.usfirst.frc.team2855.robot.commands.AutoRight;
import org.usfirst.frc.team2855.robot.commands.AutoRightScale;
import org.usfirst.frc.team2855.robot.commands.AutoTurnLeft;
import org.usfirst.frc.team2855.robot.commands.AutoTurnRight;
import org.usfirst.frc.team2855.robot.commands.CommandGroupScaleLeft;
import org.usfirst.frc.team2855.robot.commands.CommandGroupScaleRight;
import org.usfirst.frc.team2855.robot.commands.CommandGroupSwitchLeft;
import org.usfirst.frc.team2855.robot.commands.CommandGroupSwitchRight;
import org.usfirst.frc.team2855.robot.commands.ConditionalCommand1;
import org.usfirst.frc.team2855.robot.commands.DontDrive;
import org.usfirst.frc.team2855.robot.commands.DriveRobot;
import org.usfirst.frc.team2855.robot.commands.EjectCube;
import org.usfirst.frc.team2855.robot.commands.ElevatorDown;
import org.usfirst.frc.team2855.robot.commands.ElevatorUp;
import org.usfirst.frc.team2855.robot.commands.FalseComm;
import org.usfirst.frc.team2855.robot.commands.GrabCube;
import org.usfirst.frc.team2855.robot.commands.InsertCube;
import org.usfirst.frc.team2855.robot.commands.LRLForwardSwitch;
import org.usfirst.frc.team2855.robot.commands.LeftArrangementCheck;
import org.usfirst.frc.team2855.robot.commands.LeftArrangementCheckScale;
import org.usfirst.frc.team2855.robot.commands.MiddleArrangementCheck;
import org.usfirst.frc.team2855.robot.commands.ReleaseCube;
import org.usfirst.frc.team2855.robot.commands.RightArrangementCheck;
import org.usfirst.frc.team2855.robot.commands.RightArrangementCheckScale;
import org.usfirst.frc.team2855.robot.commands.ScaleElevatorLift;
import org.usfirst.frc.team2855.robot.commands.ScaleForwardAfterRight;
import org.usfirst.frc.team2855.robot.commands.SetToFast;
import org.usfirst.frc.team2855.robot.commands.SetToOff;
import org.usfirst.frc.team2855.robot.commands.SetToSlow;
import org.usfirst.frc.team2855.robot.commands.ShiftGearboxes;
import org.usfirst.frc.team2855.robot.commands.ShouldWeScaleLeft;
import org.usfirst.frc.team2855.robot.commands.ShouldWeScaleRight;
import org.usfirst.frc.team2855.robot.commands.SwitchMiddleLeft;
import org.usfirst.frc.team2855.robot.commands.SwitchMiddleRight;
import org.usfirst.frc.team2855.robot.commands.TrueComm;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	
	public JoystickButton shiftSlowButton5;
	public JoystickButton elevatorUpButton3;
	public JoystickButton elevatorDownButton2;
	public JoystickButton insertCubeButton1;
	public JoystickButton shiftFastButton4;
	public Joystick attack3 = new Joystick(0);
	public JoystickButton shiftFastButton3;
	public JoystickButton shiftSlowButton4;
	public JoystickButton ejectCubeButton1;
	public JoystickButton releaseCubeButton2;
	public Joystick extreme3dpro = new Joystick(1);
	public JoystickButton ejectCubeButtonR2;
	public JoystickButton releaseCubeButtonR1;
	public JoystickButton insertCubeButtonL2;
	public JoystickButton releaseCubeButtonL1;
	public JoystickButton elevatorUpButtonX;
	public JoystickButton elevatorUpButtonY;
	public JoystickButton elevatorDownButtonB;
	public JoystickButton elevatorDownButtonA;
	
	public Joystick xbox = new Joystick(2);
	
	public OI() {
		elevatorDownButtonA = new JoystickButton(xbox, 2);
		elevatorDownButtonA.whileHeld(new SetToSlow());
		
		elevatorDownButtonB = new JoystickButton(xbox, 3);
		elevatorDownButtonB.whileHeld(new ElevatorDown());
		
		elevatorUpButtonY = new JoystickButton(xbox, 4);
		elevatorUpButtonY.whileHeld(new ElevatorUp());
		
		elevatorUpButtonX = new JoystickButton(xbox, 1);
		elevatorUpButtonX.whileHeld(new SetToFast());
		
		releaseCubeButtonL1 = new JoystickButton(xbox, 5);
		releaseCubeButtonL1.whileHeld(new ReleaseCube());
		
		insertCubeButtonL2 = new JoystickButton(xbox, 7);
		insertCubeButtonL2.whileHeld(new InsertCube());
		
		releaseCubeButtonR1 = new JoystickButton(xbox, 6);
		releaseCubeButtonR1.whileHeld(new ReleaseCube());
		
		ejectCubeButtonR2 = new JoystickButton(xbox, 8);
		ejectCubeButtonR2.whileHeld(new EjectCube());
		
		
		releaseCubeButton2 = new JoystickButton(extreme3dpro, 2);
		releaseCubeButton2.whileHeld(new ReleaseCube());
		
		ejectCubeButton1 = new JoystickButton(extreme3dpro, 1);
		ejectCubeButton1.whileHeld(new EjectCube());
		
		shiftSlowButton4 = new JoystickButton(extreme3dpro, 4);
		shiftSlowButton4.whenPressed(new SetToSlow());
		
		shiftFastButton3 = new JoystickButton(extreme3dpro, 3);
		shiftFastButton3.whenPressed(new SetToFast());
		
		
		shiftFastButton4 = new JoystickButton(attack3, 4);
		shiftFastButton4.whenPressed(new SetToFast());
		
		insertCubeButton1 = new JoystickButton(attack3, 1);
		insertCubeButton1.whileHeld(new InsertCube());
		
		elevatorDownButton2 = new JoystickButton(attack3, 2);
		elevatorDownButton2.whileHeld(new ElevatorDown());
		
		elevatorUpButton3 = new JoystickButton(attack3, 3);
		elevatorUpButton3.whileHeld(new ElevatorUp());
		
		shiftSlowButton5 = new JoystickButton(attack3, 5);
		shiftSlowButton5.whenPressed(new SetToSlow());
		
		
		SmartDashboard.putData("Auto Middle", new AutoMiddle());
		SmartDashboard.putData("Auto Left Scale", new AutoLeftScale());
		SmartDashboard.putData("Auto Right Scale", new AutoRightScale());
		SmartDashboard.putData("Auto Left", new AutoLeft());
		SmartDashboard.putData("Auto Right", new AutoRight());
		SmartDashboard.putData("Middle Arrangement Check", new MiddleArrangementCheck());
		SmartDashboard.putData("Left Arrangement Check Scale", new LeftArrangementCheckScale());
		SmartDashboard.putData("Right Arrangement Check Scale", new RightArrangementCheckScale());
		SmartDashboard.putData("Left Arrangement Check", new LeftArrangementCheck());
		SmartDashboard.putData("Right Arrangement Check", new RightArrangementCheck());
		SmartDashboard.putData("CommandGroupSwitchLeft", new CommandGroupSwitchLeft());
		SmartDashboard.putData("CommandGroupSwitchRight", new CommandGroupSwitchRight());
		SmartDashboard.putData("ShouldWeScaleLeft", new ShouldWeScaleLeft());
		SmartDashboard.putData("ShouldWeScaleRight", new ShouldWeScaleRight());
		SmartDashboard.putData("Switch Middle Left", new SwitchMiddleLeft());
		SmartDashboard.putData("Switch Middle Right", new SwitchMiddleRight());
		SmartDashboard.putData("CommandGroupScaleLeft", new CommandGroupScaleLeft());
		SmartDashboard.putData("CommandGroupScaleRight", new CommandGroupScaleRight());
		SmartDashboard.putData("Auto Forward: Auto Line", new AutoForward(1.0));
		SmartDashboard.putData("Auto Forward: toScale", new AutoForward(0.0));
		SmartDashboard.putData("AutoTurnLeft: towardSwitch", new AutoTurnLeft(0.0));
		SmartDashboard.putData("AutoTurnRight: towardSwitch", new AutoTurnRight(0.0));
		SmartDashboard.putData("ScaleElevatorLift", new ScaleElevatorLift());
		SmartDashboard.putData("ScaleForwardAfterRight", new ScaleForwardAfterRight());
		SmartDashboard.putData("Drive Robot", new DriveRobot());
		SmartDashboard.putData("Conditional Command 1", new ConditionalCommand1());
		SmartDashboard.putData("True Comm", new TrueComm());
		SmartDashboard.putData("False Comm", new FalseComm());
		SmartDashboard.putData("ShiftGearboxes", new ShiftGearboxes());
		SmartDashboard.putData("SetToSlow", new SetToSlow());
		SmartDashboard.putData("SetToFast", new SetToFast());
		SmartDashboard.putData("SetToOff", new SetToOff());
		SmartDashboard.putData("ElevatorDown", new ElevatorDown());
		SmartDashboard.putData("ElevatorUp", new ElevatorUp());
		SmartDashboard.putData("InsertCube", new InsertCube());
		SmartDashboard.putData("EjectCube", new EjectCube());
		SmartDashboard.putData("ReleaseCube", new ReleaseCube());
		SmartDashboard.putData("GrabCube", new GrabCube());
		SmartDashboard.putData("LRL Forward Switch: Drive to Switch", new LRLForwardSwitch(1.0));
		SmartDashboard.putData("AutoElevatorUp: dropHeight", new AutoElevatorUp(1.0));
		SmartDashboard.putData("dontDrive", new DontDrive());
	}
	
	public Joystick getattack3() {return attack3;}
	
	public Joystick getextreme3dpro() {return extreme3dpro;}
	
	public Joystick getxbox() {return xbox;}
	
}
