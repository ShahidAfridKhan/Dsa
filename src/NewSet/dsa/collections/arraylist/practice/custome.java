package NewSet.dsa.collections.arraylist.practice;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Shahid{
    String name;
    int age;
    int star;

    Shahid(String name,int age,int star){
        this.name=name;
        this.age=age;
        this.star=star;
    }
}
public class custome {
    public static void main(String[] args) {
        Shahid s=new Shahid("hi",21,4);

        List<Shahid> list=new ArrayList<>();

        list.add(s);

    }
}
