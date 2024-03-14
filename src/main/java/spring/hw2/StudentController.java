package spring.hw2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController

public class StudentController {
private final StudentRepository repository;
    @Autowired
    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/student/{id}")
    public Student getById(@PathVariable long id){
        return repository.getById(id);
    }

    @GetMapping("/student")
    public List<Student> getAll(){
        return repository.getAll();
    }

    @GetMapping("/student/search")
    public Student getByName(@RequestParam String name){
        return repository.getByName(name);
    }

    @GetMapping("/group/{groupName}/student")
    public List<Student> getByGroupName(@PathVariable String groupName){
        return repository.getByGroupName(groupName);
    }
}
