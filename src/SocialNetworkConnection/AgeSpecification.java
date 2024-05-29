package SocialNetworkConnection;

class AgeSpecification implements Specification<User> {
    private int minAge;
    private int maxAge;

    public AgeSpecification(int minAge, int maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    @Override
    public boolean isSpecified(User user) {
        int age = user.getAge();
        return age >= minAge && age <= maxAge;
    }

}