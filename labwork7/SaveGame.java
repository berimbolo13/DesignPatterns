package com.lab111.labwork7;

/**
 * @author dima_
 * Memento class
 */

public class SaveGame {
    private final int level;
    private final String[] artifacts;
    private final int hp;
    private final int mana;
    private final String hero;

    /**
     *
     * @param level
     * @param artifacts
     * @param hp
     * @param mana
     * @param hero
     */
    public SaveGame(int level, String[] artifacts, int hp, int mana, String hero) {
        this.level = level;
        this.artifacts = artifacts;
        this.hp = hp;
        this.mana = mana;
        this.hero = hero;
    }

    public int getLevel() {
        return level;
    }

    public String[] getArtifacts() {
        return artifacts;
    }

    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    public String getHero() {
        return hero;
    }
}
