package by.bsu.courses.cinema.entity;

public class Film {
    private int releaseYear;
    private String name;
    private double duration;

    public Film(int year, String name, double duration) {
        this.releaseYear = year;
        this.name = name;
        this.duration = duration;
    }

    public void setReleaseYear(int year) {
        releaseYear = year;
    }
    public int getReleaseYear() { return releaseYear; }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
    public double getDuration() {
        return this.duration;
    }

    //equals, hashcode, tostring!
    @Override
    public boolean equals(Object anObject) {
        return name.equals(anObject);
    }

    //public boolean equals(Film f) {
    //return (getName() == f.getName()) && (getReleaseYear() == f.getReleaseYear());
    //}
}
