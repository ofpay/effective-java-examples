package org.effectivejava.examples.chapter04.item13;

/**
 * Created with IntelliJ IDEA.
 * User: caozupeng
 * Date: 13-11-18
 * Time: 下午2:52
 * To change this template use File | Settings | File Templates.
 */
public class InfoBean {
    /**
     * 删除品牌的id
     */
    private Integer id;
    /**
     * 删除品牌的名称
     */
    private String name;

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

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof InfoBean) {
            InfoBean infoBean = (InfoBean) obj;
            if (this.id != null && infoBean.id != null) {
                if (this.id.equals(infoBean.id)) {
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return this.getId() + this.getName();
    }
}
