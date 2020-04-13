package longgg;

public class SingletonDemo {
    private static SingletonDemo instance = null;
    public static SingletonDemo getInstance(){
        if (instance==null){
            synchronized (SingletonDemo.class){
                if (instance==null) {
                    instance = new SingletonDemo();
                }
        }
        }
        return instance;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                       getInstance();
                       }, "thread"+i).start();
        }
    }


    private SingletonDemo() {
        System.out.println(Thread.currentThread().getName() + "\t 构造方法SingletonDemo（）");
    }

}
