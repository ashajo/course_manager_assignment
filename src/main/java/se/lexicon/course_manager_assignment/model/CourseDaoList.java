package se.lexicon.course_manager_assignment.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class CourseDaoList  implements CourseDao {
    private static List<Course> courses = new ArrayList<>();
    boolean  isCourseDeleted = false;
    public CourseDaoList() {

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public Course saveCourse(Course course) {
        courses.add(course);
        return course;

    }

    @Override
    public Course findById(int id) {
        Course searchCourse = null;
        for (Course course: courses) {
            if (course.getId() == id) {
                searchCourse = course;
                break;

            }
        }

        return searchCourse;

    }

    @Override
    public List<Course> findByName(String name) {
        List<Course> searchCourse = new ArrayList<>();
        for (Course course : courses) {
            if (course.getCourseName() == name) {
                searchCourse.add(course);

            }
        }
        return searchCourse;
    }

    @Override
    public List<Course> findByDate(LocalDate date) {
        List<Course> searchCourse = new ArrayList<>();
        for (Course course : courses) {
            if (course.getStartDate() == date) {
                searchCourse.add(course);
            }
        }
        return searchCourse;
    }

    @Override
    public List<Course> findAll() {
        return courses;
    }

    @Override
    public boolean removeCourse(Course course) {
        isCourseDeleted = false;
        if (courses.contains(course)) {
            courses.remove(course);
            isCourseDeleted = true;

        }
        return isCourseDeleted;
    }
}
