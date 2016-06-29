package dayThree.FactoryPattern;

/**
 * Created by student on 29-Jun-16.
 */
public class ThreadDemo {

    public static void main(String[] args){
        Thread t = Thread.currentThread();


        new ThreadTwo();


        try{
            for(int i = 1; i <=10 ;  i++){
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main Thread interrupted!");
        }
        System.out.println("Main Thread Terminated!");



    }
}


class ThreadTwo implements Runnable {// every thread requires the run method override.
    Thread t;
    ThreadTwo() {
        t = new Thread(this, "Second Thread");
        System.out.println("Another thread: " + t);
        t.start(); // execute the run override
    }

    @Override
    public void run() {
        try{
            for (int i = 5; i > 0; i--){
                System.out.println("Another thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Second Thread interrupted!");
        }
        System.out.println("Second Thread terminated");
    }
}