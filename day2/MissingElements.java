package day2;

public class MissingElements {

	public static void main(String[] args) {
		int a[] = {1,4,3,2,8,6,7};
		int n = a.length+1;
		int sum = (n*(n+1))/2;
		for (int i = 0; i < a.length; i++) {
			sum = sum - a[i];
		}
		System.out.println("Missing Number is :"+sum);
		
}
}