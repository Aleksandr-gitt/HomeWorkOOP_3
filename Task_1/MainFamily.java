package HomeWorkOOP_3.Task_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MainFamily {
    public static void main(String[] args) {
        List<Person> family = new ArrayList<>();
        family.add(new Person("Mike", 36));
        family.add(new Person("Kate", 33));
        family.add(new Person("John", 6));
        family.add(new Person("Samanta", 8));


        //for each метод
        System.out.println("For each метод: ");
        for(Person el:family){System.out.println(el);}   
        System.out.println("-----------------");

        //Iterator
        System.out.println("Итератор: ");
        Iterator<Person> iter = family.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("-----------------");


        // Сортируем членов семьи с помощью Comparable:
        System.out.println("Сортировка с использованием Comparable (по возрасту):");
        Collections.sort(family);
        for(Person person:family){System.out.println(person);}
        System.out.println("-----------------");

        // Создаем компаратор для сравнения членов семьи по их именам
        Comparator<Person> nameComparator = new Comparator<Person>() {
            @Override
            public int compare(Person perso1, Person person2) {
                return perso1.getName().compareTo(person2.getName());
            }
        };

        // Сортируем членов семьи с использованием компаратора
        System.out.println("Сортировка с использованием Comparator (по имени):");
        Collections.sort(family, nameComparator);
        for (Person person : family) {
            System.out.println(person);
        }




        
        // Iterable<Person> IterablePers = family;
        // for(Person el: IterablePers){
        //     System.out.println(el + "!");
        // }
        // System.out.println("-----------------");
        
        // // IterablePers.iterator(family);
        // for(Person el: IterablePers){
        //     System.out.println(el + "!!!");
        // }

    }

   

    
}




