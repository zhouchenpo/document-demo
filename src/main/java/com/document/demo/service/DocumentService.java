package com.document.demo.service;

import com.document.demo.bean.Document;
import com.document.demo.mapper.DocumentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

//    public void insert(Document document){
//        documentMapper.insert(document);
//    }

}
