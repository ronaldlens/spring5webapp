package rfl.spring5.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import rfl.spring5.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
