import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,122};
		
		for(int i =0; i<arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.println(arr[i]);
				break;
			}
			
			else
			{
				System.out.println(arr[i] +"not valid");
			}
		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Niranjan");
		a.add("Andhale");
		a.add("Selenium");
		System.out.println(a.get(1));
		
		for(int i=0; i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("*************");
		
		for(String val :a)
		{
			System.out.println(val);
		}
		
		System.out.println(a.contains("Selenium"));
		String[] name = {"Niranjan", "Andhale","Selenium"};
		List<String> nameArrayList = Arrays.asList(name);
		nameArrayList.contains("Selenium");
		
		System.out.println("********");
		for(int i=0; i<a.size();i++) 
		{
			System.out.println(nameArrayList.get(i));
		}
		

	}

}
