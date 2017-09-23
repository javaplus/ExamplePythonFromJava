package com.barry.pi_timer;

import org.junit.Test;

public class TimerTest{

    @Test
    public void testTimer() throws Exception{

        Timer timer = new Timer();
        try {
            timer.callDisplay("Hey There");    
        } catch (Exception e) {
            e.printStackTrace();
        }
		
        
    }

}