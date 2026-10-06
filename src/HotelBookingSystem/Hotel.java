package HotelBookingSystem;


import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private String location;
    private List<Room> rooms;

    public Hotel(String name, String location) {
        this.name = name;
        this.location = location;
        this.rooms = new ArrayList<>();
    }

    // Add room to hotel
    public void addRoom(Room room) {
        rooms.add(room);
    }

    // Show all rooms
    public void showRooms() {
        System.out.println("\nRooms in " + name + " (" + location + "):");
        for (Room r : rooms) {
            System.out.println(r);
        }
    }

    // Show only available rooms
    public void showAvailableRooms() {
        System.out.println("\nAvailable Rooms:");
        for (Room r : rooms) {
            if (r.isAvailable()) {
                System.out.println(r);
            }
        }
    }

    // Getter for rooms list (optional)
    public List<Room> getRooms() {
        return rooms;
    }
}

