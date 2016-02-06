package org.c02.iot;

import org.c02.iot.cloud.api.ParticleApiWrapperImpl;

public class ButtonCounterDemo 
{	
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			ParticleApiWrapperImpl wrapper = new ParticleApiWrapperImpl("3a0040001347343432313031", "2a9b72a4491967cb19d2ba10b07c40cc662dadf8");
			InternetButtonImpl internetbutton = new InternetButtonImpl(wrapper);
			
			
			internetbutton.resetButtonCounters();
		}	// TODO Auto-generated method stub

	}


