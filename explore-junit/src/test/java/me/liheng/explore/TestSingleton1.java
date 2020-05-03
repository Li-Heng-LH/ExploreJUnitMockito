package me.liheng.explore;

import org.junit.Test;

public class TestSingleton1 {

    @Test
    public void test() {
        Singleton singleton = Singleton.getInstance();
        System.out.println("************");
        System.out.println("From TestSingleton 1");
        System.out.println(singleton.hashCode());
        System.out.println(singleton.getCount());
        System.out.println("************");
        System.out.println("Reset:");
        singleton.setCount(999);
        System.out.println(singleton.hashCode());
        System.out.println(singleton.getCount());
        System.out.println("************\n");
    }
}
