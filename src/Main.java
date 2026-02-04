import com.jayanthi.oceanfleet.model.Vessel;
import com.jayanthi.oceanfleet.util.VesselUtil;

public class Main {

    public static void main(String[] args) {

        VesselUtil util = new VesselUtil();

        // Adding vessels
        util.addVesselPerformance(new Vessel("V001", "Sea King", 25.5, "Cargo"));
        util.addVesselPerformance(new Vessel("V002", "Ocean Queen", 30.2, "Passenger"));

        // Searching vessel
        Vessel result = util.getVesselById("V001");

        if (result != null) {
            System.out.println(
                    result.getVesselId() + " | " +
                            result.getVesselName() + " | " +
                            result.getVesselType() + " | " +
                            result.getAverageSpeed() + " knots"
            );
        } else {
            System.out.println("Vessel not found");
        }
    }
}
