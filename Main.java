public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Persister persister = new Persister();
        persister.save(user);
        UserReport report = new UserReport();
        report.report(user);

    }
}