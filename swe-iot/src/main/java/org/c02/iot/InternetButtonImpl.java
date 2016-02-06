package org.c02.iot;

import java.awt.Color;
import java.io.IOException;

import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleException;

public class InternetButtonImpl implements InternetButtonApi {

	ParticleApiWrapper wrapper;
	

	public InternetButtonImpl(ParticleApiWrapper wrapperInstance) {
		wrapper = wrapperInstance;
	}

	public int getButtonCounter(ButtonDirection button) 
	{
		int b1 =0;
		int b2=0;
		try {
			b1 = wrapper.readVariable("countButton1");
			b2=b1%11;
			
			System.out.println("b1=" + b1 + " b2= " + b2);
			
			//System.out.println("Button 1: " + wrapper.readVariable("countButton1"));
//			System.out.println("Button 2: " + wrapper.readVariable("countButton2"));
//			System.out.println("Button 3: " + wrapper.readVariable("countButton3"));
//			System.out.println("Button 4: " + wrapper.readVariable("countButton4"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return b2;
	}

	public void setLed(int postition, Color color) {
		
		
		
		String blue = String.format("%03d", color.getBlue());
		String green = String.format("%03d", color.getGreen());
		String red = String.format("%03d", color.getRed());
	    String posit = String.format("%02d", postition);
		
		
		String positionColor = ""+posit+red+green+blue;
		
		
		try {
			wrapper.callMethod("led",positionColor);
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

	public void resetButtonCounters() 
	{
		
		try {
			System.out.println("Button 1: " + wrapper.readVariable("countButton1"));
			System.out.println("Button 2: " + wrapper.readVariable("countButton2"));
			System.out.println("Button 3: " + wrapper.readVariable("countButton3"));
			System.out.println("Button 4: " + wrapper.readVariable("countButton4"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


		try {
			wrapper.callMethod("reset",null);
		} catch (ParticleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

}
