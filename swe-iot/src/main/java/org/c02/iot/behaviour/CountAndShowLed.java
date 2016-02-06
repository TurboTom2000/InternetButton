package org.c02.iot.behaviour;

import java.awt.Color;
import java.io.IOException;

import org.c02.iot.InternetButtonApi;
import org.c02.iot.InternetButtonApi.ButtonDirection;

public class CountAndShowLed extends AbstractBehaviour {

	public CountAndShowLed(InternetButtonApi buttonInstance) {
		super(buttonInstance);
		
	}

	@Override
	public void run() {
		int buttonCounter = button.getButtonCounter(ButtonDirection.North);
		button.setLed(buttonCounter, Color.GREEN);
		

		
	}

}
