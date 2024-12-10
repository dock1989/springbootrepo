package com.example.college.repository;

import com.example.college.model.Faculty;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface FacultyRepository extends JpaRepository<Faculty,Integer> {

    @Query("select s from Faculty s where facName = ?1 and id = ?2")
    public Optional<Faculty> getFacultyByNameAndId(String name, int id);

    @Query("delete from Faculty s where s.id = ?1")
    @Modifying
    @Transactional
    public int deleteById(int id);

}
