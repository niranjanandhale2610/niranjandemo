
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		
		int MyNum = 7;
		
		String Name = "Niranjan";
		
		char letter = 'r';

		double dec = 5.99;

		boolean myCard = true;
		
		System.out.println(MyNum+"is Lucky number");
		
		//Array
		
		int[] arr1 = new int[5];
		
		arr1[0] = 1;

		arr1[1] = 2;

		arr1[2]= 4;

		arr1[3]= 5;

		arr1[4]= 6;
		
		int[] arr2 = {1,2,3,4};
		
		System.out.println(arr2[1]);
		
//		for(int i = 0; i< arr1.length; i++) //4
//
//		{
//
//		System.out.println(arr1[i]);
//
//		}

		for (int i =0;i<arr2.length; i++)

		{

		System.out.println(arr2[i]);

		}
		
		String[] name = {"Niranjan", "Andhale","Selenium"};
//		
//		for(int i=0; i<name.length;i++)
//		{
//			System.out.println(name[i]);
//		}
		
		for(String n: name)
		{
			System.out.println(n);
		}

	}

}
