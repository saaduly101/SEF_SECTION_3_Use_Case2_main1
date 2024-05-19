package SEF_SECTION_3_Use_Case2_main1;

public class SystemService {
    public static void main(String[] args) {
        UserInfo user = UserInfo.login();
        if (user != null) {
            user.processCommands();
        }
        // Simulated logout
        System.out.println("System: Logout.");
    }
}
