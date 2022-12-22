package com.example.uploadfiles.repository;

import com.example.uploadfiles.model.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileDBRepository extends JpaRepository<FileDB, String> {
}
