public class Main
{
    private static Main Instance = new Main();
 
    public static Main getInstance()
    {
        return Instance;
    }
 
    public void print()
    {
        System.out.println(this.getClass());
    }
 
    // Application Entry Point
    public static void main(String[] Params)
    {
       Main.getInstance().print();
       new Main().print();
    }
}
