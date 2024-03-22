package Seminar_02.Task2;

//import Seminar_02.Task1.Actor;

public interface QueueBehaviour {

    void takeInQueue(Actor actor);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();
}
