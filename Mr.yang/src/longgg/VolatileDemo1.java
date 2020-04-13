package longgg;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class VolatileDemo1 {

    public static void main(String[] args) {
        People people = new People();

        for (int i = 1; i <=20 ; i++) {
            new Thread(() -> {
                for (int j = 1; j <= 1000; j++) {
                    people.num++;
                    people.atomicAddSelf();
                }
                       }, "thread"+i).start();
        }
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //while (Thread.activeCount()>2){
        //    Thread.yield();
        //}
        System.out.println(Thread.currentThread().getName()+"\t finally num value is "+people.num);
        System.out.println(Thread.currentThread().getName()+"\t finally atomicnum value is "+people.atomicInteger);
    }


    static class People{
        volatile int num = 0;

        AtomicInteger atomicInteger = new AtomicInteger();
        public void atomicAddSelf(){
            atomicInteger.getAndIncrement();
        }
    }
}
