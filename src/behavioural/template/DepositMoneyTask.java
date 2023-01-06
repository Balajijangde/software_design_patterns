package behavioural.template;

public class DepositMoneyTask extends Task{

    DepositMoneyTask(AuditTrail auditTrail){
        super(auditTrail);
    }
    @Override
    protected void doExecute() {
        System.out.println("deposit money task");
    }
}
