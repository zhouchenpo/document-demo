package com.document.demo.controller;
import com.document.demo.bean.Document;
import com.document.demo.service.DocumentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.document.demo.configuration.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Map<String,Object> queryAll(String pageNumber,String limit) {
        return documentService.queryAll(pageNumber,limit);
    }

    @RequestMapping(value = "/queryByName", method = RequestMethod.GET)
    public Map<String,Object> queryByName(String name,String pageNumber,String limit) {
        return documentService.queryByName(name,pageNumber,limit);
    }

    @RequestMapping(value = "/deleteByName", method = RequestMethod.GET)
    public void deleteByName(String name) {
        documentService.deleteByName(name);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
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
        documentService.insert(documentNumber,
                fileNumber,
        boxNumber,folderNumber,name,
                time,effectiveTime,securityLevel,
        responsibility,remarks,year,page);
    }

    @RequestMapping(value = "/updateById", method = RequestMethod.GET)
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
        documentService.updateById(documentNumber,
                fileNumber,
                boxNumber,folderNumber,name,
                time,effectiveTime,securityLevel,
                responsibility,remarks,year,page,id);
    }

}
