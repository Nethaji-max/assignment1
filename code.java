class rec
{
	int length,breadth;
	rec()
	{
		length=0;
		breadth=0;
	}
	rec(int x,int y)
	{
		length=x;
		breadth=y;
	}
	int reca()
	{
		return length*breadth;
	}
	int reca(int x,int y)
	{
		return x*y;
	}
}
class Overload
{
	public static void main(String args[])
	{
		rec r = new rec(30,50);
		System.out.println("area " +r.reca());
		System.out.println("area " +r.reca(10,20));
	}
}