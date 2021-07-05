package java_project;

import java.util.*;
class Add{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int x = obj.nextInt();
        System.out.println("Enter Second Number: ");
        int y = obj.nextInt();
        int result = add(x, y);

        System.out.println("result of addition = " + result);

    }

    static int add(int x , int y){
        return x+y;
    }
}