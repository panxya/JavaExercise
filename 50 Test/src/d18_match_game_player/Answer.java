package d18_match_game_player;
//���ڸ�����
import java.util.ArrayList;

public class Answer {

	public static void main(String[] args){
		String[] racer = {"x","y","z"};//�Ҷӳ�Ա
		ArrayList<Answer> arrayList = new ArrayList<Answer>();
		for(int i=0;i<3;i++)
		  for(int j=0;j<3;j++)
		    for(int k=0;k<3;k++){
		    	Answer prog18 = new Answer(racer[i],racer[j],racer[k]);
		    	if(!prog18.a.equals(prog18.b) && !prog18.a.equals(prog18.c) && !prog18.b.equals(prog18.c) &&
		    	   !prog18.a.equals("x") && !prog18.c.equals("x") && !prog18.c.equals("z"))
		    	   arrayList.add(prog18);
		    }
		  for(Object obj:arrayList)
		    System.out.println(obj);
	}
	String a,b,c;//�׶ӳ�Ա
	
	private Answer(String a,String b,String c){
		this.a = a;
		this.b = b ;
		this.c = c;
	}
	//���췽��
	
		public String toString(){
			return "a�Ķ�����"+a+"  "+"b�Ķ�����"+b+"  "+"c�Ķ�����"+c;
		}

}
