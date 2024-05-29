package StudentsFilter;

public class CitySpecification implements Specification<Student>{

    String city;

    public CitySpecification(String city){
        this.city = city;
    }

    @Override
    public boolean isSatisfied(Student student) {
        return student.getCity().equals(city);
    }
}
