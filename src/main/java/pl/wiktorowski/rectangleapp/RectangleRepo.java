package pl.wiktorowski.rectangleapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RectangleRepo extends CrudRepository<Rectangle, Long> {
}
