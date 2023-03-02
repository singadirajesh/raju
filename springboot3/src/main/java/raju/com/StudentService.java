package raju.com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService 
{
	@Autowired
	StudentRepository studentRepository;  
	 
	public List<Student> getAllStudent()   
	{  
	List<Student> student = new ArrayList<Student>();  
	studentRepository.findAll().forEach(student1 -> student.add(student1));  
	return getAllStudent();  
	}  
	  
	public Student getStudentById(int id)   
	{  
	return studentRepository.findById(id).get();  
	}  
	 
	public void saveOrUpdate(Student student)   
	{  
	studentRepository.save(student);  
	}  
	
	public void delete(int id)   
	{  
	studentRepository.deleteById(id);  
	}  
  
	public void update(Student student, int id)   
	{  
	studentRepository.save(student);  
	}  
}
