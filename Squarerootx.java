public class Squarerootx{
public static void main(String args[])
{
int n=8,a;
a=Sqrt(n);
System.out.println(a);
}
public static int Sqrt(int n)
{
if(n==1||n==0)
{
return n;
}
int mid,low=2,high=n/2;
int res=0;
while(low<=high)
{
mid=(low+high)/2;
if(mid*mid==n)
{return mid;}
else if(mid*mid<n)
{
low=mid+1;
res=mid;
}
else
{high=mid-1;
res=mid;}

}

return res;

}
}
