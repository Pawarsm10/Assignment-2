package Assignment02;

public class SubsetOfArray {

	public static void main(String[] args) {
		
		int [] a= {9,4,5};
		int [] b= {1,2,3,4,5,6,7,8,9};
		int count=0;
		System.out.println("Child array: {9,4,5}");
		System.out.println("Parent array: {1,2,3,4,5,6,7,8,9}");
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<b.length;j++)
			{
				if (a[i]==b[j])
				{
					count++;
				}
			}
		}
		if (count==a.length) {
			System.out.println("Array a is subset of array b");
		}
		else {
			System.out.println("Array a is not subset of array b");

		}
		
    }

}
