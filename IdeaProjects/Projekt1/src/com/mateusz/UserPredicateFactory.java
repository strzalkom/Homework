package com.mateusz;

import java.util.function.Predicate;

/**
 * Created by lenovo on 06.06.2017.
 */
public class UserPredicateFactory {
    public static Predicate<String> nameStartsWith(String prefix) {
//        lambda jest anonimowa implementacja interfejsu
//   return new Predicate<String>() {
//       @Override
//       public boolean test(String s) {
//           return s.startsWith(prefix);
//       }
//   };
   return (e) -> e.startsWith(prefix);
    }
}
