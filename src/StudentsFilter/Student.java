package StudentsFilter;

public class Student {
    String grade;
    int age;
    String city;

    public Student(String grade, int age, String city){
        this.grade = grade;
        this.city = city;
        this.age = age;
    }
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade='" + grade + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
