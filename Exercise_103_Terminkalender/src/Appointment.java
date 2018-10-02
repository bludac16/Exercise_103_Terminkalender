
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Appointment {
    private String activity;
    private LocalDateTime date;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy - HH.mm");

    public Appointment(String activity, LocalDateTime date) {
        this.activity = activity;
        this.date = date;
    }

    public String getActivity() {
        return activity;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%s --> %s", date.format(dtf), activity);
    }
     
    
}
