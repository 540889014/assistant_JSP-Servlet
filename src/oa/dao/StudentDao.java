package oa.dao;

import java.util.List;

import oa.domain.Student;

public interface StudentDao {

	public Student Login(String username,String password);
	public void saveStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(String StudentId);
	public List<Student> findAllStudent();
	public Student findStudentById(String StudentId);
}
