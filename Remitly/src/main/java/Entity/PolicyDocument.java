package Entity;

import java.util.List;

public class PolicyDocument {
    private String version;
    private List<Statement> statementList;

    public PolicyDocument(String version, List<Statement> statementList) {
        this.version = version;
        this.statementList = statementList;
    }

    public PolicyDocument() {
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<Statement> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<Statement> statementList) {
        this.statementList = statementList;
    }

    @Override
    public String toString() {
        return "PolicyDocument{" +
                "version='" + version + '\'' +
                ", statementList=" + statementList +
                '}';
    }
}
