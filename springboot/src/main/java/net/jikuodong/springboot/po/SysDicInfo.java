package net.jikuodong.springboot.po;

public class SysDicInfo {
    private String id;

    private String typeCode;

    private String infoName;

    private String infoValue;

    private Integer infoSort;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getInfoName() {
        return infoName;
    }

    public void setInfoName(String infoName) {
        this.infoName = infoName;
    }

    public String getInfoValue() {
        return infoValue;
    }

    public void setInfoValue(String infoValue) {
        this.infoValue = infoValue;
    }

    public Integer getInfoSort() {
        return infoSort;
    }

    public void setInfoSort(Integer infoSort) {
        this.infoSort = infoSort;
    }
}