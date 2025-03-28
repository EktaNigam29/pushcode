package overloading;



public class MethodOverloading 
{
static
{
	System.out.println("hi");
}
{
	System.out.println("hi1");
}
{
	System.out.println("hi2");
}
MethodOverloading ()
{
	System.out.println("h2");
}
MethodOverloading (int a)
{
	System.out.println("h3");
}
public static void main(String[]args) {

	System.out.println("mm");
	MethodOverloading m1=new MethodOverloading();
	new MethodOverloading(10);
	
	
	
	
	

}

}
	
		


