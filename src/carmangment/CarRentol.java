package carmangment;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CarRentol {
    private List<Car> cars = new Array<>();
    private List<Customer> customers = new ArrayList<>();
    private List<Rental> rentals = new ArrayList<>();
	private Object Customizer;

    public void addCar(Car car) { Car.add(car); }
    public void addCustomer(Customizer customer) { Customizer.add(customer); }

    public void rentCar(Car car, Customizer customer, int days) {
        if (car.isAvailable()) {
            car.rent();
            Rental rental = new Rental(car, customer, days);
            rentals.add(rental);
            System.out.println("Car rented successfully!");
        } else {
            System.out.println(" Car not available");
        }
    }

    public void returnCar(Car car) {
        Rental toRemove = null;
        for (Rental r : rentals) {
            if (r.getCar() == car) {
                toRemove = r;
                break;
            }
        }
        if (toRemove != null) {
            rentals.remove(toRemove);
            car.returnCar();
            System.out.println(" Car returned successfully!");
        } else {
            System.out.println(" Car was not rented");
        }
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Car Rental System ---");
            System.out.println("1. Rent a car");
            System.out.println("2. Return a car");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("\n== Rent a car ==\n");
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.print("Enter your id: ");
                String id = scanner.nextLine();

                Customer cust = new Customer(id, name);
                addCustomer(cust);

                System.out.println("\nAvailable cars:");
                for (Car c : cars) {
                    if (c.isAvailable()) System.out.println(c);
                }
                // Car selection logic yahan add karna hoga
            } else if (choice == 2) {
                System.out.println("\n== Return a car ==\n");
                // Return logic
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }
        }
        scanner.close();
    }
}

