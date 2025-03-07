package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "currency")
public class Currency{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "rates")
    private double rates;

    public Currency() {
    }

    public Currency(String code, String name, double rates) {
        this.name = name;
        this.rates = rates;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRates(double rates) {
        this.rates = rates;
    }



    public double getRates() {
        return rates;
    }


}
