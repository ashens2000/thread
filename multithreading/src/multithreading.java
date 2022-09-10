public class multithreading
{


    public static void main(String[] args) {

        multithreading2 m2=new multithreading2();
        Thread t1=new Thread(m2);
        t1.start();


        for (int i=1;i<=50;i++)
        {
            System.out.println("Main "+i);
        }


    }

}
