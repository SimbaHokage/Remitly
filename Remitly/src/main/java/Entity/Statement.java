package Entity;

public class Statement {
    private String sid;
    private String effect;
    private String principal;
    private String action;
    private String resource;
    private String condition;

    public Statement(String sid, String effect, String principal, String action, String resource, String condition) {
        this.sid = sid;
        this.effect = effect;
        this.principal = principal;
        this.action = action;
        this.resource = resource;
        this.condition = condition;
    }

    public Statement() {
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Statement{" +
                "sid='" + sid + '\'' +
                ", effect='" + effect + '\'' +
                ", principal='" + principal + '\'' +
                ", action='" + action + '\'' +
                ", resource='" + resource + '\'' +
                ", condition='" + condition + '\'' +
                '}';
    }
}
