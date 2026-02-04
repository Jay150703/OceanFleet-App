import com.jayanthi.oceanfleet.model.Vessel;
import com.jayanthi.oceanfleet.util.VesselUtil;

public class Main {
    public static void main(String[] args) {

        VesselUtil util = new VesselUtil();

        Vessel v1 = new Vessel("V001", "Sea King", 25.5, "Cargo");
        util.addVesselPerformance(v1);

        System.out.println("Vessel added successfully");

    }
}
