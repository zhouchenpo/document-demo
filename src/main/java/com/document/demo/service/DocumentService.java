package com.document.demo.service;

import com.document.demo.bean.Document;
import com.document.demo.mapper.DocumentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DocumentService {

    @Autowired
    private DocumentMapper documentMapper;

    public List<Document> queryAll(){
        return documentMapper.queryAll();
    }

    public List<Document> queryByName(String name){
        return documentMapper.queryByName(name);
    }

    public void deleteByName(String name){
        documentMapper.deleteByName(name);
    }

    public void insert(String documentNumber,
                       String fileNumber,
                       String boxNumber,
                       String folderNumber,
                       String name,
                       String time,
                       String effectiveTime,
                       String securityLevel,
                       String responsibility,
                       String remarks,
                       String year,
                       String page) {
        documentMapper.insert(new Document(
                documentNumber,fileNumber,
                boxNumber,folderNumber,name,
                time,effectiveTime,securityLevel,
                responsibility,remarks,year,page,
                UUID.randomUUID().toString().replace("-","")));
    }


    public void updateById(String documentNumber,
                       String fileNumber,
                       String boxNumber,
                       String folderNumber,
                       String name,
                       String time,
                       String effectiveTime,
                       String securityLevel,
                       String responsibility,
                       String remarks,
                       String year,
                       String page,
                           String id) {
        documentMapper.updateById(new Document(
                documentNumber,fileNumber,
                boxNumber,folderNumber,name,
                time,effectiveTime,securityLevel,
                responsibility,remarks,year,page,
                id));
    }


}
