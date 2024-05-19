package SEF_SECTION_3_Use_Case2_main1;

// import SEF_SECTION_3_Use_Case2_main.MembershipDetails;

public class MembershipService {
    public static String checkMembershipStatus(MembershipDetails details) {
        // Simulated status check
        return MembershipDetails.getStatus();
    }

    public static boolean denyMembershipRefund() {
        // Simulated denial of refund

        // Call the setStatus method from MembershipDetails
        MembershipDetails.setStatus("Denied");
        
        return false;
    }

    public static boolean acceptMembershipRefund() {
        // Simulated acceptance of refund
        return true;
    }

    // public static void main(String[] args) {
    //     // Test the denyMembershipRefund method
    //     boolean result = denyMembershipRefund();
    //     System.out.println("Refund denied: " + result);

    //     // Check the status
    //     String currentStatus = MembershipDetails.getStatus();
    //     System.out.println("Current status: " + currentStatus);
    // }
}
