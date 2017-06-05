package com.mateusz.builder;

/**
 * Created by lenovo on 05.06.2017.
 */
public class User {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private String phoneNumber;
    private String age;

    public static UserBuilder builder() {
        return new UserBuilder();



    }


    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String age;

     public UserBuilder firstName(String firstName) {
         this.firstName = firstName;
         return this;
     }
     public UserBuilder lastName(String lastName) {
         this.lastName = lastName;
          return this;
     }
     public UserBuilder phoneNumber(String phoneNumber) {
         this.phoneNumber = phoneNumber;
         return this;
     }
     public UserBuilder age(String age){
         this.age = age;
          return this;

    }
public User build() {
         User user = new User();

         user.setPhoneNumber(phoneNumber);
         user.setLastName(lastName);
         user.setAge(age);
         user.setFirstName(firstName);
         return user;
}

}
}