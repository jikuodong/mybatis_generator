package net.jikuodong.springboot.po;

public class ReportResult {
    private String caseId;

    private String firstDiagDoctor;

    private String returnDiagDoctor;

    private String groupDiagDoctor;

    private String diagonseResult;

    private String recommendation;

    private String cellCheckedResult;

    private String cellDiagonseDesc;

    private Integer isSyncFlag;

    private byte[] isPositive;

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getFirstDiagDoctor() {
        return firstDiagDoctor;
    }

    public void setFirstDiagDoctor(String firstDiagDoctor) {
        this.firstDiagDoctor = firstDiagDoctor;
    }

    public String getReturnDiagDoctor() {
        return returnDiagDoctor;
    }

    public void setReturnDiagDoctor(String returnDiagDoctor) {
        this.returnDiagDoctor = returnDiagDoctor;
    }

    public String getGroupDiagDoctor() {
        return groupDiagDoctor;
    }

    public void setGroupDiagDoctor(String groupDiagDoctor) {
        this.groupDiagDoctor = groupDiagDoctor;
    }

    public String getDiagonseResult() {
        return diagonseResult;
    }

    public void setDiagonseResult(String diagonseResult) {
        this.diagonseResult = diagonseResult;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public String getCellCheckedResult() {
        return cellCheckedResult;
    }

    public void setCellCheckedResult(String cellCheckedResult) {
        this.cellCheckedResult = cellCheckedResult;
    }

    public String getCellDiagonseDesc() {
        return cellDiagonseDesc;
    }

    public void setCellDiagonseDesc(String cellDiagonseDesc) {
        this.cellDiagonseDesc = cellDiagonseDesc;
    }

    public Integer getIsSyncFlag() {
        return isSyncFlag;
    }

    public void setIsSyncFlag(Integer isSyncFlag) {
        this.isSyncFlag = isSyncFlag;
    }

    public byte[] getIsPositive() {
        return isPositive;
    }

    public void setIsPositive(byte[] isPositive) {
        this.isPositive = isPositive;
    }
}