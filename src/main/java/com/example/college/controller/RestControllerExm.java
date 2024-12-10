package com.example.college.controller;

import com.example.college.model.Faculty;
import com.example.college.model.Student;
import com.example.college.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class RestControllerExm {

    @Autowired
    FacultyService facultyService;

    @GetMapping("/health")
    public String test(){
        return "Working fine  from spring boot";
    }

    @GetMapping("/getAllStudent")
    public List<Student> studentList(){
        List<Student> students = Arrays.asList(
          new Student(1,"Ajay","Delhi"),
                new Student(2,"Ajay","Delhi"),
                new Student(3,"Ajay","Delhi"),
                new Student(4,"Ajay","Delhi"),
                new Student(5,"Ajay","Delhi"),
                new Student(6,"Ajay","Delhi")
        );
        return students;
    }

    @GetMapping("/getFaculties")
    public List<Faculty> faculties(){
        return facultyService.faculties();
    }

    @GetMapping("/getFacultyByNameAndId")
    public Optional<Faculty> getFacultyByNameAndId(@RequestParam String name,
                                                  @RequestParam int id) {
        if(facultyService.getFacultyByNameAndId(name,id) != null)
            return facultyService.getFacultyByNameAndId(name,id);
        return null;
    }

    @PostMapping("/saveFaculty")
    public String saveFaculty(@RequestBody Faculty faculty){
        return facultyService.save(faculty);
    }

    @PutMapping("/updateFaculty")
    public Faculty updateFaculty(@RequestBody Faculty faculty){
        try {
            return facultyService.updateFaculty(faculty);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping("/deleteFaculty/{id}")
    public String deleteFaculty(@PathVariable int id){
        return facultyService.deleteById(id);
    }

}
