package rename;

//书-作者-排名  [I]尹县长▲.陈若曦.20世纪中文小说100强.089.好读书柜
import java.io.File;

public class renameDemo {
	public static void main(String[] args) {
		File file = new File("D:\\book\\20世纪中文小说100强  mobi");
		File[] ff = file.listFiles();
		
		for(File f:ff) {
			String name = f.getName();
			
			String a = "《";
			
			int startIndex = name.indexOf("]");
			int endIndex = name.indexOf("▲");
			String bookName = name.substring(startIndex+1,endIndex);
			
			int endIndex2 = name.indexOf("20世纪");
			String creatorName = name.substring(endIndex+2,endIndex2-1);
			
			int endIndex3 = name.lastIndexOf("柜");
			String lastString = name.substring(endIndex3+1);
			
			String newName = a.concat(bookName)
					.concat("》").concat(creatorName).concat(lastString);
			
			System.out.println(newName);
			
//			File newFile = new File(file,newName);
//			
//			f.renameTo(newFile);
		}
		
	}
}
