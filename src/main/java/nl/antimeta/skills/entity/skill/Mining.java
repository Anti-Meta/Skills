package nl.antimeta.skills.entity.skill;

import nl.antimeta.bukkit.framework.database.model.BaseEntity;

import java.sql.ResultSet;
import java.util.List;

public class Mining extends BaseEntity {

    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
