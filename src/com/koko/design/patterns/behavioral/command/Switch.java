package com.koko.design.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/** The Invoker class */
public class Switch {
	private List<Command> history = new ArrayList<Command>();

	public void storeAndExecute(final Command cmd) {
		this.history.add(cmd); // optional
		cmd.execute();
	}
}