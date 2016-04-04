import java.io.*;
import java.util.*;
class Repeating_Decimals
{
	static Scanner sc=new Scanner(System.in);
	static PrintWriter pr;
	public static void main(String arghh[])throws Exception
	{
		pr=new PrintWriter(new BufferedWriter(new FileWriter("ans.txt",true)));
		int n=sc.nextInt();
		int d=sc.nextInt();
		generate(n,d);
	}
	static void generate(int n,int d)
	{
		pr.print(n+"/"+d+"="+(int)(n/d)+".");
		System.out.print(n+"/"+d+"="+(int)(n/d)+".");
		String q="",re="";
		int r=n%d;
		re=re+r;
		r=r*10;
		while(true)
		{
			int a=r/d;
			q=q+a;
			r=r%d;
			check(q,re);
			re=re+r;
			r=r*10;
		}
	}
	static void check(String q,String re)
	{
		StringTokenizer ss=new StringTokenizer(re);
		int rel=ss.countTokens();
		for(int i=rel;i>=1;i--)
		{
			for(int k=rel;k>=1;k--)
			{
				try
				{
					String x="",y="";
					for(int j=k;j<k+i;j++)
					x=word(re,j)+x;
					for(int j=k+i;j<k+i+i;j++)
					y=y+word(re,j)+y;
					if(x.equals(y))
					{
						System.out.println(q.substring(0,k-1)+"("+q.substring(k-1,k+i-1)+")");
						System.exit(0);
					}
				}catch(Exception e){}
			}
		}
	}
	static String word(String s,int a)
	{
		StringTokenizer ss=new StringTokenizer(s);
		String x="";
		for(int i=0;i<=a;i++)
		x=ss.nextToken();
		return x;
	}
}