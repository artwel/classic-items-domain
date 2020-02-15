package de.artwel.wow.item;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQuery;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

public class ItemCustomDaoImpl implements ItemCustomDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Item> search(Optional<Boolean> own, Optional<List<Slot>> slots) {
        final var query = new JPAQuery<Item>(entityManager);
        final var item = QItem.item;
        final var where = new BooleanBuilder();
        own.ifPresent(value -> where.and(item.own.eq(value)));
        slots.ifPresent(value -> where.and(item.slot.in(value)));
        return query.from(item).where(where).fetch();
    }
}
