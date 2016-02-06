package org.c02.iot.app;

import org.c02.iot.ColorShade;
import org.c02.iot.InternetButtonImpl;
import org.c02.iot.cloud.api.ParticleApiWrapperImpl;

public class ColorDemoApp {

	public static void main(String[] args) {
		
		ParticleApiWrapperImpl wrapper = new ParticleApiWrapperImpl("3a0040001347343432313031", "2a9b72a4491967cb19d2ba10b07c40cc662dadf8");
		InternetButtonImpl internetbutton = new InternetButtonImpl(wrapper);
		try {
			while(true){
			internetbutton.setLedByButtonPress(1);
			internetbutton.setLedByButtonPress(2);
			internetbutton.setLedByButtonPress(3);
			internetbutton.setLedByButtonPress(4);
			internetbutton.setLedByButtonPress(5);
			internetbutton.setLedByButtonPress(6);
			internetbutton.setLedByButtonPress(7);
			internetbutton.setLedByButtonPress(8);
			internetbutton.setLedByButtonPress(9);
			internetbutton.setLedByButtonPress(10);
			internetbutton.setLedByButtonPress(11);
			}
		} catch (Exception e) {
		System.out.println("Error");
		}
		
		
		
		
		
		

	}

}
