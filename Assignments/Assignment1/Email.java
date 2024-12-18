package Assignment1;

public class Email {
	private String emailId;
	private String emailSorce;
	private double inboxFolderSize;
	private double sentFolderSize;
	private double spamFolderSize;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getEmailSorce() {
		return emailSorce;
	}
	public void setEmailSorce(String emailSorce) {
		this.emailSorce = emailSorce;
	}
	public double getInboxFolderSize() {
		return inboxFolderSize;
	}
	public void setInboxFolderSize(double inboxFolderSize) {
		this.inboxFolderSize = inboxFolderSize;
	}
	public double getSentFolderSize() {
		return sentFolderSize;
	}
	public void setSentFolderSize(double sentFolderSize) {
		this.sentFolderSize = sentFolderSize;
	}
	public double getSpamFolderSize() {
		return spamFolderSize;
	}
	public void setSpamFolderSize(double spamFolderSize) {
		this.spamFolderSize = spamFolderSize;
	}
	
	@Override
	public String toString() {
		return "Email [emailId=" + emailId + ", emailSorce=" + emailSorce + ", inboxFolderSize=" + inboxFolderSize
				+ ", sentFolderSize=" + sentFolderSize + ", spamFolderSize=" + spamFolderSize + "]";
	}	
}
