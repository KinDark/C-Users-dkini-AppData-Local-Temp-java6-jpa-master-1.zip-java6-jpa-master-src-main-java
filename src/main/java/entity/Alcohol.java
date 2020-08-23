package entity;

import java.math.BigDecimal;
Entity
public class Alcohol {
    @Id
    @GeneratedValue(strategy = GenerationType.INDENTITY)
    private long id;

    private String name;

    private BigDecimal voltage;

    private BigDecimal capacity;

    private String category;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getVoltage() {
        return voltage;
    }

    public BigDecimal getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Alcohol{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", voltage=" + voltage +
                ", capacity=" + capacity +
                ", category='" + category + '\'' +
                '}';
    }

    public String getCategory() {
        return category;
    }
}
