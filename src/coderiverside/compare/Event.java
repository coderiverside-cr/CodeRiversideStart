package coderiverside.compare;

public record Event(String name, int millisecs) implements Comparable<Event> {

    @Override
    public int compareTo(Event other) {
        return this.millisecs < other.millisecs ? -1
                : this.millisecs == other.millisecs ? 0
                : 1;
        // Bad implementation
        //return this.millisecs - other.millisecs;

    }
}
