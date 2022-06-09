package ua.lviv.lgs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.domain.Student;
import ua.lviv.lgs.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;

	public Student save(Student student) {
		return repo.save(student);
	}

	public Student findStudent(int id) {
		return repo.getReferenceById(id);
	}

}
