package org.effectivejava.examples.chapter04.item13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: caozupeng
 * Date: 13-11-18
 * Time: 上午11:20
 * To change this template use File | Settings | File Templates.
 */
public class UnmodifiedStudent {
    private String name;
    private List<String> courses;

    public UnmodifiedStudent(String name, List<String> courses) {
        this.name = name;
        this.courses = courses;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("001");
        list.add("002");
        UnmodifiedStudent s = new UnmodifiedStudent("Tom", list);

        List<String> anotherList = s.getCourses();

        /**
         * throws java.lang.UnsupportedOperationException
         * should replace with s.addCourse(String course)
         */
        anotherList.add("999");

        // never reached
        System.out.println("Tom's course.length = " + s.getCourses().size());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 增加课程，这里根据学生可以接受的课程，做合适的约束检查
     * @param course
     */
    public void addCourse(String course) {
        courses.add(course);
    }

    /**
     * 检查是否需要删除用户的课程
     * @param course
     * @return
     */
    public String removeCourse(String course) {
        boolean removed = courses.remove(courses);

        if (removed) {
            return course;
        } else {
            return null;
        }
    }

    /**
     * 返回一个不可修改的List，这样客户端无法绕开Student对象
     * @return
     */
    public List<String> getCourses() {
        return Collections.unmodifiableList(courses);
    }



}
