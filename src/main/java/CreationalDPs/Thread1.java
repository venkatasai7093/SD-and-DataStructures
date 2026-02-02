package CreationalDPs;

public class Thread1 extends Thread {

    public static void main(String[] args) {
        //Here we are breaking singletondesignpattern by using thread concept
        Thread t1 = new Thread1();
        Thread t2 = new Thread1();

        t1.setName("Thread1");
        t2.setName("Thread2");
        t1.start();
        t2.start();
    }

    @Override
    public void run(){
        SingletonDesignPattern s = SingletonDesignPattern.getSingletonObjct();
        System.out.println(Thread.currentThread().getName());
    }
}
