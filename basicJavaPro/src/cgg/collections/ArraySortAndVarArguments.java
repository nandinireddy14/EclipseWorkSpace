package cgg.collections;
import static java.lang.System.*;
import java.util.Arrays;

public class ArraySortAndVarArguments {

	public static void sort(String...arr)
	{
		Arrays.sort(arr);
		for(String a:arr)
		{
			out.println(a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
//		sort("Samsung","Nokia","RealMe","OnePlus","Apple","MI");
		String[] arr= {"Samsung","Nokia","RealMe","OnePlus","Apple","MI"};
		sort(arr);
	}

}
