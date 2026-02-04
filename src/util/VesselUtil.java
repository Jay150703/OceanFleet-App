package com.jayanthi.oceanfleet.util;

import com.jayanthi.oceanfleet.model.Vessel;
import java.util.ArrayList;
import java.util.List;

public class VesselUtil {

    private List<Vessel> vesselList;

    public VesselUtil() {
        vesselList = new ArrayList<>();
    }

    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    public Vessel getVesselById(String vesselId) {

        for (Vessel vessel : vesselList) {
            if (vessel.getVesselId().equals(vesselId)) {
                return vessel;
            }
        }

        return null;
    }

    public List<Vessel> getVesselList() {
        return vesselList;
    }
}
