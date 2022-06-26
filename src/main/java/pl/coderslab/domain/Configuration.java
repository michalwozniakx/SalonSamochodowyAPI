package pl.coderslab.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "configurations")
public class Configuration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column(nullable = false)
    public String color; //czarny, biały, czerwony, niebieski
    @Column(nullable = false)
    private String engine; //1.4tsi, 2.0tsi, 1.6tdi, 2.0tdi
    @Column(nullable = false)
    private String gearbox; //automatyczna, manualna
    @Column(name = "air_conditioning", nullable = false)
    private String airConditioning; //manualna, climatronic
    @Column(nullable = false)
    private String seats; //materiałowe, welurowe, alcantara, skórzane

    @OneToOne
    //@JoinTable(name = "users", joinColumns = @JoinColumn(name = "user_id"))
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    //@JoinTable(name = "cars", joinColumns = @JoinColumn(name = "car_id"))
    @JoinColumn(name = "car_id")
    private Car car;

    public Configuration() {

    }

    public Configuration(long id, String color, String engine, String gearbox, String airConditioning, String seats) {
        this.id = id;
        this.color = color;
        this.engine = engine;
        this.gearbox = gearbox;
        this.airConditioning = airConditioning;
        this.seats = seats;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public String getAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(String airConditioning) {
        this.airConditioning = airConditioning;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", gearbox='" + gearbox + '\'' +
                ", airConditioning='" + airConditioning + '\'' +
                ", seats='" + seats + '\'' +
                ", user=" + user +
                ", car=" + car +
                '}';
    }
}
