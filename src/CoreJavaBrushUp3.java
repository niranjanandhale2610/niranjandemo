
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		
		//String is object //string literal
		String s1 = "Niranjan Laxman Andhale123";
		
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String s = "Niranjan Laxman Andhale";
		String[] splitted = s.split("Laxman");
		System.out.println(splitted[0]);
		System.out.println(splitted[1]);
		System.out.println(splitted[1].trim());
		for(int i=s.length()-1; i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}

	}

}
