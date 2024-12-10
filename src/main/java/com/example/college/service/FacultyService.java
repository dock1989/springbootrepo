package com.example.college.service;

import com.example.college.model.Faculty;

import java.util.List;
import java.util.Optional;

public interface FacultyService {
    List<Faculty> faculties();
    Optional<Faculty> getFacultyByNameAndId(String name, int id);

    String save(Faculty faculty);

    Faculty updateFaculty(Faculty faculty);

    String deleteById(int id);
}
