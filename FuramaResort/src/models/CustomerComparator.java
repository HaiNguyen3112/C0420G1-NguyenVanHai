package models;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {
    @Override
    public int compare( Customer o1, Customer o2 ) {
        int compare;
        compare = o1.getName().compareTo(o2.getName());
        if (compare!= 0){
            return compare;
        } else {
            compare = o1.getBirthDay().substring(6,10).compareTo(o2.getBirthDay().substring(6,10));
            if (compare != 0){
                return compare;
            }
        }
        return 0;
    }
}
