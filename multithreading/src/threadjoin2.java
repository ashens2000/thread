public class threadjoin2 extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Thread 2 " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {


        threadjoin2 t2=new threadjoin2();
        t2.start();

        t2.join();
        theadjoin1 t1=new theadjoin1();
        t1.start();

    }
}
