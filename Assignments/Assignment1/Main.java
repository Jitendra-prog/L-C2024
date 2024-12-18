package Assignment1;

import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Email email = new Email();
		email.setEmailId("prashant.singg@gmail.com");
		email.setEmailSorce("Gmail");
		email.setInboxFolderSize(40.0);
		email.setSentFolderSize(10.0);
		email.setSpamFolderSize(2.0);
		Map<EmailType,Double> carbonAmountMap = EmailService.getCarbonFootprint("email", email);
		System.out.println("Inbox Folder Carbon Amount: "+carbonAmountMap.get(EmailType.inbox));
		System.out.println("Sent Folder Carbon Amount: "+carbonAmountMap.get(EmailType.sent));
		System.out.println("Apam Folder Carbon Amount: "+carbonAmountMap.get(EmailType.spam));
	}
}
