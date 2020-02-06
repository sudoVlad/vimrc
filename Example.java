package ex;

import java.util.List;

public class Example{
	public static void main(String[] args){
		//variable declaration
		List<Integer> lst = 
			new ArrayList<Integer>(Arrays.asList(4,8,15,23,32));
	
		//null check for lst
		//(a) yes
		Iterator<Integer> it = lst.iterator();
		//(b) no, this is how you get a null pointer exception

		//iterate through list
		while(it.hasNext()){
			var element = it.next();
			//null check for element
			//(a) yes
			element.equals();		
			//(b) no, (see above)
		}
	}
}
