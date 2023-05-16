import java.util.ArrayList;
import java.util.List;

public class MyClass {


    public static void main(String[] args) {

        int[] myArray = {1,2,3,4,5};

        ArrayList<Integer> myList = fillArray(myArray);


        System.out.println(myArray[3]);
        System.out.println(myList.get(3));

        sayHello();
        sayWorld(true);
        sayWorld(false);
        loopArray(myArray);

    }

    public static void loopArray(int[] myArray){
        for(int i = 0; i < myArray.length; i++){
            System.out.println("Positie " +i +" van myArray: " + myArray[i]);
        }
    }

    public static ArrayList<Integer> fillArray(int[] myArray){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : myArray){
            list.add(i);
        }
        return list;
    }


    public static void sayHello() {

        System.out.println("Hello"); // Prints "Hello"

    }


// shouldPrintExclamation = true

    private static void sayWorld(boolean shouldPrintExclamation) {

        if (shouldPrintExclamation) {

            System.out.println("World!"); // Prints "World!"

        } else {

            System.out.println("World");

        }

    }

}
