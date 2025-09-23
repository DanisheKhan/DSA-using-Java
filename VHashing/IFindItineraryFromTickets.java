package VHashing;

import java.util.*;

public class IFindItineraryFromTickets {
  public static void main(String[] args) {
    HashMap<String, String> tickets = new HashMap<>();
    tickets.put("Chennai", "Bangalore");
    tickets.put("Bombay", "Delhi");
    tickets.put("Goa", "Chennai");
    tickets.put("Delhi", "Goa");

    printItinerary(tickets);
  }

  public static void printItinerary(HashMap<String, String> tickets) {
    // Find the starting point
    HashSet<String> destinations = new HashSet<>(tickets.values());
    String start = "";
    for (String key : tickets.keySet()) {
      if (!destinations.contains(key)) {
        start = key;
        break;
      }
    }

    // Print the itinerary
    while (tickets.containsKey(start)) {
      String next = tickets.get(start);
      System.out.println(start + " -> " + next);
      start = next;
    }
  }
}
