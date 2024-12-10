package com.example.college.service;

import com.example.college.dao.FacultyDao;
import com.example.college.model.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultyServiceImpl implements FacultyService{

    @Autowired
    FacultyDao facultyDao;

    @Override
    public List<Faculty> faculties() {
        return facultyDao.faculties();
    }

    @Override
    public Optional<Faculty> getFacultyByNameAndId(String name, int id) {
        return facultyDao.getFacultyByNameAndId(name,id);
    }

    @Override
    public String save(Faculty faculty) {
        return facultyDao.save(faculty);
    }

    @Override
    public Faculty updateFaculty(Faculty faculty) {
        return facultyDao.updateFaculty(faculty);
    }

    @Override
    public String deleteById(int id) {
        return facultyDao.deleteById(id);
    }
}
