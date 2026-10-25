package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Wyz6 {
    /* W ramach programu nauczania w szkole średniej uczniowie muszą zgłosić się na ochotnika do udziału w co
    najmniej dwóch wydarzeniach rocznie. Masz listę nazwisk uczniów, a także listę z każdego wydarzenia z uczestnikami wydarzeń.
    Mając te informacje, musisz dowiedzieć się, którzy uczniowie nadal muszą uczestniczyć w większej liczbie wydarzeń w tym roku.
    W naszej przestrzeni kodu startowego mamy listę uczniów, a także mapę zawierającą każde wydarzenie wraz z uczniami, którzy wzięli
    udział w tym wydarzeniu. Twoim zadaniem jest zaimplementowanie funkcji findStudentsWithIncompleteVolunteerEvents.
    Implementację można zweryfikować za pomocą dołaczonych testów.
     */


    public static void main(String[] args) {
        List<String> students = List.of("Sally", "Polly", "Molly",
                "Tony", "Harry");

        Map<String, List<String>> attendeesMapping = Map.of("Farmer's Market", List.of("Sally", "Polly"),
                "Car Wash Fundraiser", List.of("Molly", "Tony", "Polly"),
                "Cooking Workshop", List.of("Sally", "Molly", "Polly"),
                "Midnight Breakfast", List.of("Polly", "Molly"));

        System.out.println(findStudentsWithIncompleteVolunteerEvents(
                students, attendeesMapping));
    }
    //
    public static List<String> findStudentsWithIncompleteVolunteerEvents(
            List<String> students,
            Map<String, List<String>> attendeesMapping) {

        Map<String,Integer> studentActivity=new HashMap<>();
        if(!students.isEmpty())
        for(String s:students)
            studentActivity.put(s,0);

        if(!attendeesMapping.isEmpty())
        for(List<String>a:attendeesMapping.values())
            for (String b:a)
                if(students.contains(b))
                    studentActivity.put(b,studentActivity.get(b)+1);




        return studentActivity.entrySet().stream().filter(n->n.getValue()<2).map(lista->lista.getKey()).toList();
    }



}
