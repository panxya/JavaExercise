package Delete;

import java.io.File;

public class DeleteDemo {
	public static void main(String[] args) {
		
		File scrfile = new File("d:\\aaa");
		
		DeleteFile(scrfile);
		
	}

	private static void DeleteFile(File scrfile) {
		// TODO Auto-generated method stub
		File[] fileArray = scrfile.listFiles();
		
		for(File file :fileArray) {
			if(file.isDirectory()) {
				DeleteFile(file);
			}else {
				System.out.println(file.getName()+"--"+file.delete());
			}
		}
		
		System.out.println(scrfile.getName()+"--"+scrfile.delete());
	}
}
