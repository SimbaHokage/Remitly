package Entity;

public class Policy {
    private String PolicyName;
    private PolicyDocument PolicyDocument;

    public Policy(String PolicyName, PolicyDocument PolicyDocument) {
        this.PolicyName = PolicyName;
        this.PolicyDocument = PolicyDocument;
    }

    public Policy() {
    }

    public String getPolicyName() {
        return PolicyName;
    }

    public void setPolicyName(String policyName) {
        PolicyName = policyName;
    }

    public Entity.PolicyDocument getPolicyDocument() {
        return PolicyDocument;
    }

    public void setPolicyDocument(Entity.PolicyDocument policyDocument) {
        PolicyDocument = policyDocument;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "PolicyName='" + PolicyName + '\'' +
                ", PolicyDocument=" + PolicyDocument +
                '}';
    }
}
