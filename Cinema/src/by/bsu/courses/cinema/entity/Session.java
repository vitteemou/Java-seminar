package by.bsu.courses.cinema.entity;

public class Session {
    private Film sessionFilm;
    private double startTime;
    private int ticketsAmount;
    private double price;

    public Session(Film film, double time, int amount, double price) {
        sessionFilm = film;
        startTime = time;
        ticketsAmount = amount;
        this.price = price;
    }

    public void setSessionFilm(Film sessionFilm) {
        this.sessionFilm = sessionFilm;
    }
    public Film getSessionFilm() {
        return sessionFilm;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }
    public double getStartTime() {
        return startTime;
    }

    public void setTicketsAmount(int ticketsAmount) {
        this.ticketsAmount = ticketsAmount;
    }
    public int getTicketsAmount() {
        return ticketsAmount;
    }
    public double getPrice() {
        return price;
    }

    public boolean equals(Session s) {
        return ((getSessionFilm() == s.getSessionFilm()) && (getStartTime() == s.getStartTime()));
    }

}

