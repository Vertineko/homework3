package com.github.vertineko.homework3.dao;

import com.github.vertineko.homework3.model.Course;
import com.github.vertineko.homework3.model.deshenpi;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseDao {
    public List<Course> getCourseById(int num);
    public List<Course> getAllCourses();
    public List<deshenpi> getAllDecourse();

    public void insertDeCourse(deshenpi Deshenpi);

    public deshenpi getDeshenpiById(int num);

    public void deleteDeshenpi(int num);
    public Course getCourseByName(String name);
    public void updateDeShenpiStatus(@Param("num") int num,@Param("status") int status);
}
