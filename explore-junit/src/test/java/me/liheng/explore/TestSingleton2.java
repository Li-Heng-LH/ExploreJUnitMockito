package me.liheng.explore;

import org.junit.Test;

public class TestSingleton2 {

    @Test
    public void test() {
        Singleton singleton = Singleton.getInstance();
        System.out.println("************");
        System.out.println("From TestSingleton 2");
        System.out.println(singleton.hashCode());
        System.out.println(singleton.getCount());
        System.out.println("************");
        System.out.println("Reset:");
        singleton.setCount(888);
        System.out.println(singleton.hashCode());
        System.out.println(singleton.getCount());
        System.out.println("************\n");
    }
}
