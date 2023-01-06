package behavioural.template;

public class GenerateReportTask extends Task{

    GenerateReportTask(AuditTrail auditTrail){
        super(auditTrail);
    }
    @Override
    protected void doExecute() {
        System.out.println("Generate report task");
    }
}
