package pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author huzihao
 * @since 2020/10/22 02:37
 */
public class Person {
    private String name;
    private String[] phones;
    private List<String> cities;
    private Map<String, Object> map;

    public Person(String name, String[] phones, List<String> cities, Map<String, Object> map) {
        this.name = name;
        this.phones = phones;
        this.cities = cities;
        this.map = map;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + name +
                ", phones=" + Arrays.toString(phones) +
                ", cities=" + cities +
                ", map=" + map +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
