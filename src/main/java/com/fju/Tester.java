package com.fju.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(Station.TAIPEI_STATION,Station.KAOHSIUNG_STATION);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station? (1: Taipei, 2: Taichung, 3: Kaohsiung)");

        int choice = Integer.parseInt(scanner.next());
        switch (choice) {

        }
    }
}
