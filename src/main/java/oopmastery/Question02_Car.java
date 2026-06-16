package oopmastery;

public class Question02_Car {

    private Question02_Engine engine;

    public Question02_Car() {
        // TODO:
        // Create the engine object here
        Question02_Engine engine1 = new Question02_Engine();
    }

    public void startCar() {
        // TODO:
        // Start the engine
        engine.start();
    }

    public void stopCar() {
        // TODO:
        // Stop the engine
        engine.stop();
    }

    public boolean isCarRunning() {
        // TODO:
        return false;
    }
}
