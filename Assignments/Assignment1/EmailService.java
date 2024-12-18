package Assignment1;

import java.util.HashMap;
import java.util.Map;

public class EmailService {
	final static double inboxEmailCarbonAmountPerKg = 0.02;
	final static double sentEmailCarbonAmountPerKg = 0.05;
	final static double spamEmailCarbonAmountPerKg = 0.03;
	
	public static Map<EmailType, Double> getCarbonFootprint(String source, Email email) {
		if( source.equals("email")) {
			Map<EmailType, Double> carbonAmountMap = new HashMap<EmailType, Double>();
	        carbonAmountMap.put(EmailType.inbox, calculateCarbonAmount(email.getInboxFolderSize(), EmailType.inbox));
	        carbonAmountMap.put(EmailType.sent,calculateCarbonAmount(email.getSentFolderSize(), EmailType.sent));
	        carbonAmountMap.put(EmailType.spam,calculateCarbonAmount(email.getSpamFolderSize(), EmailType.spam));
	        return carbonAmountMap;
		}
		return null;
	}
	
	private static double calculateCarbonAmount(double emailFolderSizeInKG,EmailType emailType) {
		switch(emailType) {
			case inbox:
				return emailFolderSizeInKG * inboxEmailCarbonAmountPerKg;
			case sent:
				return emailFolderSizeInKG * sentEmailCarbonAmountPerKg;
			case spam: 
				return emailFolderSizeInKG * spamEmailCarbonAmountPerKg;
			default:
				return 0;
		}
	}
}
