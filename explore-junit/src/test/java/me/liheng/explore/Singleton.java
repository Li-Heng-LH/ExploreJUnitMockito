package me.liheng.explore;

public class Singleton {

    private static Singleton instance;
    private int count = 1; // Question: Should this be static ???

    // private constructor restricted to this class itself
    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
