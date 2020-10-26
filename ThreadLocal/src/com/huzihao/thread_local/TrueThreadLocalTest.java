package com.huzihao.thread_local;

/**
 * @author huzihao
 * @since 2020/10/26 22:26
 */
public class TrueThreadLocalTest {
    public static final ThreadLocal<Object> data = new ThreadLocal<>();
    public static final ThreadLocal<Object> data2 = new ThreadLocal<>();

    public static class Task implements Runnable {

        @Override
        public void run() {
            data.set("abc");
            data2.set("jklasdf");
            System.out.println(data.get());
            System.out.println(data2.get());
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(new Task()).start();
        }
    }
}
