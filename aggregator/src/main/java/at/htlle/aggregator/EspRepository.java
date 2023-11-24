package at.htlle.aggregator;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface ESPRepository extends PagingAndSortingRepository<ESP, Long>, CrudRepository<ESP,Long> {

	List<ESP> findByLastName(@Param("name") String name);

}