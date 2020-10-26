package ro.mta.facc.selab;

public class Main {
    public static void main(String[] args)
    {
        /*
       Carte c=new Carte("Zece negri mititei","Autor1",1998,240);
       Biblioteca b=new Biblioteca();
       b.add(c);
       b.add(new Carte("Sherlock Holmes","Sir Arthur Connan  Doyle",1922,550));
       b.add(new Carte("Codul lui DaVinci","autor243",1927,725));
       b.sort();
        System.out.println(b);

*/
        Thread.currentThread().setName(("MyThread"));
        System.out.println(Thread.currentThread().getName());
        MyThread[] threadArray=new MyThread[10];
        for( int i =0; i<10;i++)
        {
           threadArray[i]= new MyThread();
            threadArray[i].setName(""+i);
            threadArray[i].start();

        }

        for(int i=0;i<10;i++)
        {
            try {
                threadArray[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
