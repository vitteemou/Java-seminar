package by.bsu.courses.cinema.creator;
import by.bsu.courses.cinema.entity.*;
import by.bsu.courses.cinema.logic.VisitCinema;

public class CreateCinema {
    public static void createCinema() {
        Film film1 = new Film(2014, "Interstellar", 3.5);
        Film film2 = new Film(2007, "Sweeney Todd", 2.5);
        HorrorFilm film3 = new HorrorFilm(2010, "The Nightmare before Christmas", 1.5, 16);

        Session session1 = new Session(film1, 13.20, 100, 25.0);
        Session session2 = new Session(film2, 15.00, 100, 25.0);
        Session session3 = new Session(film3, 21.30, 100, 30.0);

        Cinema cinema1 = new Cinema("Rocket", 1, false);
        Cinema cinema2 = new Cinema("Pioneer", 2, true);
        //c3 = Cinema("Aurora", 2, true);
        cinema1.addSession(session1);
        cinema2.addSession(session2);
        cinema2.addSession(session3);
    }
}
