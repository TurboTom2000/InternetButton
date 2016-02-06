package org.c02.iot;

import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleException;

public class ColorShade {

	ParticleApiWrapper wrapper;

	public void increaseRed() {

		for (int i = 0;; i = i + 10) {

			String blue = "000";
			String green = "000";
			String red = String.format("%03d", i);
			String posit = "1";

			String positionColor = "" + posit + red + green + blue;

			try {
				wrapper.callMethod("led", positionColor);
			} catch (ParticleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (i >= 255) {
				i = 0;
			}

		}

	}

}
