package by.it.ithoitan.jd02_03.service;


import by.it.ithoitan.jd02_03.entity.Good;

public interface CustomerAction {
    void enteredStore();
    Good chooseGood();
    void goToQueue();
    void goOut();

}
