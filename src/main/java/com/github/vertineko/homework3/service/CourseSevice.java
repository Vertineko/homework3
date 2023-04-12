package com.github.vertineko.homework3.service;

import com.github.vertineko.homework3.dao.CourseDao;
import com.github.vertineko.homework3.model.Course;
import com.github.vertineko.homework3.model.deshenpi;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class CourseSevice {
    private static CourseSevice courseSevice = new CourseSevice();
    private CourseSevice(){}
    public static CourseSevice getCourseSevice(){
        return courseSevice;
    }
    public List<Course> showAllCourse(){
        InputStream config1 = null;
        try {
            config1 = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config1);
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            CourseDao courseDao = sqlSession.getMapper(CourseDao.class);
            return courseDao.getAllCourses();

        }
    }
    public List<deshenpi> showAllDecourse(){
        InputStream config1 = null;
        try {
            config1 = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config1);
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            CourseDao courseDao = sqlSession.getMapper(CourseDao.class);
            return courseDao.getAllDecourse();

        }
    }
    public List<Course> getCourseById(int num){
        InputStream config1 = null;
        try {
            config1 = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config1);
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            CourseDao courseDao = sqlSession.getMapper(CourseDao.class);
            return courseDao.getCourseById(num);

        }
    }

    public void insertDeCourse(deshenpi Deshenpi){
        InputStream config1 = null;
        try {
            config1 = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config1);
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            CourseDao courseDao = sqlSession.getMapper(CourseDao.class);
            courseDao.insertDeCourse(Deshenpi);

        }
    }
    public void deleteDeshenpi(int num){
        InputStream config1 = null;
        try {
            config1 = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config1);
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            CourseDao courseDao = sqlSession.getMapper(CourseDao.class);
            courseDao.deleteDeshenpi(num);

        }
    }
    public deshenpi getDeshenpiById(int num){
        InputStream config1 = null;
        try {
            config1 = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config1);
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            CourseDao courseDao = sqlSession.getMapper(CourseDao.class);
            return courseDao.getDeshenpiById(num)==null?null:courseDao.getDeshenpiById(num);

        }
    }
    public Course getCourseByName(String name){
        InputStream config1 = null;
        try {
            config1 = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config1);
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            CourseDao courseDao = sqlSession.getMapper(CourseDao.class);
            return courseDao.getCourseByName(name)==null?null:courseDao.getCourseByName(name);

        }
    }
    public void updateDeshenpiStatus(int num ,int flag){
        InputStream config1 = null;
        try {
            config1 = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config1);
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            CourseDao courseDao = sqlSession.getMapper(CourseDao.class);
            courseDao.updateDeShenpiStatus(num, flag);

        }
    }
}
