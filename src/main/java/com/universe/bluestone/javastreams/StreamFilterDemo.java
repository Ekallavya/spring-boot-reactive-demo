package com.universe.bluestone.javastreams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.jspecify.annotations.NonNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Data
class User{
    private String name;
    private String designation;
    private Long salary;
}
public class StreamFilterDemo {



    public static void main(String[] args) {

        List<User> users = getUsers();


        users.stream().filter(u-> {return ("Manager".equals(u.getDesignation()) || "SrManager".equals(u.getDesignation())) && u.getSalary() > 100000L;})
                        .forEach(System.out::println);

        System.out.println("-----------------------------");

        users.stream().filter(u-> ("Manager".equals(u.getDesignation()) || "SrManager".equals(u.getDesignation())) && u.getSalary() > 100000L)
                .sorted(Comparator.comparing(u-> u.getName().length()))
                .forEach(System.out::println);

        System.out.println("-----------------------------");
        users.stream().filter(u-> ("Manager".equals(u.getDesignation()) || "SrManager".equals(u.getDesignation())) && u.getSalary() > 100000L)
                .sorted(Comparator.comparing(u-> u.getName().length()))
                .sorted(Comparator.comparing(User::getSalary).reversed())
                .forEach(System.out::println);

    }

    private static @NonNull List<User> getUsers() {
        User user1 = new User("John", "Developer", 50000L);
        User user2 = new User("Jane", "Manager", 170000L);
        User user3 = new User("Decock", "Manager", 60000L);
        User user4 = new User("David", "SrManager", 90000L);
        User user5 = new User("Clark", "Developer", 130000L);
        User user6 = new User("Steve", "Developer", 90000L);
        User user7 = new User("Border", "SrManager", 130000L);
        User user8 = new User("Richards", "Manager", 140000L);
        User user9 = new User("Richardson", "Lead", 60000L);
        User user10 = new User("MacGrath", "Developer", 60000L);
        User user11 = new User("Lara", "Director", 190000L);

        return List.of(user1,user2,user3,user4,user5,user6,user7,user8,user9,user10,user11);
    }
}
