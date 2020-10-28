package com.huzihao.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author huzihao
 * @since 2020/10/28 19:05
 */
public class I18nTest {
    @Test
    public void testLocale() {
//        var locale = Locale.getDefault();
//        System.out.println(locale);
        System.out.println(Locale.CHINA);
        System.out.println(Locale.US);
        System.out.println(Locale.UK);
        System.out.println(Locale.JAPAN);
        System.out.println(Locale.KOREA);
    }

    @Test
    void testI18n() {
        var locale = Locale.CHINA;
        var resourceBundle = ResourceBundle.getBundle("i18n", locale);
        System.out.println(resourceBundle.getString("username"));
        System.out.println(resourceBundle.getString("password"));
        System.out.println(resourceBundle.getString("gender"));
        System.out.println(resourceBundle.getString("age"));
    }
}
