package com.jayanthi.oceanfleet;

import com.jayanthi.oceanfleet.model.Vessel;
import com.jayanthi.oceanfleet.util.VesselUtil;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        VesselUtil util = new VesselUtil();

        util.addVesselPerformance(new Vessel("V001", "Sea King", 25.5, "Cargo"));
        util.addVesselPerformance(new Vessel("V002", "Ocean Queen", 30.2, "Passenger"));
        util.addVesselPerformance(new Vessel("V003", "Blue Whale", 30.2, "Research"));

        List<Vessel> highPerf = util.getHighPerformanceVessels();

        System.out.println("High Performance Vessels:");

        for (Vessel v : highPerf) {
            System.out.println(
                    v.getVesselId() + " | " +
                            v.getVesselName() + " | " +
                            v.getVesselType() + " | " +
                            v.getAverageSpeed() + " knots"
            );
        }
    }
}
