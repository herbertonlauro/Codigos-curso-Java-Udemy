package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();

        nameList.add("Vyctor");
        nameList.add("Vynícius");
        nameList.add("Sueli");
        nameList.add("Alex");
        nameList.add("ana");
        nameList.add(2, "Edns");

        for(String name : nameList) {
            System.out.println(name);
        }

        System.out.println(nameList.size());

        nameList.remove("Edns");

        System.out.println(nameList);

        nameList.remove(1);

        System.out.println(nameList);

        nameList.removeIf(x -> x.charAt(0) == 'V');

        System.out.println(nameList);

        System.out.println(nameList.indexOf("Sueli"));

        List<String> result = nameList.stream().filter(element -> element.charAt(0) == 'A').collect(Collectors.toList());

        for(String item: result) {
            System.out.println(item);
        }

        String name = nameList.stream().filter(x -> x.charAt(0) == 'S').findFirst().orElse(null);

        System.out.println(name);
    }
}
