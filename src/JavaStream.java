import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class JavaStream {
		
	    
	public static void main(String[] args) {
		
		//count names start with A
		
			ArrayList<String> names = new ArrayList<String>();
			names.add("Abhijeet");
			names.add("Niranjan");
			names.add("Adam");
			names.add("Raj");
			names.add("Om");
			
//			int count=0;
//			for(int i=0;i>names.size();i++)
//			{
//				String actual = names.get(i);
//				if(actual.startsWith("A")) 
//				{
//					count++;
//				}
//				System.out.println(count);
//			}
			
			Long c = names.stream().filter(s->s.startsWith("A")).count();
			System.out.println(c);
			
			Stream.of("Abhi","Niranja","Adam","Raj","Oma");
			
//			Print all the names with length >4 from araayList
			
			names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
			names.stream().filter(s->s.length()<4).limit(1).forEach(s->System.out.println(s));
			
//			Print all names with ends letter a in uppercase
			
			Stream.of("Abhijeet","Niranjan","Adam","Raj","Oma").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			
//			Print all names with first letter a in sorted order
			
			List<String> names1 =  Arrays.asList("Abhijeet","Niranjan","Adam","Raj","Oma");
			
			names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			
//			Merging two different list
			
			Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
//			newStream.sorted().forEach(s->System.out.println(s));
			
//			To check text is present or not
			boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
			System.out.println(flag);
			Assert.assertTrue(flag);
			
//			Collect method
			
			List<String> ls = Stream.of("Abhijeet","Niranjan","Adam","Raj","Oma").map(s->s.toUpperCase())
					.collect(Collectors.toList());
			
			System.out.println(ls.get(1));
			
//			Print unique numbers
			
			List<Integer> values =  Arrays.asList(2,2,1,5,7,3,3,4);
			
			List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
			System.out.println(li.get(4));
		}
		
		
		
		

	}


