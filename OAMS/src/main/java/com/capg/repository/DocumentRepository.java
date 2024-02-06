package com.capg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.entity.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer>{

}
