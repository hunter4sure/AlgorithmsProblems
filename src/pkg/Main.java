package pkg;

public class Main {

	static int[] data = { 12, 13, 15, 34, 55, 66, 78, 87 };

	public static void main(String[] args) {
	doesPairExist(99);
		
		//System.out.println(binarySearch(15));
	}

	public static void doesPairExist(int sum) {

		int start = 0;
		int max = data.length - 1;
		

		while ( max >= start) {
			
			int comp;
			
			comp = sum - data[start] ;
			
			if (data[start] + binarySearch(comp) != sum)start ++;
			
			else {

				System.out.println(data[start] + " + " + comp + " = " + sum);
				start = max + 1;
			}
		}
		

	}

	public static int binarySearch(int value) {

		int high= data.length -1;
		int low =0;
		
		while(low<=high){
		int m = (high + low)/2;
		
		if(data[m]<value)low = m +1;
		else if(data[m]>value) high = m-1;
		else{
			value = data[m];
			
			low=high +1;
			return value;
		}		
		}
		return 0;
		

	}

}
