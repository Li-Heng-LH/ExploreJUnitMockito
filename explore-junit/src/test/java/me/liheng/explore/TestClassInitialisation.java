package me.liheng.explore;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestClassInitialisation {

    private List<String> list = new ArrayList<>();
    private String string =
            "*****************************\n" +
            "String has been initialised!!!\n" +
            "*****************************\n";

    @Test
    public void testStringInitialisation() {
        System.out.println(string);
    }

    @Test
    public void testListInitialisation(){
        list.add("******");
        list.add("This");
        list.add("is");
        list.add("from");
        list.add("a");
        list.add("list");
        list.add("******");
        System.out.println(list.toString());
    }

    @Test
    public void y_modifyList() {
        modifyList();
        System.out.println(list.toString());
    }

    @Test
    public void z_printList() {
        System.out.println("Printing list: " + list.toString());
    }

    private void modifyList() {
        list.add("******");
        list.add("x");
        list.add("y");
        list.add("z");
        list.add("******");
    }

}
