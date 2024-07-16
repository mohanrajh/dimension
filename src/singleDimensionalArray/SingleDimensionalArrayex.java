package singleDimensionalArray;

public class SingleDimensionalArrayex {

	public static void main(String[] args) {
		//Approach 1
		//Declare an array
		//int a[]=new int[5];
		//insert values
//		a[0]=100;
//		a[1]=200;
//		a[2]=300;
//		a[3]=400;
//		a[4]=500;
//		a[5]=600;
		
		//approach2
		int a[]= {10,20,30,40,50,60,70};
		//find size
		System.out.println(a.length);
		//Read single value from an array
		System.out.println(a[2]);
		
		//read multiple values
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//for each loop
		for(int x:a) {
			System.out.println(x);
		}
		
		




		

	}

}
