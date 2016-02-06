package org.c02.iot;

import java.io.IOException;

import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleApiWrapperImpl;
import org.c02.iot.cloud.api.ParticleException;
import org.c02.iot.cloud.examples.DemoConstants;

public class ColorShade {

	ParticleApiWrapper wrapper;
	String shadeOfRed = "0";

	public String increaseRed() throws IOException {
			ParticleApiWrapper button = new ParticleApiWrapperImpl(DemoConstants.deviceId, DemoConstants.accessToken);
			if (shadeOfRed.equals("255")) {
				shadeOfRed = "0";
			}
			int pressed = button.readVariable("countButton1");
			if (pressed > 25){
				pressed = 0;
			}
			String blue = "000";
			String green = "000";
			String red = String.format("%03d", pressed*10+shadeOfRed);
			String posit = "1";
			String positionColor = "" + posit + red + green + blue;
			return positionColor;
		}

	}
