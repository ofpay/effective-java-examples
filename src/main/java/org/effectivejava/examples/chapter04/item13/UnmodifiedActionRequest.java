package org.effectivejava.examples.chapter04.item13;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: caozupeng
 * Date: 13-11-18
 * Time: 下午3:00
 * To change this template use File | Settings | File Templates.
 */
public class UnmodifiedActionRequest {

    private Set<InfoBean> brandDeleteListList = new TreeSet<InfoBean>();

    /**
     * 只有通过该对象增加InfoBean，避免外部知晓了内部的数据结构
     *
     * @param infoBean
     */
    public void addInfoBean(InfoBean infoBean) {
        brandDeleteListList.add(infoBean);
    }

    public Collection<InfoBean> getBrandDeleteListList() {
        return Collections.unmodifiableSet(brandDeleteListList);
    }

}
