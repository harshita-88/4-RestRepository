package in.harshita.restrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.harshita.entity.Book;

@RepositoryRestResource(path = "books")
public interface RestRepository extends JpaRepository<Book, Integer> {
	
	

}
