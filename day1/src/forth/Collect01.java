package forth;

import java.util.ArrayList;
import java.util.List;

public class Collect01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("사과");//0
		list.add("바나나");//add 추가한 순서대로 순서 부여된다. //1
		list.add("귤");//2
		list.add("오렌지");//3
		list.add("바나나");//4

		list.set(2, "포도"); 
		list.remove(2);
		
		for (String element : list)
			System.out.print(element + "\t");
			System.out.println();
		
		
		for(int i=0; i< list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
	}

}
