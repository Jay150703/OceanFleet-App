package com.jayanthi.oceanfleet.util;

import com.jayanthi.oceanfleet.model.Vessel;
import java.util.ArrayList;
import java.util.List;

public class VesselUtil {

    private List<Vessel> vesselList;

    // Constructor to initialize list
    public VesselUtil() {
        vesselList = new ArrayList<>();
    }

    // Method to add vessel performance
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    // Optional helper method (useful later)
    public List<Vessel> getVesselList() {
        return vesselList;
    }
}
