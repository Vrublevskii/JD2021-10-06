package by.it._classwork_.jd02_03;

import by.it._classwork_.jd02_03.entity.Manager;
import by.it._classwork_.jd02_03.entity.Queue;
import by.it._classwork_.jd02_03.entity.Store;
import by.it._classwork_.jd02_03.service.StoreWorker;

public class Runner {
    public static void main(String[] args) {
        //for (int i = 0; i < 1; i++) {
            Manager manager = new Manager(100);
            Queue queue = new Queue(30);
            Store store = new Store(manager, queue);
            StoreWorker storeWorker = new StoreWorker(store);
            storeWorker.start();
        //}
    }
}