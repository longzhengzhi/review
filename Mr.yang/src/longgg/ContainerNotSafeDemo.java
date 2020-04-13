package longgg;

import java.util.ArrayList;
import java.util.UUID;

public class ContainerNotSafeDemo {

   static ArrayList list = new ArrayList();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
                       }, "thread"+i).start();
        }
    }


}
