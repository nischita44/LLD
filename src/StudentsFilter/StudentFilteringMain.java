package StudentsFilter;

import java.util.ArrayList;
import java.util.List;

public class StudentFilteringMain {

    public static void main(String[] args) {
        List<Student> res = new ArrayList<>();
        res.add(new Student("8th", 13, "New York"));
        res.add(new Student("10th", 15, "Los Angeles"));
        res.add(new Student("8th", 14, "New York"));
        res.add(new Student("9th", 15, "Chicago"));

        //criteria to be satisfied
        Specification<Student> gradeSpec = new GradeSpecification("8th");
        Specification<Student> ageSpec = new AgeSpecification(13, 15);
        Specification<Student> citySpec = new CitySpecification("New York");
        Specification<Student> andSpecification = new AndSpecification(gradeSpec, ageSpec, citySpec);



        List<Student> filteredStudents = new ArrayList<>();
        for (Student st : res) {
            if(andSpecification.isSatisfied(st)){
                filteredStudents.add(st);
            }

        }

        for(Student printvalue: filteredStudents){
            System.out.println(printvalue);
        }
    }
}
