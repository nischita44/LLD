package SocialNetworkConnection;

public class AndSpecification<User> implements Specification<User>{

    Specification<User> first;
    Specification<User> second;

    public AndSpecification(Specification<User> first, Specification<User> second){
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSpecified(User user) {
        return first.isSpecified(user) && second.isSpecified(user);
    }
}
