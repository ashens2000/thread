public class multithreading2 implements Runnable
{
    @Override
    public void run()
    {
        for (int i=1;i<=50;i++)
        {
            System.out.println("Child "+i);
        }
    }


}
