package edu;

import java.util.ArrayList;

class CourseInfo {
    private float mark;
    private String semester;

    public CourseInfo(String semester) {
        this.semester = semester;
    }

    public String getSemester() {
        return semester;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
}

public class Course {
    private String name;
    private Professor professor;
    private String semester;
    private ArrayList<String> preCourses;

    public Course(String name, Professor professor, String semester, ArrayList<String> preCourses) {
        this.name = name;
        this.professor = professor;
        this.semester = semester;
        this.preCourses = preCourses;
    }

    public String getName() {
        return name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getSemester() {
        return semester;
    }

    public ArrayList<String> getPreCourses() {
        return preCourses;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", professor=" + professor +
                ", semester='" + semester + '\'' +
                ", preCourses=" + preCourses +
                '}';
    }
}
