package us.team7pro.EventTicketsApp.Models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;

    // User, Admin, Organizer
    @Column(name = "role")
    private String role;
    @Column(name = "userName")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "transactions")
    private ArrayList<Integer> transactions;

    public User() {
    }

    public User(String role, String userName, String password, String email, ArrayList<Integer> transactions) {
        this.role = role;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.transactions = transactions;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Integer> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Integer> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", role='" + role + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
