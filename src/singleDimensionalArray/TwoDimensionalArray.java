package singleDimensionalArray;

public class TwoDimensionalArray {

	public static void main(String[] args) {

//		int a[][]=new int[2][2];
//		a[0][0]=[1][2];
//		a[][]=
				
				int a[][]= {{10,20,100},{30,40,200},{50,60,300}};
		
		//find size
				System.out.println("no.of.row"+a.length);
				System.out.println("no.of columns"+a[0].length);
				System.out.println(a[1][1]);
		//read multiple values:
		//nested for..loop
			
				for(int r=0;r<a.length;r++){//outer for loop
					for(int c=0;c<a[r].length;c++) {
						System.out.println(a[r][c]+" ");
						
					}
					System.out.println();
				}
	}

}
