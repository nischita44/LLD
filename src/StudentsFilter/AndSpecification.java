package StudentsFilter;

public class AndSpecification implements Specification<Student>{
    Specification<Student> first;
    Specification<Student> second;

    Specification<Student> third;
    public AndSpecification(Specification<Student> first, Specification<Student> second, Specification<Student> third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public boolean isSatisfied(Student student) {
        return first.isSatisfied(student) && second.isSatisfied(student) && third.isSatisfied(student);
    }
}
