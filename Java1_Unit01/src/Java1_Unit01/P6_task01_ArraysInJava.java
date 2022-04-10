package unit01;
/*
 -Normally an array is a similar type of elements  which has contigous memory location
 -Java array is an object which contains elements of similar data type.
 -we can store only a fixed type of elementsin a Java array.
 -size limit issus
    -we can store the only a fixed type o element in the array.
    -it dosen't grow its size at runtime.
    to solve this problem,collection frame work issued in java which grow automatically
 -There are two typ of array
    -single dimensional 
    - multi  =dimensional
 -Inastantiation of an array in Java
 */

public class P6_task01_ArraysInJava {
	iny a1[],a2[2],a3[];
	a1=new int[6];
	for(int i=0;i<a1.lenth;i++)
	{
		a[i]=i;
	}
   int a4= {33,3,4,5};
   //passing array to a method
   arrayAsParameter(a4);
   //passing anonymos  array in a method
   arrayAsParameter(new int[]={33,3,4,5});
   // return array from a method
   int[] a5;arraAsReturnType();
   System.out.println(a5.toString());
   //ArrayIndexOutOfBoundsExceptions
   int a[] = {50,60,70,80};
   for(int i=0;i<a.lenth;i++)
	{
		a[i]=i;
	}
   //Multidimensional array in java 
   int [][]a6=new int[3][3];//3row 3 column
   for(int i=0; int j=0; i<3&&j<3;i++,j++)
   {
	   System.out.println(a6[i][j]);
   }
    int counter =0
    		 for(int i=0; int j=0; i<3&&j<3;i++,j++)
    		   {
    			   countr ++;
    			   a6[i][j]=counter;
    		   }
    for(int i=0; int j=0; i<3&&j<3;i++,j++)
    {
 	   System.out.println(a6[i][j]);
    }
}














