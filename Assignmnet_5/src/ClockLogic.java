import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClockLogic {
	private DigitalGUI clockGUI;
	private int alarmHour;
	private int alarmMinute;
	
	
	public ClockLogic(DigitalGUI digitalGUI){
		this.clockGUI = digitalGUI;
		Thread t = new ClockThread();
		t.start();
		
		
	}
	
	public void setAlarm(int hours, int minute){
		this.alarmHour = hours;
		this.alarmMinute = minute;
	}
	
	public void clearAlarm(){
		this.alarmHour = -1;
		this.alarmMinute = -1;
	}
	
	public static String lookNice(int i){
		String s = String.valueOf(i);
		if(s.length()==1){
			s = "0"+s;
		}return s;
	}

	
	private class ClockThread extends Thread{
		
		public boolean running = true;
		
		
		@Override
		public void run(){
			while(running){
				Calendar rightNow = Calendar.getInstance();
				int hour = rightNow.get(Calendar.HOUR_OF_DAY);
				int minute = rightNow.get(Calendar.MINUTE);
				int second = rightNow.get(Calendar.SECOND);
			
				clockGUI.setTimeOnLabel(lookNice(hour)+ ":" + lookNice(minute) +":"+ lookNice(second));
				
				if(hour == alarmHour && minute == alarmMinute){
					clockGUI.activateAlarm(true);
				}
				try{ 
					Thread.sleep(900);
					
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				
			}
		}

	}

}
