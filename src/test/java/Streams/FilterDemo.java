package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {
        List<Integer> numberlist= Arrays.asList(10, 20, 29, 40, 49, 60);
        List<Integer> evenNumberList=new ArrayList<>();

       evenNumberList= numberlist.stream().filter(n-> n%2==0).collect(Collectors.toList());
       System.out.println(evenNumberList);
        numberlist.stream().filter(n-> n%2==0).forEach(n->System.out.println(n));
    }
}
