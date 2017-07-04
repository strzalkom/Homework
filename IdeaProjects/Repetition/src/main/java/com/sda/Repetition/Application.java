package com.sda.Repetition;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by lenovo on 01.07.2017.
 */
public class Application {
    public static void main(String[] args) {


        Addres addres = Addres.builder()
                .city("Poznan")
                .street("Dabrowskiego")
                .flatNumber(22)
                .postalCode("12-412")
                .build();
        Addres addres2 = Addres.builder()
                .city("Warszawa")
                .street("Dabrowskiego")
                .flatNumber(21)
                .postalCode("11-412")
                .build();
        Addres addres3 = Addres.builder()
                .city("Wroclaw")
                .street("Arowskiego")
                .flatNumber(12)
                .postalCode("12-412")
                .build();

        User user = User.builder()
                .firstName("Mateusz")
                .lastName("Strzalko")
                .age(21)
                .phoneNumber("1232321312")
                .addres(addres)
                .build();
        User user2 = User.builder()
                .firstName("Anna")
                .lastName("Konieczna")
                .age(21)
                .phoneNumber("1221312")
                .addres(addres2)
                .build();
        User user3 = User.builder()
                .firstName("Mariusz")
                .lastName("Mop")
                .age(22)
                .phoneNumber("1234312")
                .addres(addres3)
                .build();
        User user4 = User.builder()
                .firstName("Jan")
                .lastName("Koleski")
                .age(51)
                .phoneNumber("12312021312")
                .addres(addres)
                .build();
        List<User> users = Arrays.asList(user, user2, user3, user4);
        List<String> list = new ArrayList<>();

        System.out.println("wyswietlic wszystkich userow");

        users.stream()
                .map(e -> e.toString())
                .forEach(e -> System.out.println(e));
        System.out.println(" wyswietlic tylko userow ktorych iek jest powyzej 35");
        users.stream()
                .filter(e -> e.getAge() > 35)
                .forEach(e -> System.out.println(e));
        System.out.println("wyswietlic wszystkich userow z Poznania");
        users.stream()
                .filter(e -> e.getAddres().getCity().equals("Poznan"))
                .forEach(e -> System.out.println(e));
        System.out.println("wyswietlic wszystkich userow ktorych kod pocztowy zaczyna sie na 12");
        users.stream()
                .filter(e -> e.getAddres().getPostalCode().startsWith("12"))
                .filter(e -> e.getAddres().getCity().equals("Wroclaw"))
                .forEach(e -> System.out.println(e));
        System.out.println("zliczyc wystapienia nazwiska Kowalski");
        users.stream()
                .map(e -> e.getLastName())
                .filter(e -> "Kowalski".equals(e))
                .count();
        System.out.println("zliczyc ilosc adresow");
        users.stream()
                .map(e -> e.getAddres())
                .distinct()
                .count();

        System.out.println("wystwietlic wszystkie osoby ktore mieszkaja pod tym samym adres2");
        users.stream()
                .filter(e -> e.getAddres().equals(addres2))
                .forEach(e -> System.out.println(e));

        System.out.println("utworzyc liste userow ktorych imie zaczyna sie na J");
        List<User> usersWithFirstNameStartingAtJ = users.stream()
                .filter(e -> e.getFirstName().startsWith("J"))
                .collect(Collectors.toList());

        System.out.println("sprawdzic czy w kolekcji istnieeje ktokolwiek z miasta Kalisz");
        System.out.println(users.stream()
                .map(e -> e.getAddres())
                .distinct()
                .map(e -> e.getCity())
                .anyMatch(e -> "Kalisz".equals(e)));


        System.out.println("  sprawdzic czy wszyscy userzy o nazwisku Kowalski mieszkaja w Poznaniu");
        System.out.println(users.stream()
                .filter(e -> "Kowalski".equals(e.getLastName()))
                .map(e -> e.getAddres())
                .map(e -> e.getCity())
                .distinct()
                .allMatch(e -> "Poznan".equals(e)));

        System.out.println("Obliczyc srednia wieku userow");
        System.out.println(users.stream()
                .mapToInt(e -> e.getAge())
                .average()
                .getAsDouble());

        System.out.println("Wyswietlic hashe wszystkich userow");
        users.stream()
                .map(e -> e.getAddres())
                .mapToInt(e -> e.hashCode())
                .forEach(e -> System.out.println(e));
        System.out.println();


        Map<String, List<User>> usersByDistrict = new HashMap<>();
        usersByDistrict.put("wielkopolskie", Arrays.asList(user, user2));
        usersByDistrict.put("mazowieckie", Arrays.asList(user3, user4));
//     7   zrobic z tego liste userow
        System.out.println("1.Zrobic z tego liste userow");
        usersByDistrict.entrySet().stream()
                .map(e -> e.getValue())
                .flatMap(e -> e.stream())
                .forEach(e -> System.out.println(e));



    }
}