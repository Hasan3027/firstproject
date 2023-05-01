package com.example.firstproject;

import com.example.firstproject.entity.*;
import com.example.firstproject.entity.Enums.Type;

import java.util.ArrayList;
import java.util.List;

public class DB {

    public static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<Post> posts = new ArrayList<>();
    public static ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Bank> banks = new ArrayList<>();
    public static ArrayList<Counter> counters = new ArrayList<>();

    public static void turnOn() {
        generateUsers();
        generatePosts();
        addDefaultBank();
        addCounter();
    }


    private static void generatePosts() {
        Post post = new Post(1, "salom", "valek", 1);
        Post post2 = new Post(2, "galati", "ekan", 1);

        Post post3 = new Post(3, "sabzi", "xurda", 2);
        Post post4 = new Post(4, "chupachups", "ekansan", 2);

        Post post6 = new Post(5, "dwdwawawa", "dadawdad2", 3);
        Post post5 = new Post(6, "Hasan ekasndaw", "hasan easma", 3);

        posts.add(post);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);
        posts.add(post5);
        posts.add(post6);
    }

    private static void generateUsers() {
        User user1 = new User(1, "Lola", "Hikmatova", 23);
        User user2 = new User(2, "Pari", "Nematova", 22);
        User user3 = new User(3, "Shohsanam", "Alimova", 21);

        users.add(user1);
        users.add(user2);
        users.add(user3);

        Address address = new Address();
        address.setCountry("UZB");
        address.setRegion("Bukhara");

        Student student = new Student();
        student.setId(1);
        student.setFirstname("Hasan");
        student.setLastname("Rasulov");
        student.setAge(23);
        student.setGender(true);
        student.setAddress(address);

        students.add(student);
    }

    private static void addCounter(){
        counters.addAll(List.of(
                new Counter(1,0),
                new Counter(2,0)
        ));
        Counter.nextId=3;
    }

    private static void addDefaultBank() {
        banks.addAll(List.of(
                new Bank(
                        1, 10.2, Type.CASH
                ),
                new Bank(
                        2, 2400.12, Type.CARD
                ),
                new Bank(
                        3, 4550.5, Type.BANK
                ),
                new Bank(
                        4, 7412.65, Type.PAY_ME
                )
        ));
        Bank.nextId = 4;
    }

}
