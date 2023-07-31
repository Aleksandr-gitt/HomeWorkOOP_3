package HomeWorkOOP_3.Task_1;

import java.util.Iterator;

public class Person implements Comparable<Person>{

    private String name;
    private int age;
    

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : " + this.name + ", Age :" + this.age;
    }

    // @Override
    // public Iterator<String> iterator() {
    //     return new Iterator<String>(){
    //         String index;
            

    //         @Override
    //         public boolean hasNext() {
    //             return index != "";
    //         }

    //         @Override
    //         public String next() {
    //             return index + "Наконец-то";
    //         }
    //     };
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);

    }

    // @Override
    // public Iterator<String> iterator() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    // }

    
}
    
    

    

    // Для ITERABLE
    // ===========================================================================
    

    // class IteratorString implements java.util.Iterator<String>{

    // String now;

    // public IteratorString(String now) {
    // this.now=now;
    // }

    // @Override
    // public boolean hasNext() {
    // return now != null;
    // }

    // @Override
    // public String next() {
    // return "+";
    // }


// ================================================================================================
