package C1;

/**
 * Created by Hernan Y.Ke on 2016/4/5.
 */
public class L1_basicthread {
    public static void main(String[] args) {
        Runnable runnable =()->{
            System.out.println(Thread.currentThread().getName());
        };
        Thread t = new Thread(runnable);
        t.setName("desc");
        t.start();
        //Do not start t.run()
    }
}
