package org.c02.iot;

import org.c02.iot.behaviour.CountAndShowLed;
import org.c02.iot.cloud.api.ParticleApiWrapperImpl;
import org.c02.iot.cloud.api.ParticleException;

public class ButtonCounterDemo 
{	
		public static void main(String[] args) throws InterruptedException 
		{
			// TODO Auto-generated method stub
			ParticleApiWrapperImpl wrapper = new ParticleApiWrapperImpl("3a0040001347343432313031", "2a9b72a4491967cb19d2ba10b07c40cc662dadf8");
			InternetButtonImpl internetbutton = new InternetButtonImpl(wrapper);
			CountAndShowLed countandshowledclass = new CountAndShowLed(internetbutton);
			
			try 
			{
				wrapper.callMethod("reset",null);
				internetbutton.allLedsOff();
			} catch (ParticleException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			while (true)
			{
				
				Thread.sleep(500);
				internetbutton.allLedsOff();
				
				countandshowledclass.run();
			}
//			internetbutton.resetButtonCounters();
//			internetbutton.getButtonCounter(1);
//		
		}	// TODO Auto-generated method stub

	}


