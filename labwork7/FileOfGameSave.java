package com.lab111.labwork7;

/**
 * Caretaker class
 */
public class FileOfGameSave {
    SaveGame saveGame;

    /**
     *
     * @return Memento
     */
    public SaveGame getSaveGame() {
        return saveGame;
    }

    /**
     *
     * @param saveGame is Memento
     */
    public void setSaveGame(SaveGame saveGame) {
        this.saveGame = saveGame;
    }
}
