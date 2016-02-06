package org.c02.iot.app;

import java.awt.Color;

import org.c02.iot.InternetButtonImpl;
import org.c02.iot.cloud.api.ParticleApiWrapperImpl;

public class LedDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParticleApiWrapperImpl wrapper = new ParticleApiWrapperImpl("3a0040001347343432313031", "2a9b72a4491967cb19d2ba10b07c40cc662dadf8");
		InternetButtonImpl internetbutton = new InternetButtonImpl(wrapper);
		try {
			internetbutton.allLedsOff();
			int i = 0;
			internetbutton.setLed(i, Color.blue);
			i++;
			internetbutton.setLed(i, Color.red);
			i++;
			internetbutton.setLed(i, Color.green);
			i++;
			internetbutton.setLed(i, Color.white);
			i++;
			internetbutton.setLed(i, Color.yellow);
			i++;
			internetbutton.setLed(i, Color.orange);		
			i++;
			internetbutton.setLed(i, Color.magenta);
			i++;
			internetbutton.setLed(i, Color.cyan);
			i++;
			internetbutton.setLed(i, Color.pink);
			i++;
			internetbutton.setLed(i, Color.darkGray);
			i++;
			internetbutton.setLed(i, Color.gray);
			i++;
			internetbutton.setLed(i, Color.lightGray);
		} catch (Exception e) {
			System.out.println("Error, no sound played");
		}
	}

}
