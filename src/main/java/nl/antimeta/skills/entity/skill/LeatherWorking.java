package nl.antimeta.skills.entity.skill;

import nl.antimeta.bukkit.framework.database.model.BaseEntity;

public class LeatherWorking extends BaseEntity {

    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
