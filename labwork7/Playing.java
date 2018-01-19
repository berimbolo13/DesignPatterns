package com.lab111.labwork7;

public class Playing {
    public static void main(String[] args) {
        //create new game
        Game game = new Game();
        //set game's data
        game.setLevel(12);
        String[] artifacts = {"shield", "knife"};
        game.setArtifacts(artifacts);
        game.setHp(100);
        game.setMana(100);
        game.setHero("Assasin");
        System.out.println(game);
        //save game's data to Memento and put Memento to Caretaker
        FileOfGameSave file = new FileOfGameSave();
        file.setSaveGame(game.save());
        //set new game's data
        String[] artifacts2 = {"shield", "bow", "arrows"};
        game.setArtifacts(artifacts2);
        game.setLevel(5);
        game.setHp(34);
        System.out.println(game);

        FileOfGameSave file2 = new FileOfGameSave();
        file2.setSaveGame(game.save());
        //load game's data from Memento in Caretaker
        game.loadSave(file.getSaveGame());
        System.out.println(game);
    }
}