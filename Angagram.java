import java.util.*;
public class Angagram
 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter two words : ");
		String a = s.nextLine();
		String b = s.nextLine();
		boolean f = true;
		
		if(a.length() != b.length())
			f =false;
		else
		{
		  char c[] = a.toCharArray();
		  char d[] = b.toCharArray();
		  Arrays.sort(c);
		  Arrays.sort(d);
		  f =  Arrays.equals(c, d);
		}
         if(f)
        	 System.out.println("Anagram");
         else
        	 System.out.println("Not Anagram");
	}

}
