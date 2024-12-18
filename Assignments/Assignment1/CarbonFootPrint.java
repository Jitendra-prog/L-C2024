import java.util.ArrayList;
import java.util.List;

class CarbonEmissionFactors {
    public static final double INBOX = 0.004;   // 0.004 KG CO2 per GB in inbox
    public static final double SPAM = 0.0003;  // 0.0003 KG CO2 per GB of spam emails
    public static final double SENT = 0.05;    // 0.05 KG CO2 per GB in sent emails
}

class EmailEntity {
    String entityType;
    String email;
    String source;
    int inboxEmails;
    int sentEmails;
    int spamEmails;
    double inboxCarbonFootprint;
    double spamCarbonFootprint;
    double sentCarbonFootprint;

    public EmailEntity(String entityType, String email, String source, int inboxEmails, int sentEmails, int spamEmails) {
        this.entityType = entityType;
        this.email = email;
        this.source = source;
        this.inboxEmails = inboxEmails;
        this.sentEmails = sentEmails;
        this.spamEmails = spamEmails;
    }
    
    public void calculateCarbonFootprintForEmail() {
        inboxCarbonFootprint = inboxEmails * CarbonEmissionFactors.INBOX;
        spamCarbonFootprint = spamEmails * CarbonEmissionFactors.SPAM;
        sentCarbonFootprint = sentEmails * CarbonEmissionFactors.SENT;
    }
    public String getEmail(){
        return email;
    }
    
    public String getInboxCarbonFootprint(){
        return String.format("%.4f", inboxCarbonFootprint);
    }
    public String getSpamCarbonFootprint(){
        return String.format("%.4f", spamCarbonFootprint);
    }
    public String getSentCarbonFootprint(){
        return String.format("%.4f", sentCarbonFootprint);
    }
    public String getSource(){
        return source;
    }
    
}

public class CarbonFootPrint{
    public static void main(String[] args) {
        List<EmailEntity> entities = new ArrayList<>();
        entities.add(new EmailEntity("email", "neeraj@gmail.com", "gmail", 5, 5, 5));
        entities.add(new EmailEntity("email", "jenny@yahoo.com", "outlook", 10, 10, 10));

        for (EmailEntity entity : entities) {
            entity.calculateCarbonFootprintForEmail();
            System.out.println("Email: " + entity.getEmail());
            System.out.println("Source: " + entity.getSource());
            System.out.println("Inbox Carbon Footprint: " + entity.getInboxCarbonFootprint()+ " KG");
            System.out.println("Spam Carbon Footprint: " + entity.getSpamCarbonFootprint()+ " KG");
            System.out.println("Sent Carbon Footprint: " + entity.getSentCarbonFootprint() + " KG");
        }
    } 
}