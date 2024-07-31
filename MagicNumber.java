public class MagicNumber{
public static void main(String[]args)
{
int a,n=1009;
a=Magic(n);
if(a==1)
{System.out.println("magic number");}
else
{System.out.println("not magic number");}


}
public static int Magic(int n)
{
 int sum=0,d;
while(n>0)
{
d=n%10;
sum=sum+d;
n=n/10;
}
if(sum/10==0)
{return sum;}
else
{
return Magic(sum);

}

}}