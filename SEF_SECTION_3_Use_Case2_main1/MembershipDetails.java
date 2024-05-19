package SEF_SECTION_3_Use_Case2_main1;

public class MembershipDetails {
    private String membershipId;
    private static String status;

    // Constructor
    public MembershipDetails(String membershipId, String status) {
        this.membershipId = membershipId;
        this.status = status;
    }

     
        // Setters
        public void setMembershipId(String membershipId) {
            this.membershipId = membershipId;
        }
    
        public static void setStatus(String newstatus) {
            status = newstatus;
            System.out.println("Status set to: " + status); 
        }
        
    // Getters
    public String getMembershipId() {
        return membershipId;
    }

    public String getStatus() {
        return status;
    }


}
