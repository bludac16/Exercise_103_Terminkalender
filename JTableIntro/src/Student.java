
import java.awt.Color;
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Student {
    private String firstname;
    private String lastname;
    private LocalDate birthday;
    private Color hairColor;

    public Student(String firstname, String lastname, LocalDate birthday, Color hairColor) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.hairColor = hairColor;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getFirstname() {
        return firstname;
    }

    public Color getHairColor() {
        return hairColor;
    }

    public String getLastname() {
        return lastname;
    }
    
    
}
