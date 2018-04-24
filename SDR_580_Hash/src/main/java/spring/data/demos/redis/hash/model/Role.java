package spring.data.demos.redis.hash.model;

import java.io.Serializable;

public class Role implements Serializable {

    private Integer id;
    private String name;
    private String desc;//描述
    private String others01;//这是预留字段
    private String others02;
    private String others03;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getOthers01() {
        return others01;
    }

    public void setOthers01(String others01) {
        this.others01 = others01;
    }

    public String getOthers02() {
        return others02;
    }

    public void setOthers02(String others02) {
        this.others02 = others02;
    }

    public String getOthers03() {
        return others03;
    }

    public void setOthers03(String others03) {
        this.others03 = others03;
    }
}
