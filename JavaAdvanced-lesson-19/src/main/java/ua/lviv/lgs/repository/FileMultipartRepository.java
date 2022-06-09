package ua.lviv.lgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.lgs.domain.FileMultipart;

public interface FileMultipartRepository extends JpaRepository<FileMultipart, String> {

}
