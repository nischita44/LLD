package SocialNetworkConnection;

import java.util.ArrayList;
import java.util.List;

public class User {
    int age;
    String name;
    String city;

    public User(int age, String name, String city){
        this.age = age;
        this.name = name;
        this.city = city;
        this.friends = new ArrayList<>();
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<User> getFriends() {
        return friends;
    }


    public void addFriend(User friend) {
        friends.add(friend);
    }

    private List<User> friends;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
