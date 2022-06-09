package ua.lviv.lgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.lgs.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
