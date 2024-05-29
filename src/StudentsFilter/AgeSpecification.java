package StudentsFilter;

public class AgeSpecification implements Specification<Student>{

    int minAge;
    int maxAge;
    public AgeSpecification(int minAge, int maxAge){
        this.minAge = minAge;
        this.maxAge = maxAge;
    }
    @Override
    public boolean isSatisfied(Student student) {
        return student.getAge() >= minAge && student.getAge() <= maxAge ;
    }
}
