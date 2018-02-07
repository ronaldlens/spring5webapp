package rfl.spring5.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import rfl.spring5.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
