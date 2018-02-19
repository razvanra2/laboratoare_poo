import java.util.*;
 
public class Main
{
    private void process()
    {
        ArrayList<Integer> myList = new ArrayList<Integer>();
 
        try
        {
            for(int I = 0; I < 5; ++I)
                myList.add(I + 1);
 
            int result = myList.get(5);
            System.out.println(result);
        }
        catch(StackOverflowError error)
        {
            System.out.println("! Stack overflow !");
        }
    }
 
    // Application Entry Point
    public static void main(String[] Params)
    {
       new Main().process();
    }
}
