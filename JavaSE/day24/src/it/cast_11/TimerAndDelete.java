package it.cast_11;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerAndDelete {
	public static void main(String[] args) throws ParseException {
		Timer r = new Timer();
		String s = "2018-11-25 17:20:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(s);
		r.schedule(new DelectFolder(), d);
				
	}
}



class DelectFolder extends TimerTask{
	
	public void run() {
		File scrFolder = new File("test");
		deleteFolder(scrFolder);
	}

	private void deleteFolder(File scrFolder) {
		File[] fileArr = scrFolder.listFiles();
		if(fileArr != null) {
			for(File file :fileArr) {
				if(file.isDirectory()) {
					deleteFolder(file);
				}else {
					System.out.println(file.getName() + ":" + file.delete());
				}
			
			}
			System.out.println(scrFolder.getName() + ":" + scrFolder.delete());
		}
		
	}
	
}

