package spring.data.demos.redis.template.model;

import java.io.Serializable;

/**
 * 用户对象
 */
public class User implements Serializable {

    private Long id;
    private String name;
    private String password;
    private String others01;//这是预留字段
    private String others02;
    private String others03;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
