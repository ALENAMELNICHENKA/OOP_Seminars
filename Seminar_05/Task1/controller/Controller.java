package Seminar_05.Task1.controller;

import Seminar_05.Task1.data.User;
import Seminar_05.Task1.servise.DataService;

public class Controller {

    private DataService datServ = new DataService();

    public void createUser(User user, String type) {
        datServ.createUser(user, type);
    }

    public void read(String type) {
       
        System.out.println(datServ.read(type));
    }
}
