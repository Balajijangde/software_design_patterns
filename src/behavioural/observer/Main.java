package behavioural.observer;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        ListnerClient client = new ListnerClient();
        ListnerDashboard dashboard = new ListnerDashboard();
        dataSource.registerObserver(client);
        dataSource.registerObserver(dashboard);

        dataSource.updateAll();

        dataSource.unregisterObserver(client);
        dataSource.updateAll();
    }
}
