package longgg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

public class NotSafeDemo03 {


    public static void main(String[] args) {
        List list = new CopyOnWriteArrayList();//Collections.synchronizedList(new ArrayList<>());

        for (int i = 0; i <30 ; i++) {
            new Thread(() -> {
                       list.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(list);
                       }, "thread1").start();
        }
    }

}
