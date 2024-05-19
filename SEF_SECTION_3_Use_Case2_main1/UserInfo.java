package SEF_SECTION_3_Use_Case2_main1;

import java.util.Scanner;

public class UserInfo {
    private String username;
    private String password;
    private MembershipDetails membershipDetails;

    public UserInfo(String username, String password, MembershipDetails membershipDetails) {
        this.username = username;
        this.password = password;
        this.membershipDetails = membershipDetails;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public MembershipDetails getMembershipDetails() {
        return membershipDetails;
    }

    public void deleteMembership() {
        this.membershipDetails = null;
    }

    public void updateMembershipStatus(String status) {
        if (this.membershipDetails != null) {
            this.membershipDetails.setStatus(status);
        }
    }

    public void displayMembershipStatus() {
        if (this.membershipDetails != null) {
            System.out.println("Membership Status: " + this.membershipDetails.getStatus());
        } else {
            System.out.println("No Membership");
        }
    }

    // Static method for login
    public static UserInfo login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals("User123") && password.equals("Pass123")) {
            System.out.println("Login successful.");
            return new UserInfo(username, password, Database.getMembershipInfo(username));
        } else {
            System.out.println("Invalid login credentials.");
            return null;
        }
    }

    // Non-static method for processing commands
    public void processCommands() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter command: ");
        String command = scanner.nextLine();

        if (command.equalsIgnoreCase("delete")) {
            deleteMembership();
            System.out.println("UserInfo: Membership deleted.");
            displayMembershipStatus();

            System.out.print("Do you want a refund on your last purchase? (yes/no): ");
            String refundOption = scanner.nextLine();
            if (refundOption.equalsIgnoreCase("yes")) {
                boolean refund = MembershipService.acceptMembershipRefund();
                if (refund) {
                    PaymentSystem.finaliseRefund();  
                    MembershipDetails.setStatus("Denied");
                    System.out.println("Your current membership status is: " + MembershipDetails.getStatus());

                }
            } else {
                MembershipService.denyMembershipRefund();
                System.out.println("Your current membership status is: " + MembershipDetails.getStatus());
            }
        } else {
            System.out.println("Invalid command.");
        }
    }
}
