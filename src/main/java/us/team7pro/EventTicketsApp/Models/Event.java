package us.team7pro.EventTicketsApp.Models;

import javax.persistence.*;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventID;
    @Column(name = "eventName")
    private String eventName;
    @Column(name = "eventCategory")
    private String eventCategory; // Concerts, Sports, Festivals
    @Column(name = "eventDate")
    private String date;
    @Column(name = "location")
    private String location;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private float price;
    @Column(name = "imgUrl")
    private String imgUrl;

    public Event(){
        
    }

    public Event(String eventName, String eventCategory, String date, String location, String description, float price, String imgUrl) {
        this.eventName = eventName;
        this.eventCategory = eventCategory;
        this.date = date;
        this.location = location;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventID=" + eventID +
                ", eventName='" + eventName + '\'' +
                ", eventCategory='" + eventCategory + '\'' +
                ", date='" + date + '\'' +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
