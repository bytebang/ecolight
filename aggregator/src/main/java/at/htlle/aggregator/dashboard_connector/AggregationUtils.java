package at.htlle.aggregator.dashboard_connector;
import at.htlle.aggregator.pojos.*;
import at.htlle.aggregator.pojos.TempValue;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

import java.util.ArrayList;
public class AggregationUtils {
    public static double averageTemperatureforSensor(int id){
        ArrayList<TempValue> temperatureList = new ArrayList<>();
        EntityManager em = EntityManagerSingleton.getEntityManager();
        Query query = em.createQuery("SELECT c FROM TempValue c");
        temperatureList = (ArrayList<TempValue>) query.getResultList();
        temperatureList.add(new TempValue(17,19,18));

        // Calculate the average temperature
        double sum = 0.0;
        for (TempValue valueSet : temperatureList) {
            sum += valueSet.getActualTemp();
        }
        double average = sum / temperatureList.size();

        // Display the average temperature
        System.out.println("Average Temperature: " + average);
        return average;
    }

}
