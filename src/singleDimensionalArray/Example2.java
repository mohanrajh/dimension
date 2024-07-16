package singleDimensionalArray;

public class Example2 {

	public static void main(String[] args) {
		int a[][]= {{10,20,30,100},{40,50,60,200},{70,80,90,300}};
		
		for(int x=0;x<a.length;x++) {
			for(int y=0;y<a[x].length;y++){
				System.out.println(a[x][y]+"");
				
			}
			System.out.println();
		
		}
 
	}

}
