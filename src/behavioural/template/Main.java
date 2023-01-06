package behavioural.template;

public class Main {
    public static void main(String[] args) {
        AuditTrail auditTrail = new AuditTrail();

        DepositMoneyTask task1 = new DepositMoneyTask(auditTrail);
        task1.execute();

        GenerateReportTask task2 = new GenerateReportTask(auditTrail);
        task2.execute();
    }
}
