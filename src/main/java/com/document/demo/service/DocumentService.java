package com.document.demo.service;

import com.document.demo.bean.Document;
import com.document.demo.mapper.DocumentMapper;
import com.document.demo.result.Result;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Service
public class DocumentService {

    @Autowired
    private DocumentMapper documentMapper;

    public Result queryAll(String pageNumber, String limit){
        int pageInt = Integer.parseInt(pageNumber);
        int limitInt = Integer.parseInt(limit);
        Page page= PageHelper.startPage(pageInt,limitInt);
        List<Document> content =  documentMapper.queryAll();
        long total = page.getTotal();
        HashMap<String, Object> dataMap = new HashMap<>();
        HttpServletResponse httpServletResponse = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        assert httpServletResponse != null;
        int status = httpServletResponse.getStatus();

        dataMap.put("content",content);
        dataMap.put("total",total);
        dataMap.put("limit",limit);
        dataMap.put("PageNumber",pageNumber);
        if(pageInt>total/limitInt+1){
            dataMap.put("content",new ArrayList<Document>());

            return new Result(dataMap,status,"页数超出",true);
        }
        return new Result(dataMap,status,"查询成功",true);

    }

    public Result queryByName(String name,String pageNumber,String limit){
        int pageInt = Integer.parseInt(pageNumber);
        int limitInt = Integer.parseInt(limit);
        Page page= PageHelper.startPage(pageInt,limitInt);
        List<Document> content =  documentMapper.queryByName(name);
        long total = page.getTotal();
        HashMap<String, Object> dataMap = new HashMap<>();
        HttpServletResponse httpServletResponse = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        assert httpServletResponse != null;
        int status = httpServletResponse.getStatus();

        dataMap.put("content",content);
        dataMap.put("total",total);
        dataMap.put("limit",limit);
        dataMap.put("PageNumber",pageNumber);
        if(pageInt>total/limitInt+1){
            dataMap.put("content",new ArrayList<Document>());

            return new Result(dataMap,status,"页数超出",true);
        }
        return new Result(dataMap,status,"查询成功",true);
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
