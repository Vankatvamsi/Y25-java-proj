package com.vamsi;

public class TwoDarray {

	public static void main(String[] args) {
		int arr[][]= {{10,20,30},{40,50,60},{70,80,90}};
		System.out.println("Array Elements are:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		int[][] b=new int[][]{{100,200,300},{400,500,600},{700,800,900}};
		System.out.println("array elements are:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		int c[][]=new int[3][2];
		c[0][0]=5;
		c[0][1]=15;
		c[1][0]=25;
		c[1][1]=35;
		c[2][0]=45;
		c[2][1]=55;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
			System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
