package march29;

public class Demo {

	
		public static void add(int x,int y)
		{
			int z=x+y;
			System.out.println(z);
		}
		public static String verify_String(String str1,String str2)
		{
			String res;
			if(str1.equalsIgnoreCase(str2))
			{
				res ="Both String are equal";
			}
			else
			{
				res ="Both String are Not equal";
			}
			return res;
			
		}
		public static boolean comapre_Values(int a, int b)
		{
			if(a==b)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
			public static void main(String[] args) {
				Demo.add(1234, 456);
				String x=Demo.verify_String("India", "india");
				System.out.println(x);
				boolean y =Demo.comapre_Values(100, 500);
				System.out.println(y);
			}
}
