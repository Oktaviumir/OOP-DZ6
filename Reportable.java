public interface Reportable<T extends User> {

    void report(T user);

}