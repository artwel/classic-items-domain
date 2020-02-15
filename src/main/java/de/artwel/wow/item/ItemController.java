package de.artwel.wow.item;

import io.swagger.annotations.ApiParam;
import org.openapitools.api.ItemsApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class ItemController implements ItemsApi {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @Override
    public ResponseEntity<List<Item>> findItems(
            @Valid @RequestParam(value = "own", required = false) Optional<Boolean> own,
            @Valid @RequestParam(value = "slots", required = false) Optional<List<Slot>> slots) {
        return new ResponseEntity<>(itemService.findItems(own, slots), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> setOwn(@NotNull @Valid @RequestParam(value = "id") Long id, @NotNull @Valid @RequestParam(value = "own") Boolean own) {
        Item item = itemService.getById(id);
        item.setOwn(own);
        itemService.save(item);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
