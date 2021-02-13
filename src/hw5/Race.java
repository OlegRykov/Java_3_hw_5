package hw5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Race {
    private ArrayList<Stage> stages;
    private boolean isFinished;
    Lock lock = new ReentrantLock();

    public ArrayList<Stage> getStages() {
        return stages;
    }

    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }

    public void isFinishedCar (Car car){
        lock.lock();
        if (!isFinished){
            System.out.println(car.getName() + " Win!!!!");
            isFinished = true;
        }
        lock.unlock();
    }
}
