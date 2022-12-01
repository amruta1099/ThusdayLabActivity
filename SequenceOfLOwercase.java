package Question2;
import java.util.Scanner;

	public class SequenceOfLOwercase {

			   public static void main(String[] args) {
				   
				    System.out.println(validate("java_Pratices"));
					System.out.println(validate("Java_pratices"));
					System.out.println(validate("java_pratices"));		
					System.out.println(validate("Java_pratices"));	
			        }

			   public static String validate(String text) {
				   if (text.matches("^[a-z]+_[a-z]+$"))
			                return "match";
			       else
			                return "Not matched!";
			   }
			}

		