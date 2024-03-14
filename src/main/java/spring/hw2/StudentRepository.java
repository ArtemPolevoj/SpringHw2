package spring.hw2;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepository {
    private List<Student> studentList;

    public StudentRepository() {
        studentList = new ArrayList<>();
        studentList.add(new Student("Иван", "Менеджмент"));
        studentList.add(new Student("Петр", "Менеджмент"));
        studentList.add(new Student("Игорь", "Экономика"));
        studentList.add(new Student("Василий", "Экономика"));
        studentList.add(new Student("Алексей", "Психолгия"));
        studentList.add(new Student("Михаил", "Психология"));
    }

    public Student getById(long id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public List<Student> getAll() {
        return List.copyOf(studentList);
    }

    public Student getByName(String name) {
        for (Student s : studentList) {
            if (s.getName().contains(name)) {
                return s;
            }
        }
        return null;
    }
    public List<Student> getByGroupName(String groupName) {
        List<Student> temp = new ArrayList<>();
        for (Student s : studentList) {
            if (s.getGroupName().equals(groupName)) {
                temp.add(s);
            }
        }
        return temp;
    }
}
