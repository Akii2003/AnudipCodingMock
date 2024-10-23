package mockCoding;

public class SumofElement {
	
	//Created a method CalSum which take parameter an integer array
	public static int CalSum(int arr[]) {
		//initalize sum =0 to calculate value of element present at even indices
		int sum=0;
		//for loop to traverse array
		for(int i=0;i<arr.length;i++) {
			//checking whether index is even or not
			if(i%2==0) {
				sum+=arr[i]; //if ture then value of element is added to the sum
			}
		}
		return sum;//return sum as answer
		// here 0 index is consider even in this  code
		// we can return sum-arr[0] to return sum which do not include element at index 0 in summ
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[7];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
		
		System.out.println(CalSum(arr));

	}

}
