package Lab6;

abstract class ACalculator {
    protected Object state; // Va reprezenta starea internă a calculatorului

    // Metodă pentru a obține rezultatul
    public Object result() {
        return state;
    }

    // Metodă pentru a reseta starea
    public void clear() {
        state = null;
    }

    // Metodă abstractă care trebuie implementată în subclase
    public abstract void init();
}