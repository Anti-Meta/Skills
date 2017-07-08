package nl.antimeta.skills.entity.skill;

import nl.antimeta.bukkit.framework.database.model.BaseEntity;

public class Woodcutting extends BaseEntity {

    private Long id;

    private Integer currentLevel;

    private Integer currentXp;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
