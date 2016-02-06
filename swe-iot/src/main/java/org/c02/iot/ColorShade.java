package org.c02.iot;

import java.io.IOException;

import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleApiWrapperImpl;
import org.c02.iot.cloud.api.ParticleException;
import org.c02.iot.cloud.examples.DemoConstants;

public class ColorShade {
	ParticleApiWrapper button = new ParticleApiWrapperImpl(DemoConstants.deviceId, DemoConstants.accessToken);
	//InternetButtonImpl internetbutton = new InternetButtonImpl(button);
	public enum ButtonDirection {
		// Button:
		//1     2      3     4
		North, South, East, West
	}
	int shadeOfRed;

	public String increaseRed(int pressed) throws IOException, ParticleException {

			
			if (shadeOfRed > 255) {
				shadeOfRed = 0;
			}
			if (pressed > 25){
				button.callMethod("reset",null);
				pressed = 0;
			}
			String blue = "000";
			String green = "000";
			int testred = pressed*10 + shadeOfRed;
			String red = String.format("%03d", pressed*10+shadeOfRed);
			
			String positionColor = ""+ red + green + blue;
			return positionColor;
		}

	}
