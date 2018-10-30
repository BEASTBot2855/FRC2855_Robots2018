package org.usfirst.frc.team2855.robot.commands;

import edu.wpi.first.wpilibj.command.ConditionalCommand;

public class ConditionalCommand1 extends ConditionalCommand {

	public ConditionalCommand1() { super(new TrueComm(), new FalseComm()); }
	
	protected boolean condition() { return false; }
	
}
