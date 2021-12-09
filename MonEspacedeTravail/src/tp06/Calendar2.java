package tp06;

import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar2 extends GregorianCalendar {
	public boolean cours;
	
	public void creation() { 
		if (this.get(Calendar.HOUR_OF_DAY)<12 
			&& (this.get(Calendar.HOUR_OF_DAY)>9
			&& this.get(Calendar.MINUTE)>30)) {
			this.cours = true;
		}
 	this.cours = false;
 	}

		public void afficher() {
			Date trialTime = new Date();
			Date courante = new Date();
			System.out.println(courante);
}
		public void duree() {
			Calendar calendar=new GregorianCalendar();
			int Secondes=(calendar.get(calendar.HOUR)-this.get(calendar.HOUR))*60*60+
					(calendar.get(calendar.MINUTE)-this.get(calendar.MINUTE))*60+
					calendar.get(calendar.SECOND)-this.get(calendar.SECOND);
			System.out.println(Secondes);
		}
}