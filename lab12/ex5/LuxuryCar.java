class Car
{
   private String Name = "Some Car";
}
 
public class LuxuryCar extends Car
{
    public LuxuryCar()
    {
        Name = "Luxury Car";
    }
}
 
class Main
{
    // Application Entry Point
    public static void main(String[] Params)
    {
       LuxuryCar instance = new Car();
    }
}
