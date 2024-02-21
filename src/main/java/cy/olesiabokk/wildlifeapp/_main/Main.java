package cy.olesiabokk.wildlifeapp._main;

import cy.olesiabokk.wildlifeapp.entity.Manul;
import cy.olesiabokk.wildlifeapp.util.EventProducer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi! This app shows the life of manul. It has a lot of important things to do. Sometimes it meets friends, sometimes enemies. " +
                "I hope manul will live a long life and eat well.");
        Manul manul = new Manul();
        EventProducer event = new EventProducer();
        try {
            event.startGame(manul);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
