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
			}
		} catch (Exception e) {
		System.out.println("Error");
		}
		
		
		
		
		
		

	}

}
