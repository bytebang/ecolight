package at.htlle.aggregator;

import java.util.List;

import at.htlle.aggregator.pojos.Roles;
import at.htlle.aggregator.pojos.Users;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<Users, Long>, CrudRepository<Users,Long> {

    /*
    void setUsername(@Param("id") long id, @Param("username") String username);
    void setPassword(@Param("id") long id, @Param("password") String password);
    void setRole(@Param("id") long id, @Param("role") Roles role);*/
    List<Users> findById(@Param("id") long id);

}