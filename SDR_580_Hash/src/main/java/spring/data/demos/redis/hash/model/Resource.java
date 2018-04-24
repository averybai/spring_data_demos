package spring.data.demos.redis.hash.model;

import java.io.Serializable;

/**
 *  这个类代表系统的 资源－－或者说 功能。
 *  它对应 Shiro 里面的 Permission (感觉不太对应耶)
 */
public class Resource implements Serializable {

    private Integer id;
    private String name;
    private String url;
    private ResourceEnum type;
    private String permission;//代表当前 资源 的 权限表示字符串
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ResourceEnum getType() {
        return type;
    }

    public void setType(ResourceEnum type) {
        this.type = type;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
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
