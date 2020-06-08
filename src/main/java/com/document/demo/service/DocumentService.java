package com.document.demo.service;

import com.document.demo.bean.Document;
import com.document.demo.mapper.DocumentMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class DocumentService {

    @Autowired
    private DocumentMapper documentMapper;

    public Map<String, Object> queryAll(String pageNumber,String limit){
        int pageInt = Integer.parseInt(pageNumber);
        int limitInt = Integer.parseInt(limit);
        Page page= PageHelper.startPage(pageInt,limitInt);
        List<Document> content =  documentMapper.queryAll();
        long total = page.getTotal();
        HashMap<String, Object> map = new HashMap<>();
        if(pageInt>total/limitInt+1){
            map.put("msg","页数超出");
            map.put("content",null);
            map.put("totalDocumentNumber",total);
            map.put("limit",limit);
            map.put("PageNumber",pageNumber);
        }else{
            map.put("msg","请求成功");
            map.put("content",content);
            map.put("totalDocumentNumber",total);
            map.put("limit",limit);
            map.put("PageNumber",pageNumber);
        }
        return map;
    }

    public Map<String,Object> queryByName(String name,String pageNumber,String limit){
        int pageInt = Integer.parseInt(pageNumber);
        int limitInt = Integer.parseInt(limit);
        Page page= PageHelper.startPage(pageInt,limitInt);
        List<Document> content =  documentMapper.queryByName(name);
        long total = page.getTotal();
        HashMap<String, Object> map = new HashMap<>();
        if(pageInt>total/limitInt+1){
            map.put("msg","页数超出");
            map.put("content",null);
            map.put("totalDocumentNumber",total);
            map.put("limit",limit);
            map.put("PageNumber",pageNumber);
        }else{
            map.put("msg","请求成功");
            map.put("content",content);
            map.put("totalDocumentNumber",total);
            map.put("limit",limit);
            map.put("PageNumber",pageNumber);
        }
        return map;
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
