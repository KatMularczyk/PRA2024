package fluentAPI;

import fluentAPI.interfaces.Title;

import fluentAPI.model.Person;
import fluentAPI.model.PersonBuilder;

import static fluentAPI.interfaces.Title.*;
public class MainFluentApi {

    public static void main(String[] args) {

        //Package-private constructor is not accessible here, we must use the builder:
        //Person p = new Person("a", Title.PROF);
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder.withName("Adam").build();
        Person person2 = personBuilder.withName("Anna").withTitle(DR).build();
        Person person3 = personBuilder.withName("Jan").withTitle(MGR).build();
        person.addFriend(person2).addFriend(person3);
        person.sayHelloToFriends();
       // person.processFriends(friends -> {
          //  friends.clear();
          //  return friends; <-- zwraca argument
          //  });

        //person.processFriendsInPlace(friends -> friends.clear());
        person.chooseBestFriend(friends-> friends.get(0)).print();
        // person.processFriends(friends -> {
        //  friends.clear();
        //  return friends; <-- zwraca argument
        //  });

        person.processFriendsInPlace(friends -> friends.clear());

        // Todo ok



    }
}