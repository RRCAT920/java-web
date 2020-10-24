package com.huzihao.utils;

import javax.servlet.http.Cookie;

/**
 * @author huzihao
 * @since 2020/10/24 16:08
 */
public class CookieUtils {
    /**
     * 查找执行名称的Cookie对象
     * @param name Cookie的键
     * @param cookies Cookie数组
     * @return 找到的Cookie，否则null
     */
    public static Cookie find(String name, Cookie[] cookies) {
        if (null == name || null == cookies) {
            return null;
        }
        for (var cookie : cookies) {
            if (name.equals(cookie.getName())) return cookie;
        }
        return null;
    }
}
