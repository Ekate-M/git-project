public interface Sortable {
    public interface Sortable<T> extends Comparable<T> {
        @Override
        int compareTo(T o);
    }
