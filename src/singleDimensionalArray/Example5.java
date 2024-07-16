package singleDimensionalArray;

public class Example5 {

	public static void main(String[] args) {
		
		int a[][]= {{10,20,30,100},{40,50,60,200},{70,80,90,300},{100,110,120,400}};
		
		System.out.println("no.of rows"+a.length);
		System.out.println("no.of column"+a[0].length);
		
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a[r].length;c++){
					System.out.print(a[r][c]+" ");
					}
			System.out.println();
			}
				
				
			}
				
			
		
		

	}


