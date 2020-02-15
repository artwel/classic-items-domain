package de.artwel.wow.item;

import org.openapitools.api.ItemsApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ItemController implements ItemsApi {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @Override
    public ResponseEntity<List<Item>> findItems() {
        return new ResponseEntity<>(itemService.findItems(), HttpStatus.OK);
    }
}
