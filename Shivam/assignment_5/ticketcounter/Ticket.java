package ticketcounter;

import java.util.*;

public class Ticket {
	
	 private int ticketid;
	    private int price;
	    private static int availableTickets;

	    public int getTicketid() {
	        return ticketid;
	    }

	    public void setTicketid(int ticketid) {
	        this.ticketid = ticketid;
	    }

	    public int getPrice() {
	        return price;
	    }

	    public void setPrice(int price) {
	        this.price = price;
	    }

	    public static int getAvailableTickets() {
	        return availableTickets;
	    }

	    public static void setAvailableTickets(int availableTickets) {
	        if (availableTickets >= 0) {
	            Ticket.availableTickets = availableTickets;
	        }
	    }

	    public int calculateTicketCost(int nooftickets) {
	        if (nooftickets <= availableTickets) {
	            availableTickets -= nooftickets;
	            return nooftickets * price;
	        } else {
	            return -1;
	        }
	    }
	

	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter no of bookings: ");
	        int noOfBookings = sc.nextInt();
	        
	        System.out.print("Enter the available tickets: ");
	        int availableTickets = sc.nextInt();
	        Ticket.setAvailableTickets(availableTickets);

	        for (int i = 0; i < noOfBookings; i++) {
	            Ticket ticket = new Ticket();
	            System.out.print("Enter the ticketid: ");
	            int ticketid = sc.nextInt();
	            ticket.setTicketid(ticketid);

	            System.out.print("Enter the price: ");
	            int price = sc.nextInt();
	            ticket.setPrice(price);

	            System.out.print("Enter the no of tickets: ");
	            int noOfTickets = sc.nextInt();

	            int totalAmount = ticket.calculateTicketCost(noOfTickets);
	            if (totalAmount != -1) {
	                System.out.println("Available tickets: " + Ticket.getAvailableTickets());
	                System.out.println("Total amount: " + totalAmount);
	                System.out.println("Available tickets after booking: " + Ticket.getAvailableTickets());
	            } else {
	                System.out.println("Tickets not available for booking.");
	            }
	        }

	        
	    }
	
		
		

	}


