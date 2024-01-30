package course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();
        this.courseRepository.findAll().forEach(course -> courses.add(course));
        return courses;
    }

    public Course getCourse(String id) {
        return this.courseRepository.findById(id).get();
    }

    public void addCourse(Course course) {
        this.courseRepository.save(course);
    }

    public void updateCourse(String id, Course course) {
        this.courseRepository.save(course);
    }

    public void removeCourse(String id) {
        this.courseRepository.deleteById(id);
    }
}
