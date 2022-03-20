package Homeworks.Week3;

public class SecondPart {

    public static void main(String[] args) {
        String myName = "Asya";
        String myFamilyName = "Vladimirova";
        String myFriendName = "Asen";
        String myFriendFamilyName = "Petrov";

        byte myAge = 32;
        byte myFriendAge = 30;

        System.out.println(myName);

        System.out.println(myName.equals(myFriendName));
        System.out.println(myName.equalsIgnoreCase(myFriendName));
        System.out.println(myName.compareTo(myFriendName));

        System.out.println(myName + " " + myFamilyName);
        System.out.println(myAge);
        System.out.println(myName + " " + myFamilyName + " " + myAge);

        System.out.println(myFriendName + " " + myFriendFamilyName + " " + myFriendAge);
    }

}
