package HomeWorkOOP_3.Task_1;

import java.util.ArrayList;
import java.util.List;


public class IterPerson implements Iterable<String> {

    ArrayList<String> col;
    

    public IterPerson(ArrayList<String> col) {
        this.col = col;
    }

    @Override
    public java.util.Iterator<String> iterator() {
        return new Iterator();
    }


    class Iterator implements java.util.Iterator<String>{

        String now;

        // public Iterator

        @Override
        public boolean hasNext() {
            return now != null;
        }

        @Override
        public String next() {
            return now;
        }

    }

    

}
