package by.bsu.courses.cinema.logic;
import by.bsu.courses.cinema.entity.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class VisitCinema {
    public static ArrayList<Cinema> findCinemasByFilm(Film film, ArrayList<Cinema> allCinemas) {
        ArrayList<Cinema> choice = new ArrayList<>();
        for(Cinema cinema : allCinemas) {
            if(cinema.showsFilm(film)) {
                choice.add(cinema);
            }
        }
        return choice;
    }
    //findSessionsbyFilm with cinemas!
    public static Cinema findCinemaByFilm(String filmName, ArrayList<Cinema> allCinemas) {
        int i = 0;
        int len = allCinemas.size();
        while ((allCinemas.get(i).getName() != filmName) && (i < len)) {
            i++;
        }
        if(i > len) {
            throw new NoSuchElementException();
        }
        return allCinemas.get(i);
    }
    public static void buyTickets(Cinema cinema, Session session, int amount, int personAge) {//throws NotEnoughTicketsException{
        Film myFilm = session.getSessionFilm();
        if ((myFilm instanceof HorrorFilm) && (personAge < ((HorrorFilm) myFilm).getAgeLimit())) {
            System.out.println("Sorry, you can't buy tickets for this film");
        }
        else if(session.getTicketsAmount() < amount) {
            System.out.println("Sorry, there's not enough tickets for you to buy");
        }
        else {
            cinema.sellTickets(session, amount);
        }
    }
    public static void returnBackTickets(Cinema cinema, Session session, int amount) {
        cinema.getBackTickets(session, amount);
    }
}

