public class threadjoin3 extends Thread{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Thread 3 " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {


        threadjoin3 t3 =new threadjoin3();
        t3.start();

        t3.join(1);
        theadjoin1 t1=new theadjoin1();
        t1.start();

    }
}
