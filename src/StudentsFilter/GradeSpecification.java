package StudentsFilter;

public class GradeSpecification implements Specification<Student>{

    private String grade;

    public GradeSpecification(String grade){
        this.grade = grade;
    }

    @Override
    public boolean isSatisfied(Student student) {
        return student.getGrade().equals(grade);
    }
}
