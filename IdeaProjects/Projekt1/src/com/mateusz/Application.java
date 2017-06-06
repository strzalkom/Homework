package com.mateusz;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * Created by lenovo on 02.06.2017.
 */
public class Application {
    public static void main(String[] args) {



        List<String> names = Arrays.asList("Szymon", "Adam", "Anna");

                        List<List<String>> nameList = Arrays.asList(
                                Arrays.asList("Szymon", "Wojciech", "Adam"),
                                Arrays.asList("Anna", "Janina", "Malgorzata"));

                        System.out.println("List");
                nameList.stream()
                                .flatMap(e -> e.stream())
                                .filter(new Predicate<String>() {
                     @Override
                     public boolean test(String s) {
                                        return s.startsWith("A");
                                    }
                 })
                                .filter(e -> e.startsWith("A"))
                                .filter(UserPredicateFactory.nameStartsWith("A"))
                                .sorted()
                                .forEach(e -> System.out.println(e));

                        Map<String, List<String>> map = new HashMap<>();
                map.put("men", Arrays.asList("Szymon", "Wojciech", "Adam"));
                map.put("woman", Arrays.asList("Anna", "Janina", "Malgorzata"));

                        System.out.println("\nMap");
                map.entrySet()
                                .stream()
                                .map(e -> e.getValue())
                                .flatMap(e -> e.stream())
                                .filter(UserPredicateFactory.nameStartsWith("A"))
                                .sorted()
                                .forEach(e -> System.out.println(e));

                names.stream()

                        .flatMap(e -> Arrays.asList(e.split("")).stream())
                        .distinct()

                        .sorted();
        //                .forEach(System.out::println);
                //        actions.forEach(e -> e.doAction());
    }
}

//lambda - > implementacja interfejsu z jedna metoda


