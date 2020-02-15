package de.artwel.wow.source;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Source {

    @Id
    private Long id;

    private Type type;

    private String location;

    private String target;

    private int wowHeadId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String dungeon) {
        this.location = dungeon;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String boss) {
        this.target = boss;
    }

    public int getWowHeadId() {
        return wowHeadId;
    }

    public void setWowHeadId(int wowHeadId) {
        this.wowHeadId = wowHeadId;
    }
}
