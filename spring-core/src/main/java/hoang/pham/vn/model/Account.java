package hoang.pham.vn.model;

import java.util.Date;

/**
 * Created by hoangpvm on 8/25/2015.
 */
public class Account {

    private long id;
    private String ownerName;
    private double balance;
    private Date accessTime;

    public Account() {
    }

    public Account(long id, String ownerName, double balance, Date accessTime) {
        this.id = id;
        this.ownerName = ownerName;
        this.balance = balance;
        this.accessTime = accessTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Date accessTime) {
        this.accessTime = accessTime;
    }
}
