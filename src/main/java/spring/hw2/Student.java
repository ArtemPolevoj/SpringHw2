package spring.hw2;


public class Student {
    private static long count = 0;

    private final long id;
    private final String name;
    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student(String name, String groupName) {
        this.id = count++;
        this.name = name;
        this.groupName = groupName;
    }
}
