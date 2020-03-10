package edu;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private HashMap<Course, CourseInfo> coursesThisSemester;
    private ArrayList<Course> coursesPassed;

    public Student(String studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        coursesThisSemester = new HashMap<>();
        coursesPassed = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getStudentId() {
        return studentId;
    }

    public HashMap<Course, CourseInfo> getCoursesThisSemester() {
        return coursesThisSemester;
    }

    public ArrayList<Course> getCoursesPassed() {
        return coursesPassed;
    }

    public void takeCourse(Course course) {
        coursesThisSemester.put(course, new CourseInfo());
    }

    public void dropCourse(Course course) {
        coursesThisSemester.remove(course);
    }

    public void getMark(Course course, float mark) {
        for (Course courseLoop : coursesThisSemester.keySet()) {
            if (courseLoop.getName().equals(course.getName())) {
                CourseInfo newCourseInfo = coursesThisSemester.get(courseLoop);
                newCourseInfo.setMark(mark);
                coursesThisSemester.replace(courseLoop, newCourseInfo);
                break;
            }
        }
    }

    public void passCourses() {
        for (Course course : coursesThisSemester.keySet()) {
            if (coursesThisSemester.get(course).getMark() >= 10) {
                coursesPassed.add(course);
            }
        }
        coursesThisSemester.clear();
    }

}
