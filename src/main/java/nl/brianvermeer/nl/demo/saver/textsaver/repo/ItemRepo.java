package nl.brianvermeer.nl.demo.saver.textsaver.repo;


import nl.brianvermeer.nl.demo.saver.textsaver.domain.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ItemRepo extends CrudRepository<Item, Long> {

    List<Item> findAll();
}
