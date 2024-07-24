import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
        //            list.add(645);
//        list.add(44);
//        list.add(484);
//        list.add(41);
//        list.add(88);
//        list.add(78);
//        list.add(47);
//        list.add(17);
//        list.add(52);
//        list.add(7);
//        list.add(14);
//        list.add(2);
//        list.add(7);
//        list.add(24);
//        list.add(4);
//
//        list.set(0,87);
//        list.remove(0);
//
//
//        System.out.println(list);

        for (int i = 0; i <5 ; i++) {
            list.add(in.nextInt());

        }

        for (int i = 0; i <5 ; i++) {
            System.out.println(list.get(i));
        }






    }
}
