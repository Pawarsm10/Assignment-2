package Assignment02;

public class BubbleSort {
public static void main(String[] args) {
		
		int []ar = {3,5,2,6,4,1,9,7,8};
		
		for(int i=0;i<ar.length;i++)

		{	
		for(int j=1;j<ar.length-i;j++)
			
		{
			if(ar[j]<ar[j-1])
			{
				int tempvar=ar[j];
				ar[j]=ar[j-1];
				ar[j-1]=tempvar;
				
			}
		}
		}
		System.out.println("Given Array : {3,5,2,6,4,1,9,7,8}");
		System.out.print("Sorted Array :");
		for (int e:ar)
		{
			System.out.print(e+" ");
		}

  }
}
