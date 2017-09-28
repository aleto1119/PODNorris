package com.java.lessons.lambda.basic;

import com.java.lessons.lambda.basic.utils.Utils;

import java.util.*;

/**
 * Created by diego.joya on 9/27/2017.
 */
public class Exercise1BasicLambdas {

    public static void main(String[] args) {
        new Exercise1BasicLambdas().sortArrayByLenghtUsingNiceClassicWay();
        new Exercise1BasicLambdas().sortArrayByLengthUsingObscureLambdaWay();
        new Exercise1BasicLambdas().sortArrayByReverseLengthUsingNiceClassicWay();
        new Exercise1BasicLambdas().sortArrayByReverseLengthUsingObscureLambdaWay();
        new Exercise1BasicLambdas().sortArrayAlphabeticallyUsingNiceClassicWay();
        new Exercise1BasicLambdas().sortArrayAlphabeticallyUsingObscureLambdaWay();
        new Exercise1BasicLambdas().sortArrayContainingEFirstUsingNiceClassicWay();
        new Exercise1BasicLambdas().sortArrayContainingEFirstUsingObscureLambdaWay();
        new Exercise1BasicLambdas().sortArrayContainingEFirstUsingObscureLambdaWayAndUtilsClass();
    }

    public void sortArrayByLenghtUsingNiceClassicWay() {
        List<String> sortableList = populateList();
        Collections.sort(sortableList, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if(a.length() < b.length()) {
                    return -1;
                } else if(a.length() == b.length()) {
                    return 0;
                } else {
                    return 1;
                }

            }
        });
        System.out.println("Sorted by length with classic nice, beautiful and pristine method");
        printList(sortableList);
    }

    public void sortArrayByLengthUsingObscureLambdaWay() {
        List<String> sortableList = populateList();
        Collections.sort(sortableList, (String a, String b) -> {
            if(a.length() < b.length()) {
                return -1;
            } else if(a.length() == b.length()) {
                return 0;
            } else {
                return 1;
            }});
        System.out.println("Sorted by length with obscure lambda method");
        printList(sortableList);
    }

    public void sortArrayByReverseLengthUsingNiceClassicWay() {
        List<String> sortableList = populateList();
        Collections.sort(sortableList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() < o2.length()) {
                    return 1;
                } else if(o1.length() == o2.length()) {
                    return 0;
                } else {
                    return -1;
                }

            }
        });
        System.out.println("Sorted by reverse length with classic nice, beautiful and pristine method");
        printList(sortableList);
    }

    public void sortArrayByReverseLengthUsingObscureLambdaWay() {
        List<String> sortableList = populateList();
        Collections.sort(sortableList, (String a, String b) -> {
            if(a.length() < b.length()) {
                return 1;
            } else if(a.length() == b.length()) {
                return 0;
            } else {
                return -1;
            }});
        System.out.println("Sorted by reverse length with obscure lambda method");
        printList(sortableList);
    }

    public void sortArrayAlphabeticallyUsingNiceClassicWay() {
        List<String> sortableList = populateList();
        Collections.sort(sortableList, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if(a.charAt(0) < b.charAt(0)) {
                    return -1;
                } else if(a.length() == b.length()) {
                    return 0;
                } else {
                    return 1;
                }

            }
        });
        System.out.println("Sorted alphabetically with classic nice, beautiful and pristine method");
        printList(sortableList);
    }

    public void sortArrayAlphabeticallyUsingObscureLambdaWay() {
        List<String> sortableList = populateList();
        Collections.sort(sortableList, (String a, String b) -> {
            if(a.charAt(0) < b.charAt(0)) {
                return -1;
            } else if(a.length() == b.length()) {
                return 0;
            } else {
                return 1;
            }});
        System.out.println("Sorted alphabetically with obscure lambda method");
        printList(sortableList);
    }

    public void sortArrayContainingEFirstUsingNiceClassicWay() {
        List<String> sortableList = populateList();
        Collections.sort(sortableList, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if(a.contains("e") && !b.contains("e")) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("Sorted containing 'e' first with classic nice, beautiful and pristine method");
        printList(sortableList);
    }

    public void sortArrayContainingEFirstUsingObscureLambdaWay() {
        List<String> sortableList = populateList();
        Collections.sort(sortableList, (String a, String b) -> {
            if(a.contains("e") && !b.contains("e")) {
                return -1;
            } else {
                return 0;
            }});
        System.out.println("Sorted containing 'e' first with obscure lambda method");
        printList(sortableList);
    }

    public void sortArrayContainingEFirstUsingObscureLambdaWayAndUtilsClass() {
        List<String> sortableList = populateList();
        Collections.sort(sortableList, (String a, String b) -> Utils.compare(a, b));
        System.out.println("Sorted containing 'e' first with obscure lambda method and utils class");
        printList(sortableList);
    }

    private List<String> populateList() {
        List<String> list = new ArrayList<>();

        list.add("Rojo");
        list.add("Azul");
        list.add("Purpura");
        list.add("Amarillo");
        list.add("Cafe");
        list.add("Rosado");
        list.add("Verde");
        list.add("Negro");

        return list;
    }

    private void printList(List<String> sortedList) {
        System.out.println(Arrays.asList(sortedList));
    }

}
