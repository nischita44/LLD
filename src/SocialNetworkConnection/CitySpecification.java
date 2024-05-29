package SocialNetworkConnection;

public class CitySpecification implements Specification<User>{
    String city;

    public CitySpecification(String city){
        this.city = city;
    }
    @Override
    public boolean isSpecified(User user) {
        return user.getCity().equalsIgnoreCase(city);
    }
}
