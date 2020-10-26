package com.huzihao.thread_local;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author huzihao
 * @since 2020/10/26 22:26
 */
public class ThreadLocalTest {
    private static final Random RANDOM = new Random();
    public static final Map<String, Object> data = new ConcurrentHashMap<>();

    public static class Task implements Runnable {

        @Override
        public void run() {
            // 随机生成一个变量（即线程要关键的对象）
            var value = RANDOM.nextInt(1000);
            var key = Thread.currentThread().getName();
            System.out.printf("Thread[%s]=%s%n", key, value);
            data.put(key, value);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new OrderService().createOrder();

            System.out.printf("Before Thread[%s] end: %s%n", key, data.get(key));
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(new Task()).start();
        }
    }
}
