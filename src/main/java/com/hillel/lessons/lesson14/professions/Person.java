package com.hillel.lessons.lesson14.professions;

import javafx.util.converter.LocalDateStringConverter;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Person {
    private String dayOfBirth;
    private String fullName;

    public Person(String dayOfBirth, String fullName) {
        this.dayOfBirth = dayOfBirth;
        this.fullName = fullName;
    }

    private int calculateAge(String dayOfBirth){
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy", new Locale("uk"));
        LocalDate birthDate = LocalDate.parse(dayOfBirth, formatter);

        return Period.between(birthDate, currentDate).getYears();
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + calculateAge(dayOfBirth) +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
