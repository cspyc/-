package 天人感应.金钱起卦;

import java.time.LocalDateTime;
import java.util.concurrent.*;

/**
 * @author pi
 * @date 2022/05/01 21:22:41
 **/
public class 摇卦 {
    /**
     * create thread pool
     */
    private static ExecutorService pool = new ThreadPoolExecutor
            (3, 3, 600, TimeUnit.MICROSECONDS, new LinkedBlockingDeque<>());
    /**
     * get current timestamp
     */
    private static final LocalDateTime now = LocalDateTime.now();

    static class ThrowCoin implements Callable<String> {

        @Override
        public String call() throws Exception {
            钱币 钱币 = new 钱币(now);
            return 钱币.抛出得到朝上面();
        }
    }

    public 钱币之象 同时抛出三枚钱币() throws Exception {
        String 最终结果 = "";
        CountDownLatch countDownLatch = new CountDownLatch(3);

        //三个线程
        ThrowCoin task1 = new ThrowCoin();
        FutureTask<String> futureTask1 = new FutureTask<>(task1);
        Thread 钱币一 = new Thread(futureTask1);
        钱币一.start();
        countDownLatch.countDown();

        ThrowCoin task2 = new ThrowCoin();
        FutureTask<String> futureTask2 = new FutureTask<>(task2);
        Thread 钱币二 = new Thread(futureTask2);
        钱币二.start();
        countDownLatch.countDown();

        ThrowCoin task3 = new ThrowCoin();
        FutureTask<String> futureTask3 = new FutureTask<>(task3);
        Thread 钱币三 = new Thread(futureTask3);
        钱币三.start();
        countDownLatch.countDown();

        countDownLatch.await();

        String 一枚硬币朝向结果 = futureTask1.get();
        String 二枚硬币朝向结果 = futureTask2.get();
        String 三枚硬币朝向结果 = futureTask3.get();

        最终结果 = 一枚硬币朝向结果 + 二枚硬币朝向结果 + 三枚硬币朝向结果;

        return 得钱币之象(最终结果);

    }


    private 钱币之象 得钱币之象(String 单次摇卦结果) throws Exception {
        if (单次摇卦结果 != null && !"".equals(单次摇卦结果) && 单次摇卦结果.length() == 3) {
            int 正面朝上次数 = 0;
            for (int i = 0; i < 单次摇卦结果.length(); i++) {
                String 朝向结果 = String.valueOf(单次摇卦结果.charAt(i));
                if (钱币之象.正面朝上.get朝向().equals(朝向结果)) {
                    正面朝上次数++;
                }
            }

            if (正面朝上次数 == 0) {
                return 钱币之象.老阳;
            }

            if (正面朝上次数 == 1) {
                return 钱币之象.少阴;
            }

            if (正面朝上次数 == 2) {
                return 钱币之象.少阳;
            }

            if (正面朝上次数 == 3) {
                return 钱币之象.老阴;
            }
        }

        throw new Exception("摇卦结果有误，请重试！");

    }

}
