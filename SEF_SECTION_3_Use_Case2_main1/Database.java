package SEF_SECTION_3_Use_Case2_main;

public class Database {
    public static MembershipDetails getMembershipInfo(String userId) {
        // Simulated database lookup
        return new MembershipDetails("12345", "Active");
    }

    public static void updateMembershipDetails(MembershipDetails details) {
        // Simulated database update
        System.out.println("Database: Membership details updated.");
    }

    public static void completeMembershipRefund(MembershipDetails details) {
        // Simulated database update
        System.out.println("Database: Membership details updated.");
    }


}
