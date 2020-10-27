package com.huzihao.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huzihao.pojo.Person;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author huzihao
 * @since 2020/10/27 22:26
 */
public class JsonTest {
    @Test
    public void conversionOfJavaBeanAndJson() {
        var person = new Person(1, "李容蓉");
        var gson = new Gson();
        // to Json string
        var personJsonStr = gson.toJson(person);
        System.out.println(personJsonStr);

        // to JavaBean
        var personFrom = gson.fromJson(personJsonStr, Person.class);
        System.out.println(personFrom);
    }

    @Test
    public void conversionOfListAndJson() {
        var personList = new ArrayList<>();
        personList.add(new Person(1, "李容蓉"));
        personList.add(new Person(2, "臭猫咪"));

        var gson = new Gson();
        var personListJsonStr = gson.toJson(personList);
        System.out.println(personListJsonStr);

        ArrayList<Person> personArrayList = gson.fromJson(personListJsonStr,
                new TypeToken<List<Person>>() {
                }.getType());
        Person person0 = personArrayList.get(0);
        System.out.println(person0);
    }

    @Test
    public void conversionOfMapAndJson() {
        var personMap = new HashMap<Integer, Person>();
        personMap.put(1, new Person(1, "李容蓉"));
        personMap.put(2, new Person(2, "臭猫咪"));

        var gson = new Gson();
        var personMapStr = gson.toJson(personMap);
        System.out.println(personMapStr);

        Map<Integer, Person> personMapFrom = gson.fromJson(personMapStr, new IntegerPersonMap().getType());
        Person person = personMapFrom.get(1);
        System.out.println(person);
    }
}
