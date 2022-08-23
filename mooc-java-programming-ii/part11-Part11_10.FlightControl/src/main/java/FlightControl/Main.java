package FlightControl;


import FlightControl.logic.FlightControl;
import FlightControl.ui.AirportAssetControlUI;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FlightControl control = new FlightControl();
        Scanner scanner = new Scanner(System.in);

        AirportAssetControlUI ui = new AirportAssetControlUI(control, scanner);
        ui.start();
    }
}
