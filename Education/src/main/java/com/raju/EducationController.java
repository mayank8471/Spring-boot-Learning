package com.raju;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/students")
public class EducationController {

    List<StudentModel> list = new ArrayList<>();

    // Get all students
    @GetMapping
    public List<StudentModel> getStudents() {
        return list;
    }

    // Add new student
    @PostMapping
    public String addStudent(@RequestBody StudentModel s) {
        list.add(s);
        return "Student Added";
    }

    // Update student
    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody StudentModel s) {
        for(StudentModel st : list) {
            if(st.getId() == id) {
                st.setName(s.getName());
                st.setCourse(s.getCourse());
                return "Student Updated";
            }
        }
        return "Student Not Found";
    }

    // Delete student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        Iterator<StudentModel> it = list.iterator();
        while(it.hasNext()) {
            if(it.next().getId() == id) {
                it.remove();
                return "Student Deleted";
            }
        }
        return "Student Not Found";
    }
}