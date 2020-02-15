package de.artwel.wow.item;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    List<Item> findItems(Optional<Boolean> own, Optional<List<Slot>> slots);

    Item getById(Long id);

    Item save(Item item);
}
