package org.effectivejava.examples.chapter04.item13;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: caozupeng
 * Date: 13-11-18
 * Time: 上午11:16
 * To change this template use File | Settings | File Templates.
 */
public class Student {
    private String name;
    private List<String> courses;

    public Student(String name, List<String> courses) {
        this.name = name;
        this.courses = courses;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("001");
        list.add("002");
        Student s = new Student("Tom", list);

        List<String> anotherList = s.getCourses();
        // 从对象中获取List句柄，可以绕开Student对象，直接增加课程
        // 该方法不安全直接，没有student本身的约束，可以随便加入课程
        anotherList.add("999");

        System.out.println("Tom's course.length = " + s.getCourses().size());
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
