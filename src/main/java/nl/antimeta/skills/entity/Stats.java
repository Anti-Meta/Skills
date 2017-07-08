package nl.antimeta.skills.entity;

import nl.antimeta.bukkit.framework.database.annotation.Field;
import nl.antimeta.bukkit.framework.database.model.BaseEntity;
import nl.antimeta.bukkit.framework.database.model.FieldType;
import nl.antimeta.skills.entity.skill.*;

public class Stats extends BaseEntity {

    private Long id;

    private String playerUUID;

    @Field(fieldName = "building_id", fieldType = FieldType.BigInt, foreign = true)
    private Building building;

    private Farming farming;

    private Fishing fishing;

    private LeatherWorking leatherworking;

    private Melee melee;

    private Mining mining;

    private Ranged ranged;

    private Smelting smelting;

    private Smithing smithing;

    private Woodcutting woodcutting;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayerUUID() {
        return playerUUID;
    }

    public void setPlayerUUID(String playerUUID) {
        this.playerUUID = playerUUID;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Farming getFarming() {
        return farming;
    }

    public void setFarming(Farming farming) {
        this.farming = farming;
    }

    public Fishing getFishing() {
        return fishing;
    }

    public void setFishing(Fishing fishing) {
        this.fishing = fishing;
    }

    public LeatherWorking getLeatherworking() {
        return leatherworking;
    }

    public void setLeatherworking(LeatherWorking leatherworking) {
        this.leatherworking = leatherworking;
    }

    public Melee getMelee() {
        return melee;
    }

    public void setMelee(Melee melee) {
        this.melee = melee;
    }

    public Mining getMining() {
        return mining;
    }

    public void setMining(Mining mining) {
        this.mining = mining;
    }

    public Ranged getRanged() {
        return ranged;
    }

    public void setRanged(Ranged ranged) {
        this.ranged = ranged;
    }

    public Smelting getSmelting() {
        return smelting;
    }

    public void setSmelting(Smelting smelting) {
        this.smelting = smelting;
    }

    public Smithing getSmithing() {
        return smithing;
    }

    public void setSmithing(Smithing smithing) {
        this.smithing = smithing;
    }

    public Woodcutting getWoodcutting() {
        return woodcutting;
    }

    public void setWoodcutting(Woodcutting woodcutting) {
        this.woodcutting = woodcutting;
    }
}
