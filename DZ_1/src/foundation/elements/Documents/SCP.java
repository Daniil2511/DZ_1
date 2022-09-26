package foundation.elements.Documents;

public class SCP extends file{
    private int SCPNumber;
    private String SCPName;
    private String type;
    private String Possibility;

    private String ClassSCP;

    ////////////////////////////////
    public SCP(int SCPNumber, String SCPName ){
        this.SCPNumber = SCPNumber ;
        this.SCPName = SCPName;
    }

    public String getSCPName() {
        return SCPName;
    }

    public void setSCPName(String SCPName) {
        this.SCPName = SCPName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPossibility() {
        return Possibility;
    }

    public void setPossibility(String possibility) {
        Possibility = possibility;
    }

    public String getClassSCP() {
        return ClassSCP;
    }

    public void setClassSCP(String classSCP) {
        ClassSCP = classSCP;
    }

}
