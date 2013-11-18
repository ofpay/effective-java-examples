package org.effectivejava.examples.chapter04.item13;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: caozupeng
 * Date: 13-11-18
 * Time: 下午2:48
 * To change this template use File | Settings | File Templates.
 */
public class ActionRequest {
    /**
     * 删除的对象的集合 (必传 包含1个或者多个)
     */
    private Set<InfoBean> brandDeleteListList = new TreeSet<InfoBean>();

    public Set<InfoBean> getBrandDeleteListList() {
        return brandDeleteListList;
    }

    public void setBrandDeleteListList(Set<InfoBean> brandDeleteListList) {
        this.brandDeleteListList = brandDeleteListList;
    }


}
