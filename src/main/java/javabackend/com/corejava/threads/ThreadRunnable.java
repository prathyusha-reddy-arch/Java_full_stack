package corejava.threads;

public class ThreadRunnable implements Runnable{


    public void run() {
        System.out.println("Implementing the runnable to Thread runnable class");
        for(int i=1;i<=10;i++)
            System.out.print(i+" ");
        System.out.println();


    }
}
