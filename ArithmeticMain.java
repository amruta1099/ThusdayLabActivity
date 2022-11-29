package Com.Question2;

public class ArithmeticMain {

	public static void main(String[] args) {
        Adder a = new Adder();
        
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());  
        
        System.out.print(a.add(60,35) + " " + a.add(59,60) + " " + a.add(25,40) + "\n");
	}

}
