package com.onlylemi.parse.info;

/**
 * Created by only乐秘 on 2015-09-20.
 * <p/>
 * city表
 */
public class CityTable extends BaseTable {

    private Integer id;
    private String name;

    public CityTable() {

    }

    public CityTable(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CityTable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public String toJson() {
        String json = "{" +
                "\"id\":" + "\"" + id + "\"" +
                ",\"name\":" + "\"" + name + "\"" +
                "}";
        return json;
    }
}
