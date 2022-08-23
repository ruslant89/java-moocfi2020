package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.logic.FlightControl;

import java.util.Scanner;

public class AirportAssetControlUI {

    private FlightControl flightControl;
    private Scanner scanner;

    public AirportAssetControlUI(FlightControl flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }

    public void start() {
        startAirportAssetControl();
        //System.out.println();
        startFlightControl();

    }

    private void startAirportAssetControl() {
        while(true) {
            System.out.println("Airport Asset Control");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.print("> ");
            String input = scanner.nextLine();

            if (input.equals("1")) {
                addAirplane();
            } else if (input.equals("2")) {
                addFlight();
            } else if (input.equals("x")) {
                break;
            }
        }
    }

    private void startFlightControl() {
        while(true) {
            System.out.println("Flight Control");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            System.out.print("> ");
            String input = scanner.nextLine();

            if (input.equals("1")) {
                printAirplanes();
            } else if (input.equals("2")) {
                printFlights();
            } else if (input.equals("3")) {
                printAirplaneDetails();
            } else if (input.equals("x")) {
                break;
            }
        }
    }

    private void addAirplane() {
        System.out.print("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());

        this.flightControl.addAirplane(id, capacity);
    }

    private void addFlight() {
        System.out.print("Give the airplane id: ");
        Airplane plane = getAirplane();
        System.out.print("Give the departure airport id: ");
        String departureAirport = scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String arrivalAiport = scanner.nextLine();

        //Place depAirport = new Place(departureAiport);
        //Place arrAirport = new Place(arrivalAiport);
        //Airplane plane = new Airplane(this.flightControl.getAirplane(id).getId(), this.flightControl.getAirplane(id).getCapacity());

        //Flight flight = new Flight(plane, depAirport, arrAirport);

        this.flightControl.addFlight(plane, departureAirport, arrivalAiport);
    }

    private void printAirplanes() {
        this.flightControl.getAirplanes().stream().forEach(airplane -> System.out.println(airplane));
    }

    private void printFlights() {
        this.flightControl.getFlights().stream().forEach(flight -> System.out.println(flight));
        System.out.println("");
    }

    private void printAirplaneDetails() {
        System.out.print("Give the airplane id: ");
        Airplane airplane = getAirplane();

        System.out.println(airplane);
        System.out.println();
    }

    private Airplane getAirplane() {
        Airplane airplane = null;
        while (airplane == null) {
            String id = scanner.nextLine();
            airplane = this.flightControl.getAirplane(id);

            if (airplane == null) {
                System.out.println("No airplane with id: " + id);
            }
        }

        return airplane;
    }
}
