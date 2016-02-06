package org.c02.iot;

import java.awt.Color;

import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleException;

public class InternetButtonImpl implements InternetButtonApi {

	ParticleApiWrapper wrapper;
	

	public InternetButtonImpl(ParticleApiWrapper wrapperInstance) {
		wrapper = wrapperInstance;
	}

	public int getButtonCounter(ButtonDirection button) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setLed(int postition, Color color) {
		
		try {
			wrapper.callMethod("led","01255255255");
		} catch (ParticleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wrapper.callMethod("led","05255000000");
		} catch (ParticleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wrapper.callMethod("led","06000255000");
		} catch (ParticleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wrapper.callMethod("led","07000000255");
		} catch (ParticleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wrapper.callMethod("led","11000255255");
		} catch (ParticleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

	public void allLedsOff() {
		
		try {
			wrapper.callMethod("ledsOff",null);
		} catch (ParticleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	public void playSound() 
	{
		
		try 
		{
			wrapper.callMethod("play", null);
		} 
		catch (ParticleException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

	public void resetButtonCounters() {
		// TODO Auto-generated method stub
		
	}

}
