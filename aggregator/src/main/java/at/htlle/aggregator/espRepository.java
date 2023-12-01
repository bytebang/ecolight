package at.htlle.aggregator;

import java.util.List;

import at.htlle.aggregator.pojos.HardwareAsset;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "hardwareAsset", path = "hardwareAsset")
public interface espRepository extends PagingAndSortingRepository<HardwareAsset, Long>, CrudRepository<HardwareAsset,Long> {

	List<HardwareAsset> findById(@Param("id") long id);

}