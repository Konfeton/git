public class Van extends Car{
    private int numberOfSeats;

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
