package behavioural.template;

public abstract class Task {
    private final AuditTrail auditTrail;

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.insertAuditTrail();
        doExecute();
    }

    protected abstract void doExecute();
}
