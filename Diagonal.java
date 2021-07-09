import java.util.Scanner;
class Diagonal
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[][]=new int[n][n];
int temp=0;
int i,j;
System.out.println("Enter Elements");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=sc.nextInt();
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==j)
{
if(a[i][j]!=0)
temp=1;
}
else
{
if(a[i][j]==0)
temp=1;
}
}
}
if(temp==0)
System.out.println(" A Diagonal Matrix");
else
System.out.println("Not a Diagonal Matrix");
}
}