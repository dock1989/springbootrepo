package com.example.college.dao;

import com.example.college.model.Faculty;
import com.example.college.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class FacultyDaoImpl implements FacultyDao{

    @Autowired
    FacultyRepository facultyRepository;

    @Override
    public List<Faculty> faculties() {
        return facultyRepository.findAll();
    }

    @Override
    public Optional<Faculty> getFacultyByNameAndId(String name, int id) {
        Optional<Faculty> faculty = facultyRepository.getFacultyByNameAndId(name,id);
        faculty = faculty.isPresent() ? faculty : null;
        return faculty;
    }

    @Override
    public String save(Faculty faculty) {

         Faculty faculty1 = facultyRepository.save(faculty);
         return faculty1.getId()!=0 ? "Record saved successfully" : "Record not saved successfully";
    }

    @Override
    public Faculty updateFaculty(Faculty faculty) {
        Faculty faculty1 =facultyRepository.save(faculty);

        return faculty1;
    }

    @Override
    public String deleteById(int id) {
        return facultyRepository.deleteById(id)>0 ? "Record deleted successfully" : "Not deleted";
    }
}
