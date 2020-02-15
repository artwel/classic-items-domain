package de.artwel.wow.item;

import de.artwel.wow.source.Source;

import javax.persistence.*;

@Entity
public class Item {

    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    private Slot slot;

    private int wowHeadId;

    private String name;

    private int phase;

    @OneToOne
    private Source source;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public int getWowHeadId() {
        return wowHeadId;
    }

    public void setWowHeadId(int wowHeadId) {
        this.wowHeadId = wowHeadId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public Source getAvailableFrom() {
        return source;
    }

    public void setAvailableFrom(Source source) {
        this.source = source;
    }
}
