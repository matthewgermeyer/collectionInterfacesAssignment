package com.example;

import java.util.Random;

public class Main {

    //This List will be Queue, qoo = new List..
    //previously: static List<Ticket> list = new ArrayList<>();
    public static Queue<Ticket> qoo = new Queue<>();
    static int count = 0;
    static Random rand = new Random();

    public static void main(String args[]) throws InterruptedException {

        while (true) {
            //make this apply to Queue using qoo.add();
            addToList();
            System.out.println("list is " + qoo);
            Thread.sleep(3000);
            removeFromList();
            Thread.sleep(3000);
        }

    }
    //add(E ticket) with regards to Queue
    private static void addToList() {
        //gathers a random int n (0-9)
        int n = rand.nextInt(10);
        // generates n tickets called T01
        for (int i = 0; i < n; ++i) {
            Ticket ticket = new Ticket("T1", ++count);
            qoo.add(ticket);
        }
    }

    //removeFromList
    //Previous working:  private static void removeFromList()
    private static void removeFromList() {
        rand = new Random();
        int n = rand.nextInt(10);
        for (int i = 0; i < n; ++i) {

            Ticket ticket = qoo.remove();
            System.out.println("removed " + ticket);
        }
    }
}

