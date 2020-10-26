package com.huzihao.thread_local;

/**
 * @author huzihao
 * @since 2020/10/26 22:37
 */
public class OrderDao {
    public void saveOrder() {
        var key = Thread.currentThread().getName();
        System.out.printf("Dao: Thread[%s]=%s%n", key, ThreadLocalTest.data.get(key));
    }
}
