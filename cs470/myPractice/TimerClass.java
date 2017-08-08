package myPractice;

import java.util.Timer;
import java.util.TimerTask;

public class TimerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();
		
		//arg1 is delay and arg2 is period
		timer.scheduleAtFixedRate(new TimerTask(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("hi");
			}
			
		}, 3*1000, 3*1000);
		
		

	}
	

}
