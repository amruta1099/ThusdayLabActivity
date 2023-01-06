package question2;
import java.util.Iterator;
import java.util.Iterator;

public class statesMain {

	public static void main(String[] args) {
		State a=new State();
		a.addState("tenlgana");			
		a.addState("kerla");
		a.addState("Karnataka");
		a.addState("tamilnadu");
		
		System.out.println("Retrive the details of state:"+a.retriveState("Maharashtra"));		 

	}

}