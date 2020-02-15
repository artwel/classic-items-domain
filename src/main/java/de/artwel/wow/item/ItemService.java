package de.artwel.wow.item;

import org.springframework.stereotype.Service;

import java.util.List;

public interface ItemService {

    List<Item> findItems();

    Item getById(Long id);

    Item save(Item item);
}
