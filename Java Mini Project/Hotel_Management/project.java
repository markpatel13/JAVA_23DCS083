import java.util.*;
class Room {
    protected int roomNumber;
    protected boolean isOccupied;
    protected double pricePerNight;
    protected double balance; 

    public Room(int roomNumber, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.pricePerNight = pricePerNight;
        this.isOccupied = false;
        this.balance = pricePerNight; 
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public double getBalance() {
        return balance;
    }

    // Check-in method with payment
    public void checkIn(double amountPaid) {
        if (!isOccupied) {
            System.out.println("Room " + roomNumber + " price per night is Rs." + pricePerNight);

            if (amountPaid > balance) {
                System.out.println("You have overpaid. Only Rs." + balance + " is needed. Refunding excess amount.");
                balance = 0;
            } else {
                balance -= amountPaid;
                System.out.println("Payment of Rs." + amountPaid + " received. Remaining balance: Rs." + balance);
            }

            if (balance == 0) {
                isOccupied = true;
                System.out.println("Room " + roomNumber + " is now fully paid and occupied.");
                HotelManager.incrementCount();
            } else {
                System.out.println("Room " + roomNumber + " is not fully paid yet.");
            }
        } else {
            System.out.println("Room " + roomNumber + " is already occupied.");
        }
    }

    public void checkOut() {
        if (isOccupied) {
            isOccupied = false;
            balance = pricePerNight; // Reset balance for the next guest
            System.out.println("Room " + roomNumber + " is now available.");
            HotelManager.decrementCount();
        } else {
            System.out.println("Room " + roomNumber + " is already vacant.");
        }
    }
}

// Room Section
class SingleRoom extends Room {
    public SingleRoom(int roomNumber, double pricePerNight) {
        super(roomNumber, pricePerNight);
    }

    @Override
    public String toString() {
        return "Single Room [Room Number: " + roomNumber + ", Price per Night: Rs." + pricePerNight + "]";
    }
}

class DoubleRoom extends Room {
    public DoubleRoom(int roomNumber, double pricePerNight) {
        super(roomNumber, pricePerNight);
    }

    @Override
    public String toString() {
        return "Double Room [Room Number: " + roomNumber + ", Price per Night: Rs." + pricePerNight + "]";
    }
}

class FamilyRoom extends Room {
    public FamilyRoom(int roomNumber, double pricePerNight) {
        super(roomNumber, pricePerNight);
    }

    @Override
    public String toString() {
        return "Family Room [Room Number: " + roomNumber + ", Price per Night: Rs." + pricePerNight + "]";
    }
}

// Hotel Manager 
class HotelManager {
    private ArrayList<Room> rooms;
    private static int count = 0; 

    public HotelManager() {
        rooms = new ArrayList<>();
    }

    public static void incrementCount() {
        count++;
    }

    public static void decrementCount() {
        count--;
    }

    public static int getCount() {
        return count;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

   
    public void showAvailableRooms() {
        System.out.println("Available Rooms:");
        boolean available = false;
        for (Room room : rooms) {
            if (!room.isOccupied()) {
                available = true;
                System.out.println(room);
            }
        }
        if (!available) {
            System.out.println("No rooms are available at the moment.");
        }
    }

    public void checkIn(int roomNumber, double amountPaid) {
        Room room = getRoomByNumber(roomNumber);
        if (room != null) {
            room.checkIn(amountPaid);
        } else {
            System.out.println("Room " + roomNumber + " does not exist.");
        }
    }

    
    public void checkOut(int roomNumber) {
        Room room = getRoomByNumber(roomNumber);
        if (room != null) {
            room.checkOut();
        } else {
            System.out.println("Room " + roomNumber + " does not exist.");
        }
    }

    private Room getRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }
}

public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelManager hotelManager = new HotelManager();

        hotelManager.addRoom(new SingleRoom(101, 1000));
        hotelManager.addRoom(new DoubleRoom(102, 1500));
        hotelManager.addRoom(new FamilyRoom(103, 5000));
        hotelManager.addRoom(new DoubleRoom(104, 1500));

        int choice;
        System.out.println("\n--- Hotel Management System ---");
        System.out.println("1. Show Available Rooms");
        System.out.println("2. Check In");
        System.out.println("3. Check Out");
        System.out.println("4. Total Room Booked");
        System.out.println("5. Exit");
        do {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    hotelManager.showAvailableRooms();
                    break;
                case 2:
                    System.out.print("Enter room number to check in: ");
                    int roomNumberCheckIn = sc.nextInt();
                    System.out.print("Enter the amount to pay: ");
                    double amountPaid = sc.nextDouble(); // Collect payment amount
                    hotelManager.checkIn(roomNumberCheckIn, amountPaid); // Pass scanner for payment
                    break;
                case 3:
                    System.out.print("Enter room number to check out: ");
                    int roomNumberCheckOut = sc.nextInt();
                    hotelManager.checkOut(roomNumberCheckOut);
                    break;
                case 4:
                    System.out.println("Total Rooms Booked: " + HotelManager.getCount());
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 5);

        sc.close();
    }
}
