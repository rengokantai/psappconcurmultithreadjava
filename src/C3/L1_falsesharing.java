package C3;

/**
 * Created by Hernan Y.Ke on 2016/4/5.
 */
public class L1_falsesharing {
    public static int NUM_MAX = 3;
    public final static long ITER = 5000L;
    private static VolatileLongP[] pLongs;
    private static VolatileLongUnP[] upLongs;

    public final static class VolatileLongP{
        public long q1,q2;
        public volatile long value=0L;
        public long q11,q12;
    }
    public final static class VolatileLongUnP{
        public volatile long value=0L;
    }

    static{
        pLongs = new VolatileLongP[NUM_MAX];
        for(int i=0;i<pLongs.length;i++){
            pLongs[i]=new VolatileLongP();
        }

        upLongs = new VolatileLongUnP[NUM_MAX];
        for(int i=0;i<upLongs.length;i++){
            upLongs[i]=new VolatileLongUnP();
        }
    }

    public static void main(String[] args) throws Exception{
        test();
    }

    public static void test() throws InterruptedException{
        long begin, end;
        for(int i=1;i<=NUM_MAX;i++){
            Thread[] threads = new Thread[i];
            for(int j=0;j<threads.length;j++){
             //   threads[j]=new Thread(creaU);
            }
            begin = System.currentTimeMillis();
            for(Thread t:threads){t.start();}
            for(Thread t:threads){t.join();}
            end = System.currentTimeMillis();
            System.out.printf("%d %d",i,end-begin);

            for(int j=0;j<threads.length;j++){
          //      threads[j]=new Thread(creaP);
            }
            begin = System.currentTimeMillis();
            for(Thread t:threads){t.start();}
            for(Thread t:threads){t.join();}
            end = System.currentTimeMillis();
            System.out.printf("%d %d",i,end-begin);
        }
    }
    private static Runnable creaU(final int k){
        return ()->{
            long i = ITER +1;
            while(0!=--i){
                upLongs[k].value=i;
            }
        };
    }

    private static Runnable creaP(final int k){
        Runnable r = ()->{
            long i = ITER +1;
            while(0!=--i){
                pLongs[k].value=i;
            }
        };
        return r;
    }

}
