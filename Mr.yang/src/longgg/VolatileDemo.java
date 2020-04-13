package longgg;

import java.util.concurrent.TimeUnit;

public class VolatileDemo {


    public static void main(String[] args)  {


        System.out.println(Thread.currentThread().getName()+"这是main线程");

        People people = new People();

       new Thread(() -> {
           System.out.println(Thread.currentThread().getName()+"开始了奥");
           try {
              TimeUnit.SECONDS.sleep(3);
               people.num = 5;
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }, "thread1").start();
        while (people.num==0){

        }
    }

    static class People{
        volatile int num = 0;
    }


}
