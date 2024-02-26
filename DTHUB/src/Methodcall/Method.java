package Methodcall;

public class Method {
//((((a+b)+b)-b)*b)/b)	
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("FristSum " +c);
		return c;
	}

	public int sum2(int c,int d)
	{
		int e;
		e=c+d;
		System.out.println("SecondSum " +e);
		return e;
	}
	public int sub(int e,int f)
	{
		int g;
		g=e-f;
		System.out.println("ThirdSub " +g);
		return g;
	}
	public int mul(int g,int h)
	{
		int i;
		i=g*h;
		System.out.println("Fourthmul " +i);
		return i;
	}
	public void div(int i,int j)
	{
		int k;
		k=i/j;
		System.out.println("fifthdiv " +k);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Method ab = new Method();
int c1 = ab.sum(10, 2);
int e1 = ab.sum2(c1, 2);
int g1 = ab.sub(e1, 2);
int i1 = ab.mul(g1, 2);
ab.div(i1, 2);

	}

}
