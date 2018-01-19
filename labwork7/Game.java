package com.lab111.labwork7;

/**
 * @author dima_
 * Originator class
 */

import java.util.Arrays;

public class Game {
    private int level;
    private String[] artifacts;
    private int hp;
    private int mana;
    private String hero;

    /**
     *
     * @param level is level of game
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     *
     * @param artifacts is array of hero's artifacts
     */
    public void setArtifacts(String[] artifacts) {
        this.artifacts = artifacts;
    }

    /**
     *
     * @param hp is hero's hp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     *
     * @param mana is hero's mana
     */
    public void setMana(int mana) {
        this.mana = mana;
    }

    /**
     *
     * @param hero is hero's type
     */
    public void setHero(String hero) {
        this.hero = hero;
    }

    /**
     *
     * @param saveGame is Memento
     */
    public void loadSave(SaveGame saveGame){
        this.level = saveGame.getLevel();
        this.artifacts = saveGame.getArtifacts();
        this.hp = saveGame.getHp();
        this.mana = saveGame.getMana();
        this.hero = saveGame.getHero();
    }

    /**
     *
     * @return new Memento
     */
    public SaveGame save(){
        return new SaveGame(level, artifacts, hp, mana, hero);
    }

    @Override
    public String toString() {
        return "Game{" +
                "level=" + level +
                ", artifacts=" + Arrays.toString(artifacts) +
                ", hp=" + hp +
                ", mana=" + mana +
                ", hero='" + hero + '\'' +
                '}';
    }
}
