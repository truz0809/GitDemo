import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class javatest {

	public static void main(String[] args) {
		
	//array - fst method
		int[] arr1=new int[5];
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=3;
		arr1[3]=4;
		arr1[4]=5;
		
	//array 2nd method
		int arr2[]= {1,2,3,4,6};
		System.out.println(arr2[2]);
	
	//print values from array
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
			System.out.println(arr2[i]);
		}
		
		//string array
		String [] names = {"v","jk","army"};
		
		System.out.println("names " + names[1]);
		
		//enhanced for loop
		for( int n: arr1)
		{
			System.out.println(n);
		}
		
		int arr3[]= {1,2,3,4,5,6,7,8,9,10};
		
		for(int n1: arr3)
		{
			if(n1%2==0)
			{
				System.out.println(n1);
			}
		}
		System.out.println("---");
		
		//arraylist integer
		ArrayList aist= new ArrayList();
		aist.add(1);
		aist.add(2);
		System.out.print(aist.get(1));
		
		//arraylist string
		
		ArrayList<String> sarry= new ArrayList<String>();
		sarry.add("jk");
		sarry.add("v");
		//print
		for(int i1=0;i1< sarry.size(); i1++)
		{
			System.out.println(sarry.get(i1));
		}
		//enhanced for loop- don't need to give index
		
		for(String s2 : sarry)
		{
			System.out.println((s2));
		}
	
		// find element in array 
		System.out.print(sarry.contains("JM"));
		System.out.print(sarry.contains("v"));
		
		List<String> sarry2=Arrays.asList(names);
		System.out.println(sarry2.contains("jk"));
		System.out.println("---");		
		//Strings
		//Fst method of declartion 
		String str1="Hello this is BTS";
		//second method 
				
		String str2=new String("This is army $ how are you $ cool");
		
		//spilt the string 
		String [] splitstr=str1.split("this");
		for (String spilitstr1: splitstr)
		{
			System.out.println(spilitstr1.trim());
		}
		//print reverse string 
		
		for(int i3=str2.length()-1; i3>=0; i3--)
		{
			System.out.println(str2.charAt(i3));
		}
		
		//classes
		System.out.println("---------------");
		
		//creating objects of class
		javatest o1=new javatest();
		o1.method1();
		javatest o2=new javatest();
		String r1=o2.method2();
		System.out.println(r1);
		
		testclass1 o3=new testclass1();
		o3.method3();

		
	}
	
	
	public void method1()
	{
		System.out.println("method1");
	}
	
	public String method2()
	{
		System.out.println("method2");
		return "string method2";
	}
	
	
}
