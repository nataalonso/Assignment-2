public class Passenger {
    
    private final int currentFloor;
    private final int destinationFloor;
    private final int arrivalTick;
    private Direction direction;

    private Integer destinationReachedTick = null;

    /**
     * Constructs a Passenger instance with specified current floor, destination floor, and arrival tick.
     *
     * @param currentFloor The floor where the passenger currently is.
     * @param destinationFloor The floor where the passenger wants to go.
     * @param arrivalTick The simulation tick when the passenger arrives.
     */
    public Passenger(int currentFloor, int destinationFloor, int arrivalTick) {
        this.currentFloor = currentFloor;
        this.destinationFloor = destinationFloor;
        this.arrivalTick = arrivalTick;
        this.direction = destinationFloor > currentFloor ? Direction.UP : Direction.DOWN;
    }

    /**
     * Sets the tick when the passenger reaches their destination.
     *
     * @param tick The simulation tick when the passenger reaches their destination.
     */
    public void setDestinationReachedTick(int tick) {
        this.destinationReachedTick = tick;
    }

    /**
     * Determines if the passenger has reached their destination.
     *
     * @return true if the passenger has reached their destination, false otherwise.
     */
    public boolean hasReachedDestination() {
        return destinationReachedTick != null;
    }

    /**
     * Calculates the total time taken by the passenger from arrival to reaching the destination or the current tick.
     *
     * @param currentTick The current tick of the simulation.
     * @return The total time taken by the passenger in ticks.
     */
    public int totalTimeTaken(int currentTick) {
        return hasReachedDestination() ? destinationReachedTick - arrivalTick : currentTick - arrivalTick;
    }

    /**
     * Gets the current floor of the passenger.
     *
     * @return The current floor of the passenger.
     */
    public int getCurrentFloor() {
        return currentFloor;
    }

    /**
     * Gets the destination floor of the passenger.
     *
     * @return The destination floor of the passenger.
     */
    public int getDestinationFloor() {
        return destinationFloor;
    }

    /**
     * Gets the arrival tick of the passenger.
     *
     * @return The arrival tick of the passenger.
     */
    public int getArrivalTick() {
        return arrivalTick;
    }

    /**
     * Gets the direction in which the passenger is traveling.
     *
     * @return The direction of travel for the passenger.
     */
    public Direction getDirection() {
        return direction;
    }
}
