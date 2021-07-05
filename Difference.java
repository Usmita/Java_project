package Java_project;

import java.util.*;
class Difference{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int x = obj.nextInt();
        System.out.println("Enter Second Number: ");
        int y = obj.nextInt();
        int result = difference(x, y);

        System.out.println("Difference = " + result);
        System.out.println("New line here");

    }

    static int difference(int x , int y){
        return x-y;
    }
}