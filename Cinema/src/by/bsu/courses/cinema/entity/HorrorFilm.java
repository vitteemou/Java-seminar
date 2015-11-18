package by.bsu.courses.cinema.entity;

public class HorrorFilm extends Film {
    private int ageLimit;

    public HorrorFilm(int year, String name, double duration, int limit) {
        super(year, name, duration);
        ageLimit = limit;
    }
    public void setAgeLimit(int limit) {
        this.ageLimit = limit;
    }
    public int getAgeLimit() {
        return this.ageLimit;
    }

    //equals, hashcode, tostring!
}