package ui;

import model.Vessel;
import util.VesselUtil;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public void startApplication() {

        Scanner sc = new Scanner(System.in);
        VesselUtil util = new VesselUtil();

        System.out.println("Enter number of vessels:");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            System.out.println("Enter vessel details (vesselId:vesselName:averageSpeed:vesselType):");

            String input = sc.nextLine();
            String[] data = input.split(":");

            Vessel vessel = new Vessel(
                    data[0],
                    data[1],
                    Double.parseDouble(data[2]),
                    data[3]
            );

            util.addVesselPerformance(vessel);
        }

        System.out.println("Enter vessel ID to search:");
        String searchId = sc.nextLine();

        Vessel found = util.getVesselById(searchId);

        if (found != null) {
            System.out.println(found.getVesselId() + " | " +
                    found.getVesselName() + " | " +
                    found.getVesselType() + " | " +
                    found.getAverageSpeed() + " knots");
        } else {
            System.out.println("Vessel not found");
        }

        System.out.println("\nHigh Performance Vessels:");

        List<Vessel> highPerf = util.getHighPerformanceVessels();

        for (Vessel v : highPerf) {
            System.out.println(v.getVesselId() + " | " +
                    v.getVesselName() + " | " +
                    v.getVesselType() + " | " +
                    v.getAverageSpeed() + " knots");
        }
    }
}
