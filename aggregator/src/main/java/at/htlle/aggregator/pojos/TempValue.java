package at.htlle.aggregator.pojos;

import at.htlle.aggregator.TempRepository;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
public class TempValue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="hardware_ID")
    private HardwareAsset hardwareAsset;

    private double actualTemp;

    private double tempUpperBound;

    private double tempLowerBound;

    private Timestamp timestamp;


    public TempValue() {

    }

    public TempValue(double tempLowerBound, double tempUpperBound, double actualTemp) {
        this.actualTemp = actualTemp;
        this.tempLowerBound = tempLowerBound;
        this.tempUpperBound = tempUpperBound;
        this.timestamp = Timestamp.valueOf(LocalDateTime.now());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getActualTemp() {
        return actualTemp;
    }

    public void setActualTemp(double actualTemp) {
        this.actualTemp = actualTemp;
    }

    public double getTempUpperBound() {
        return tempUpperBound;
    }

    public void setTempUpperBound(double tempUpperBound) {
       this.tempUpperBound = tempUpperBound;
    }

    public double getTempLowerBound() {
        return tempLowerBound;
    }

    public void setTempLowerBound(double tempLowerBound) {
        this.tempLowerBound = tempLowerBound;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
