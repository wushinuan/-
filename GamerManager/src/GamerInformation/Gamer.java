package GamerInformation;

public class Gamer {

    private int id;
    private String name;
    private int age;
    private String location;   //位置
    private String description;   //描述

    public Gamer(){}

    public Gamer(int id, String name, int age, String location, String description) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.location = location;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "id=" + id +
               ", name='" + name + '\'' +
               ", age=" + age +
               ", location='" + location + '\'' +
               ", description='" + description + '\'';
    }

}
