package rename;

//��-����-����  [I]���س���.������.20��������С˵100ǿ.089.�ö����
import java.io.File;

public class renameDemo {
	public static void main(String[] args) {
		File file = new File("D:\\book\\20��������С˵100ǿ  mobi");
		File[] ff = file.listFiles();
		
		for(File f:ff) {
			String name = f.getName();
			
			String a = "��";
			
			int startIndex = name.indexOf("]");
			int endIndex = name.indexOf("��");
			String bookName = name.substring(startIndex+1,endIndex);
			
			int endIndex2 = name.indexOf("20����");
			String creatorName = name.substring(endIndex+2,endIndex2-1);
			
			int endIndex3 = name.lastIndexOf("��");
			String lastString = name.substring(endIndex3+1);
			
			String newName = a.concat(bookName)
					.concat("��").concat(creatorName).concat(lastString);
			
			System.out.println(newName);
			
//			File newFile = new File(file,newName);
//			
//			f.renameTo(newFile);
		}
		
	}
}
