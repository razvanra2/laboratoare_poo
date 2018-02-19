public interface IFactory {

    /**
     * Creates a Container which implements the strategy given as a parameter.
     *
     * @param strategy The required Strategy.
     * @return a Container which respects the strategy given as a parameter.
     */
    static Container createContainer(Strategy strategy) {
        switch(strategy) {
            case FIFO:
                System.out.println("Creating Queue(IFactory)...");
                return new Queue();
            case LIFO:
                System.out.println("Creating Stack(IFactory)...");
                return new Stack();
        }
        //this will never happen:
        return new Queue();
    }
}
