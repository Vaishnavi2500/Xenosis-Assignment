class HollowDiamond
{
public static void main(String ar[])
{
int i,j,k;
int rows=6;
for(i=1;i<=rows;i++)
{
for(j=1;j<=rows-i;j++)
{
System.out.print(" ");
}
for(k=1;k<=i*2-1;k++)
{
if(k==1||k==i*2-1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}

for(i=rows-1;i>0;i--)
{
for(j=1;j<=rows-i;j++)
{
System.out.print(" ");
}
for(k=1;k<=i*2-1;k++)
{
if(k==1||k==i*2-1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
}
}