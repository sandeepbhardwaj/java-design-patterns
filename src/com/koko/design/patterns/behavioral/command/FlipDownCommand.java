package com.koko.design.patterns.behavioral.command;

/** The Command for turning off the light - ConcreteCommand #2 */
public class FlipDownCommand implements Command {
	private Light theLight;

	public FlipDownCommand(final Light light) {
		this.theLight = light;
	}

	@Override // Command
	public void execute() {
		theLight.turnOff();
	}
}
