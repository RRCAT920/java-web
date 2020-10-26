package com.huzihao.thread_local;

/**
 * @author huzihao
 * @since 2020/10/26 22:34
 */
public class OrderService {
    public void createOrder() {
        var key = Thread.currentThread().getName();
        System.out.printf("Service: Thread[%s]=%s%n", key, ThreadLocalTest.data.get(key));

        new OrderDao().saveOrder();
    }
}
