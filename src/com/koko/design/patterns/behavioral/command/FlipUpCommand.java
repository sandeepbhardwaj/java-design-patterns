package com.koko.design.patterns.behavioral.command;

/** The Command for turning on the light - ConcreteCommand #1 */
public class FlipUpCommand implements Command {
	private Light theLight;

	public FlipUpCommand(final Light light) {
		this.theLight = light;
	}

	@Override // Command
	public void execute() {
		theLight.turnOn();
	}
}
