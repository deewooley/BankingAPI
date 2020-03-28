package BankingAPI.BankingAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Banking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String givenName;
    private String familyName;
    private String accountType;
    private int accountNumber;
    private int routingNumber;

    public Banking(){}

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(int routingNumber) {
        this.routingNumber = routingNumber;
    }


    @Override
    public String toString() {
        return "Sneaker{" +
                "givenName='" + givenName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accountNumber=" + accountNumber +
                ", routingNumber=" + routingNumber +
                '}';
    }

}