package corejava.threads;

public class ThreadMain {

    public static void main(String args[]){
        ThreadClass tc=new ThreadClass();
        ThreadRunnable tr= new ThreadRunnable();
       Thread t=new Thread(tr);
        t.start();
        tc.start();

    }
}
