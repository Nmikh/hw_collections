package com.custom_Collections;

public class CustomListTest {
    public static void main(String[] args) {
        CustomList customList = new CustomList();
        for (int i=0;i<10;i++){
            customList.add(i);
        }
        System.out.println(customList);
        System.out.println("test get "+customList.get(8));
        customList.remove(5);

    }
}
