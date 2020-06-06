package com.document.demo.bean;

import lombok.Data;

import java.util.UUID;

@Data
public class Document {
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

}
