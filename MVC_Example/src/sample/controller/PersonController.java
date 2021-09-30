package sample.controller;

import javafx.fxml.FXML;
import sample.model.Person;

import java.awt.*;
import java.util.List;

public class PersonController {

    @FXML
    public TextArea textArea;

    @FXML
    public void initialize() {

        List<Person> personList = Person.getAllPersons();

        for (Person p: personList) {
            textArea.setText( textArea.getText() + p);
        }
    }
}