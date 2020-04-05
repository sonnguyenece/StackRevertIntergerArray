package Main;

import LinkedList.MyGenericStack;

public class EmptyStack<E> {
    public static void main(String[] args) {
        stackOfIntegers();
        stackOfIStrings();
    }

    public static void stackOfIStrings() {
        String[] stringArr = {"10 "," 20 ", "30 ", "40 ", "50 ", "60 ", "70 "," 80 ", "90 ","100 "};
        MyGenericStack<String> myStack = new MyGenericStack();
        for (int i = 0; i < stringArr.length; i++) {
            myStack.push(stringArr[i]);
        }
        for (int i = 0; i < stringArr.length; i++) {
            stringArr[i] = myStack.get(i);
        }
        System.out.println("\nDisplay array (String type):");
        for (int i = 0; i < stringArr.length; i++) {
            System.out.print(stringArr[i]+" ");
        }
    }


    public static void stackOfIntegers() {
        int[] integerArr = {10 ,20 , 30 , 40 , 50, 60, 70,80 , 90,100 };
        MyGenericStack<Integer> myStack = new MyGenericStack();
        for (int i = 0; i < integerArr.length; i++) {
            myStack.push(integerArr[i]);
        }
        for (int i = 0; i < integerArr.length; i++) {
            integerArr[i] = myStack.get(i);
        }
        System.out.println("Display array (integer type):");
        for (int i = 0; i < integerArr.length; i++) {
            System.out.print(integerArr[i]+" ");
        }
    }

}
