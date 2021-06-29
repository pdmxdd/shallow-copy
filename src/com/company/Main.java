package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> items = new ArrayList<>();
        HashMap<String, String> itemOne = new HashMap<>();
        itemOne.put("description", "computer");
        itemOne.put("price", "1500.00");

        HashMap<String, String> itemTwo = new HashMap<>();
        itemTwo.put("description", "phone");
        itemTwo.put("price", "899.99");

        items.add(itemOne);
        items.add(itemTwo);

        // the following is an example of how two different variables can point at the same location in memory and a change to one affects BOTH of the variables:
        // a new arrayList called itemsTwo:
        ArrayList<HashMap<String, String>> itemsTwo = items;

        // let's print out the first elements "description" key in the items:
        System.out.println(items.get(0).get("description"));
        // let's print the same thing in itemsTwo
        System.out.println(itemsTwo.get(0).get("description"));

        // now let's change to that "description" value in itemsTwo
        itemsTwo.get(0).put("description", "toaster");

        // let's see how it changed itemsTwo:
        System.out.println(itemsTwo.get(0).get("description")); // this is what we expect!

        // let's look at our original items array and look at the first element:
        System.out.println(items.get(0).get("description")); // this is not what we expect!

        // they both show a change to the original value!
        // this is because they are referenced by memory (the variable points to their location in memory) so when we did line 23 it created a new variable that was pointing at the same location in memory
        // the implications are when a change is made to one of the variables it is reflected across both of the variables because they are both looking at the same spot in memory


        // if we don't want this and we truly want both of the variables to live in two separate locations in memory we need to tell the computer we need it to do that:

        // using a shallow copy .clone() so that the variables items and itemsTwo are pointing at two different locations in memory:
//        ArrayList<HashMap<String, String>> itemsTwo = new ArrayList<>();
//        for(HashMap<String, String> item : items) {
//            itemsTwo.add((HashMap<String, String>) item.clone());
//        }
//
//        itemsTwo.get(0).put("description", "toaster");
//
//        System.out.println(items.get(0).get("description"));
//        System.out.println(itemsTwo.get(0).get("description"));

    }
}
