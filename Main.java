/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int i,j;//x1,x2,x3,x4,x5,x6,x7,x8,x9,x0,y1,y2,y3,y4,y5,y6,y7,y8,y9,y0,z1,z2,z3,z4;
		int [][]a=new int [][]{{5,3,0,6,7,8,0,1,0},
		                         {6,7,0,1,9,5,3,4,0},
		                         {1,9,8,3,0,2,0,6,0},
		                         {8,5,0,7,6,0,4,2,3},
		                         {4,2,0,8,0,3,7,9,1},
		                         {7,0,0,0,2,0,0,0,6},
		                         {9,6,0,5,0,7,2,8,0},
		                         {2,0,7,4,1,9,6,3,5},
		                         {3,0,5,2,8,0,1,7,9}};
		                         System.out.println("Solve the puzzle:");
	for(i=0;i<9;i++)
	{
	    for(j=0;j<9;j++)
	    {
	        System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
	}
    System.out.println("Enter First fill:");
    Scanner s1=new Scanner(System.in);
    int x1=s1.nextInt();
    if(x1==4)
    {
       a[0][2]=4;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
                System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }
       System.out.println("Enter next fill:");
    Scanner s2=new Scanner(System.in);
    int x2=s2.nextInt();
    if(x2==9)
    {
       a[0][6]=9;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
               System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }
    System.out.println("Enter next fill:");
    Scanner s3=new Scanner(System.in);
    int x3=s3.nextInt();
    if(x3==2)
    {
       a[0][8]=2;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
               System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }
    System.out.println("Enter next fill:");
    Scanner s4=new Scanner(System.in);
    int x4=s4.nextInt();
    if(x4==2)
    {
       a[1][2]=2;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
               System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }
    System.out.println("Enter nextfill:");
    Scanner s5=new Scanner(System.in);
    int x5=s5.nextInt();
    if(x5==8)
    {
       a[1][8]=8;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
               System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }
    System.out.println("Enter next fill:");
    Scanner s6=new Scanner(System.in);
    int x6=s6.nextInt();
    if(x6==4)
    {
       a[2][4]=4;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
                System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }
        System.out.println("Enter next fill:");
    Scanner s7=new Scanner(System.in);
    int x7=s7.nextInt();
       if(x7==5)
        {
       a[2][6]=5;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
               System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }
        System.out.println("Enter next fill:");
    Scanner s8=new Scanner(System.in);
    int x8=s8.nextInt();
       if(x8==7)
    {
       a[2][8]=7;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
               System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }
        System.out.println("Enter next fill:");
    Scanner s9=new Scanner(System.in);
    int x9=s9.nextInt();
       if(x9==9)
    {
       a[3][2]=9;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
               System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }
        System.out.println("Enter next fill:");
    Scanner s0=new Scanner(System.in);
    int x0=s0.nextInt();
       if(x0==1)
    {
       a[3][5]=1;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
               System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }
        System.out.println("Enter next fill:");
    Scanner t1=new Scanner(System.in);
    int y1=t1.nextInt();
       if(y1==6)
    {
       a[4][2]=6;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
               System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }
        System.out.println("Enter next fill:");
    Scanner t2=new Scanner(System.in);
    int y2=t2.nextInt();
       if(y2==5)
    {
       a[4][4]=5;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
                System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }
        System.out.println("Enter next fill:");
    Scanner t3=new Scanner(System.in);
    int y3=t3.nextInt();
       if(y3==1)
    {
       a[5][1]=1;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
               System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }
        System.out.println("Enter next fill:");
    Scanner t4=new Scanner(System.in);
    int y4=t4.nextInt();
       if(y4==3)
    {
       a[5][2]=3;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
                System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }
       System.out.println("Enter next fill:");
    Scanner t5=new Scanner(System.in);
    int y5=t5.nextInt();
       if(y5==9)
    {
       a[5][3]=9;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
                System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }
       System.out.println("Enter next fill:");
    Scanner t6=new Scanner(System.in);
    int y6=t6.nextInt();
       if(y6==4)
    {
       a[5][5]=4;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
               System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }
       System.out.println("Enter next fill:");
    Scanner t7=new Scanner(System.in);
    int y7=t7.nextInt();
       if(y7==8)
    {
       a[5][6]=8;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
               System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }
       System.out.println("Enter next fill:");
    Scanner t8=new Scanner(System.in);
    int y8=t8.nextInt();
       if(y8==5)
    {
       a[5][7]=5;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
                System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }System.out.println("Enter next fill:");
    Scanner t9=new Scanner(System.in);
    int y9=t9.nextInt();
       if(y9==1)
    {
       a[6][2]=1;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
                System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }System.out.println("Enter next fill:");
    Scanner t0=new Scanner(System.in);
    int y0=t0.nextInt();
       if(y0==3)
    {
       a[6][4]=3;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
                System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }System.out.println("Enter next fill:");
    Scanner q1=new Scanner(System.in);
    int z1=q1.nextInt();
       if(z1==4)
    {
       a[6][8]=4;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
               System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }System.out.println("Enter next fill:");
    Scanner q2=new Scanner(System.in);
    int z2=q2.nextInt();
       if(z2==8)
    {
       a[7][1]=8;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
                System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }System.out.println("Enter next fill:");
    Scanner q3=new Scanner(System.in);
    int z3=q3.nextInt();
       if(z3==4)
    {
       a[8][1]=4;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {
                System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }System.out.println("Enter next fill:");
    Scanner q4 =new Scanner(System.in);
    int z4=q4.nextInt();
       if(z4==6)
    {
       a[8][5]=6;
       for(i=0;i<9;i++)
       {
           for(j=0;j<9;j++)
           {System.out.println(a[i][j]+"  ");
	    }
	    System.out.println();
       }
    }}}}}}}}}}}}}}}}}}}}}}}}
    else
    {
        System.out.println("Enter correct value");
    }
    
	}
}



