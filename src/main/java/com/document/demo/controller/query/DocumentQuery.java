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
