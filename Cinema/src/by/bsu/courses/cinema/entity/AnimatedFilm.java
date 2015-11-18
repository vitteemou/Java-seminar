package by.bsu.courses.cinema.entity;
import java.util.ArrayList;

public class AnimatedFilm extends Film {
    private ArrayList<String> characterScoring;

public AnimatedFilm(int year, String name, double duration, ArrayList<String> scoring) {
        super(year, name, duration);
        for(String str : scoring) {
            characterScoring.add(str);
        }
}
    public ArrayList<String> getCharacterScoring() {
        return characterScoring;
    }

    public void setCharacterScoring(ArrayList<String> characterScoring) {
        this.characterScoring = characterScoring;
    }
    //equals, hashcode, tostring!
}
