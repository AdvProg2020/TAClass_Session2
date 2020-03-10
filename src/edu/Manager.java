package edu;

import java.util.ArrayList;

public class Manager {
    private String currentSemester;
    private ArrayList<Student> students;
    private ArrayList<Professor> professors;
    private ArrayList<Course> coursesThisSemester;
    private ArrayList<Course> coursesHistory;

    public Manager(String currentSemester) {
        this.currentSemester = currentSemester;
        students = new ArrayList<>();
        professors = new ArrayList<>();
        coursesThisSemester = new ArrayList<>();
        coursesHistory = new ArrayList<>();
    }


    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public ArrayList<Course> getCoursesThisSemester() {
        return coursesThisSemester;
    }

    public ArrayList<Course> getCoursesHistory() {
        return coursesHistory;
    }

    public void addStudent(String studentId, String studentFirstName, String studentLastName) {
        students.add(new Student(studentId, studentFirstName, studentLastName));
    }

    public void addProfessor(String professorFirstName, String professorLastName, String professorRank) {
        professors.add(new Professor(professorFirstName, professorLastName, professorRank));
    }

    public void addCourse(String courseName, String professorFirstName, String professorLastName, ArrayList<String> preCourses) {
        for (Professor professor : professors) {
            if (professor.getFirstName().equals(professorFirstName) && professor.getLastName().equals(professorLastName)) {
                coursesThisSemester.add(new Course(courseName, professor, currentSemester, preCourses));
                break;
            }
        }
    }

}
