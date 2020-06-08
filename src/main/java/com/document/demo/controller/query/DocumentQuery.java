package com.document.demo.controller.query;

import com.document.demo.page.Pageable;
import lombok.Data;

@Data
public class DocumentQuery  extends Pageable {
    String documentNumber; //文号
    String fileNumber;           //归档号
    String boxNumber;          //盒号
    String folderNumber;      //全宗号
    String name;                  //标题
    String time;                    //形成时间
    String effectiveTime;      //有效时间
    String securityLevel;      //密级
    String responsibility;      //负责单位
    String remarks;             //备注
    String id;                        //UUID
    String year;                    //年份
    String page;                   //页数

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public void setBoxNumber(String boxNumber) {
        this.boxNumber = boxNumber;
    }

    public void setFolderNumber(String folderNumber) {
        this.folderNumber = folderNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public String getBoxNumber() {
        return boxNumber;
    }

    public String getFolderNumber() {
        return folderNumber;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public String getSecurityLevel() {
        return securityLevel;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public String getRemarks() {
        return remarks;
    }

    public String getId() {
        return id;
    }

    public String getYear() {
        return year;
    }

    public String getPage() {
        return page;
    }



    public DocumentQuery(String documentNumber, String fileNumber, String boxNumber, String folderNumber, String name, String time, String effectiveTime, String securityLevel, String responsibility, String remarks, String year, String page, String id) {
        this.documentNumber = documentNumber;
        this.fileNumber = fileNumber;
        this.boxNumber = boxNumber;
        this.folderNumber = folderNumber;
        this.name = name;
        this.time = time;
        this.effectiveTime = effectiveTime;
        this.securityLevel = securityLevel;
        this.responsibility = responsibility;
        this.remarks = remarks;
        this.year = year;
        this.page = page;
        this.id = id;
    }
}
