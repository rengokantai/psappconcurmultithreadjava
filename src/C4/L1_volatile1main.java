package C4;

import C4.L1_volatile1;

/**
 * Created by Hernan Y.Ke on 2016/4/5.
 */
public class L1_volatile1main {
    public static void main(String[] args) throws InterruptedException {
        L1_volatile1 l2 = new L1_volatile1(0L);
        Runnable r = ()->{
            for(int i=0;i<100;i++){
                l2.increValue();
            }
        };
        Thread[] threads = new Thread[100];
        for (int i =0;i<threads.length;i++) {
            threads[i] = new Thread(r);
            threads[i].start();
        }
        for (int i =0;i<threads.length;i++) {
            threads[i].join();
        }
        System.out.println(l2.getValue());
    }
}
