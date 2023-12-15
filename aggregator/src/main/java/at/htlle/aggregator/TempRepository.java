package at.htlle.aggregator;

import java.sql.Timestamp;
import java.util.List;


import at.htlle.aggregator.pojos.TempValue;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "tempValue", path = "tempValue")
public interface TempRepository extends PagingAndSortingRepository<TempValue, Long>, CrudRepository<TempValue,Long> {
    void setTempUpperBound(@Param("id") long id, @Param("tempUpperBound") double value);
    void setTempLowerBound(@Param("id") long id, @Param("tempLowerBound") double value);
    void setTimeStamp(@Param("id") long id, @Param("timestamp") Timestamp timestamp);
    List<TempValue> findById(@Param("id") long id);

}