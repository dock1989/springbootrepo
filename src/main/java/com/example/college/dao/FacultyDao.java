package com.example.college.dao;

import com.example.college.model.Faculty;

import java.util.List;
import java.util.Optional;

public interface FacultyDao {
    List<Faculty> faculties();
    Optional<Faculty> getFacultyByNameAndId(String name, int id);

    String save(Faculty faculty);

    Faculty updateFaculty(Faculty faculty);

    String deleteById(int id);
}
