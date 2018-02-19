public class Core
{
    private void someFunction(int x)
    {
        try
        {
            System.out.println("1");
            if (x == 1)
                return;
            x /= x;
        }
        catch (Exception error)
        {
            System.out.println("2");
        }
        finally
        {
            System.out.println("3");
        }
    }
 
    // Application Entry Point
    public static void main(String[] Params)
    {
       Core instance = new Core();
       instance.someFunction(1);
       instance.someFunction(0);
    }
}
