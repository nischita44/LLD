package SocialNetworkConnection;

import java.util.*;

public class UserFilter {

    public static void main(String[] args) {
        int maxLevel = 2;


        // Create users
        User alice = new User(25, "Alice", "New York");
        User bob = new User(30, "Bob", "San Francisco");
        User charlie = new User(30, "Charlie", "New York");
        User dave = new User(28, "Dave", "New York");
        User eve = new User(22, "Eve", "San Francisco");

        // Establish friendships
        alice.addFriend(bob);
        bob.addFriend(charlie);
        charlie.addFriend(dave);
        dave.addFriend(eve);


        Specification<User> ageSpecification = new AgeSpecification(25, 30);
        Specification<User> citySpec = new CitySpecification("New York");
        Specification<User> combinedSpec = new AndSpecification<User>(ageSpecification, citySpec);

        //business logic
        // we need to traverse till level 2 using bfs
        List<User> user = new ArrayList<>();
        Queue<User> bfs = new LinkedList<>();
        Set<User> visited = new HashSet<>();
        Map<User, Integer> levels = new HashMap<>();

        bfs.add(alice);
        visited.add(alice);
        levels.put(alice, 0);


        while (!bfs.isEmpty()){

            User currentUser = bfs.poll();
            // get the level of current user
            int currentLevel = levels.get(currentUser);

            // whichever user satifies the criteria are added to the result list
            if(combinedSpec.isSpecified(currentUser)){
                user.add(currentUser);
            }

            if(currentLevel < maxLevel){
                for(User friends: currentUser.getFriends()){
                    if(!visited.contains(friends)){
                        visited.add(friends);
                        bfs.add(friends);
                        levels.put(friends, currentLevel + 1);
                    }
                }

            }


        }
        System.out.println("Filtered Users:");

        for (User result : user) {
            System.out.println(result);
        }
    }
}
