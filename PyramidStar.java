import java.io.*;
public class PyramidStar
{
    public static void  printStarPyramid(int n)
    {
        System.out.println("Pyramid Pattern");
        int i,j; //i-rows ,j-columns ,n-no of rows//
        for(i=0;i<n;i++ )
        {
            for(j=n-i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PyramidStar.printStarPyramid(5);
    }
}