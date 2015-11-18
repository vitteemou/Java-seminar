package by.bsu.courses.cinema.entity;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Cinema {
    private String name;
    private int hallsAmount;
    private boolean parking;
    private ArrayList<Film> distribution;
    private ArrayList<Session> allSessions;

    public Cinema(String name, int amount, boolean parking) {
        this.name = name;
        hallsAmount = amount;
        this.parking = parking;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHallsAmount(int amount) {
        hallsAmount = amount;
    }

    public int getHallsAmount() {
        return hallsAmount;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public boolean getParking() {
        return parking;
    }

    public void addFilm(Film f) {
        distribution.add(f);
    }

    public void deleteFilm(Film f) {
        int index = distribution.indexOf(f);
        if(index == -1) {
            throw new NoSuchElementException();
        }
        else {
            distribution.remove(index);
        }
    }

    public boolean showsFilm(Film f) {
       int index = distribution.indexOf(f);
        return (index != -1);
    }
    //public Film getFilmByName(String filmName) {
    //    int i = findFilm(filmName);
    //    return distribution[i];
    //}

    public void addSession(Session s) {
        allSessions.add(s);
    }

    public void deleteSession(Session s) {
        int index = allSessions.indexOf(s);
        if(index == -1) {
            throw new NoSuchElementException();
        }
        else {
            allSessions.remove(index);
        }
    }

    public void sellTickets(Session session, int amount) {
        int index = allSessions.indexOf(session);
        int newAmount = allSessions.get(index).getTicketsAmount();
        newAmount -= amount;
        allSessions.get(index).setTicketsAmount(newAmount);
    }
    public void getBackTickets(Session session, int amount) {
        int index = allSessions.indexOf(session);
        int newAmount = allSessions.get(index).getTicketsAmount();
        newAmount += amount;
        allSessions.get(index).setTicketsAmount(newAmount);
    }
}
//public Session findSession(Film myFilm, double time) {
//    int i = 0;
//    int len = allSessions.length;
//    while ((allSessions[i].getSessionFilm() != myFilm) && (i < len)) {
//        i++;
//    }
//if(i > len) {
//    System.out.println("There's no such film");
//}
//    return allSessions[i];
//}}
