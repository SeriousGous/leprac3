package com.company;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human(70,173,20, new Leg(2,50,10),new Hand(2,35,5),new Head("Round", 20,20));
        System.out.println(human.toString());
    }
}