package com.generation.service;

import com.generation.model.Course;
import com.generation.model.EnrolledCourse;
import com.generation.model.Student;
import com.generation.utils.PrinterHelper;

import java.util.HashMap;
import java.util.Scanner;

public class StudentService
{
    private final HashMap<String, Student> students = new HashMap<>();

    public void registerStudent( Student student ) {
        //TODO Add new student to the students hashmap

        students.put(student.getId(), student);
        System.out.println("Student Successfully Registered!");
    }






    public Student findStudent( String studentId ) {
        //TODO Find the student from the Hashmap with the student id

        if (students.containsKey(studentId)) {
            return students.get(studentId);
        } else {
            return null;
        }
    }


    public void enrollToCourse( String studentId, Course course )
    {
        //TODO check if students hashmap contains the studentsId, if have add the course to the student enrollToCourse
            Student student = students.get(studentId);
            student.enrollToCourse(course);
            System.out.println("Student with ID: '" + studentId + "' enrolled successfully to " + course.getCode());
    }

    public void showSummary()
    {
        //TODO Loop through students hashmap and print out students' details including the enrolled courses

    }

    public HashMap<String, EnrolledCourse> enrolledCourses(Student student)
    {
        //TODO return a HashMap of all the enrolledCourses
        return student.getEnrolledCourses();
    }

    public Course findEnrolledCourse( Student student, String courseId )
    {
        //TODO return the course enrolled by the student from the course Id

        return null;
    }

    public void gradeStudent(Student student, Course course, double grade) {
        student.gradeCourse(course.getCode(), grade);
    }



    public HashMap<String, EnrolledCourse> getPassedCourses(Student student) {
        return student.findPassedCourses();
    }
}
