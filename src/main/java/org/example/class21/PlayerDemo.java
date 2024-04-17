package org.example.class21;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PlayerDemo {
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        FileInputStream fis = new FileInputStream("/Users/karina/IdeaProjects/SDETJavaBatch19/src/main/java/org/example/class21/Ambient-music-free (3).mp3");
        Player player = new Player(fis);
        player.play();
    }
}
