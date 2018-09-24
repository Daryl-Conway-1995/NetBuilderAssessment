package com.company;

public class Main {

    public static void main(String[] args) {
	    Family family = new Family();
        System.out.println(family.female("bob"));
        System.out.println(family.isFemale("bob"));
        System.out.println(family.male("lucy"));
        System.out.println(family.isFemale("lucy"));
        System.out.println(family.setParent("bob","lucy"));
        System.out.println(family.getParents("bob"));
        System.out.println(family.getChildren("lucy"));
    }
}
