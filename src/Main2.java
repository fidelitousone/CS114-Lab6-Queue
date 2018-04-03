/*
* Author: Jatinder Singh
*/

import java.util.LinkedList;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) {

        int timeCounter = 0;

        final int TIME_TO_SERVE  = 120;
        final int TIME_ARRIVAL = 15;

        Queue<TicketBuyer> line = new LinkedList<>();


        // Add 50 customers to the queue all arriving 15 seconds
        for (int i = 0; i < 50; i++) {
            line.add(new TicketBuyer(TIME_ARRIVAL));
        }


        // U
        while (!line.isEmpty()) {

            line.peek().setDepartureTime(TIME_TO_SERVE);

            timeCounter += line.poll().totalTime();
        }

        System.out.println("Number of Cashiers 1: ");
        System.out.println("Average time: " + timeCounter);


    }
}
