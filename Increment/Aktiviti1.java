package Increment;

public class Aktiviti1 {
    public static void main(String [] args) {
        int w=1, x=1, y=1, z=1;
        int a = w++;
        int b = ++x;
        int c = y--;
        int d = --z;

        System.out.println("Post Increment a = "+a+" w = "+w);
        System.out.println("Pre Increment b = "+b+" w = "+x);
        System.out.println("Post Increment c = "+c+" w = "+y);
        System.out.println("Post Increment d = "+d+" w = "+z);
    }
}