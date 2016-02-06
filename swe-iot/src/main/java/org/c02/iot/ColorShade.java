package org.c02.iot;

import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleException;

public class ColorShade {

	ParticleApiWrapper wrapper;
	int shadeOfRed = 0;

	public void increaseRed(int pressed) {

			if (shadeOfRed > 255) {
				shadeOfRed = 0;
			}

			String blue = "000";
			String green = "000";
			String red = String.format("%03d", pressed*10+shadeOfRed);
			String posit = "1";

			String positionColor = "" + posit + red + green + blue;

			try {
				wrapper.callMethod("led", positionColor);
			} catch (ParticleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			

		}

	}

}
