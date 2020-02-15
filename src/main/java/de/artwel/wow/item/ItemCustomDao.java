package de.artwel.wow.item;

import java.util.List;
import java.util.Optional;

public interface ItemCustomDao {

    List<Item> search(Optional<Boolean> own, Optional<List<Slot>> slots);
}
