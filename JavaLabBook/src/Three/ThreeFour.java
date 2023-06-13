package Three;

import java.util.Arrays;

public class ThreeFour {

	public static void sort(String...arr)
	{
		Arrays.sort(arr);
		for(String a:arr)
		{
			System.out.println(a);
		}
	}
	
	public static void main(String[] args){
//		String arr[]={"Samsung","Nokia","RealMe","OnePlus","Apple","MI"};
//		System.out.println(Arrays.toString(arr));
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		sort("Samsung","Nokia","RealMe","OnePlus","Apple","MI");
	}
}
