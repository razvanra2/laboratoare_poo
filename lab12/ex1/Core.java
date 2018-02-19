public class Core
{
    private void privateMethod()
    {
        System.out.println("This is a private method");
    }
 
    public static void staticMethod()
    {
        System.out.println("This is a static method");
 
        this.privateMethod();
    }
 
    // Application Entry Point
    public static void main(String[] Params)
    {
        Core Instance = new Core();
        Instance.staticMethod();
        Core.staticMethod();
    }
}
