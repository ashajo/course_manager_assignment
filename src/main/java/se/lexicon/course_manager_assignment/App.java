package se.lexicon.course_manager_assignment;


import se.lexicon.course_manager_assignment.model.*;

import java.time.LocalDate;
import java.util.*;


public class App {

    public static void main(String[] args)
    {
        Course course1 = new Course(1, "00C1", LocalDate.of(2019,9,15),10);
        Course course2 = new Course(2, "00C2", LocalDate.of(2020,1,26),9);
        Course course3= new Course(3, "telecommunications",LocalDate.of(2020,3,11),11);
        Course course4 = new Course(4, "System management",LocalDate.of(2020,9,1),8);
        Course course5 = new Course(5, "statistics", LocalDate.of(2020,10,26),10);

        CourseDaoList courseDaoList = new CourseDaoList();
        courseDaoList.saveCourse(course1);
        courseDaoList.saveCourse(course2);
        courseDaoList.saveCourse(course3);
        courseDaoList.saveCourse(course4);
        courseDaoList.saveCourse(course5);
        System.out.println(courseDaoList.findById(3));

        Student student1 = new Student(11,"Asha","ashajo183@gmail.com", "LZ 6B");
        Student student2 = new Student(12,"Ivana","ivana@yahoo.com","TV 2K");
        Student student3 = new Student(13,"Mathew","mathew@gmail.com", "DV 9C");

        StudentDaoList studentDaoList = new StudentDaoList();
        studentDaoList.saveStudent(student1);
        studentDaoList.saveStudent(student2);
        studentDaoList.saveStudent(student3);
        System.out.println("Find Student by name = " + studentDaoList.findByName("Micheal"));

        course1.register(student1);
        course1.register(student2);

        course2.register(student1);
        course2.register(student2);

        course4.register(student1);
        course4.register(student2);

        System.out.println("Student registered for course 1" + course1.getStudents());

        System.out.println("Find course with ID 4 = " + courseDaoList.findById(4));


    }

}





