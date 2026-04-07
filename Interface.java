interface UserDetails {
    void getUser(String name, int age, String place);
}

interface SubscriptionDetails {
    void getSubscription(String sub);
}

class GymMember implements UserDetails, SubscriptionDetails {

    String userName;
    int userAge;
    String userPlace;
    String subscriptionName;

    public void getUser(String name, int age, String place) {
        userName = name;
        userAge = age;
        userPlace = place;
    }

    public void getSubscription(String sub) {
        subscriptionName = sub;
    }

    void display() {
        System.out.println("User Name: " + userName);
        System.out.println("Age: " + userAge);
        System.out.println("Place: " + userPlace);
        System.out.println("Subscription: " + subscriptionName);
    }
}

public class Interface {
    public static void main(String[] args) {

        GymMember g = new GymMember();

        g.getUser("Arun", 24, "Coimbatore");
        g.getSubscription("Platinum Plan");

        g.display();
    }
}