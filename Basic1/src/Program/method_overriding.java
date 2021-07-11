package Program;
class  Shape
{
	void draw()
	{
		System.out.println("cant say shape type");
	}
}
class Square extends Shape
{
  void draw()
  {
	  System.out.println("Square shape");
  }
}
public class method_overriding {

	public static void main(String[] args) {
		
		Shape s=new Square();
        s.draw();
	}

}
