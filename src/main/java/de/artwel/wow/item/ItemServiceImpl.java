package de.artwel.wow.item;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemDao itemDao;

    public ItemServiceImpl(ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    @Override
    public List<Item> findItems(Optional<Boolean> own, Optional<List<Slot>> slots) {
        return itemDao.search(own, slots);
    }

    @Override
    public Item getById(Long id) {
        return itemDao.getOne(id);
    }

    @Override
    public Item save(Item item) {
        return itemDao.save(item);
    }
}
