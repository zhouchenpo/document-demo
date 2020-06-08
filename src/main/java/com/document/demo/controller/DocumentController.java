package com.document.demo.controller;
import com.document.demo.controller.query.DocumentQuery;
import com.document.demo.domain.Document;
import com.document.demo.result.Result;
import com.document.demo.result.Results;
import com.document.demo.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @RequestMapping(value = "/document/all", method = RequestMethod.GET)
    public Result queryAll(String pageNumber, String limit) {
        return documentService.queryAll(pageNumber,limit);
    }


    @RequestMapping(value = "/document/allNew", method = RequestMethod.GET)
    public Results allNew( DocumentQuery query) {
        List<Document> documents = documentService.queryAllNew(query);
        long total =  documentService.queryAllTotal(query);
        return new Results(new HashMap<String,Object>(){{
            put("list",documents);
            put("total",total);

        }});
    }


//    @RequestMapping(value = "/document/queryByName", method = RequestMethod.GET)
//    public Result queryByName(String name,String pageNumber,String limit) {
//        return documentService.queryByName(name,pageNumber,limit);
//    }

    @RequestMapping(value = "/document/deleteByName", method = {RequestMethod.GET,RequestMethod.POST})
    public void deleteByName(String name) {
        documentService.deleteByName(name);
    }

    @RequestMapping(value = "/document/insert", method = RequestMethod.GET)
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

    @RequestMapping(value = "/document/updateById", method = RequestMethod.GET)
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










    @RequestMapping(value = "/document/insertSelective", method = {RequestMethod.GET,RequestMethod.POST})
    public void insertSelective( Document document) {
        documentService.insertSelective(document);
    }

    @RequestMapping(value = "/document/updateSelective", method = {RequestMethod.GET,RequestMethod.POST})
    public void updateSelective( Document document) {
        documentService.updateSelective(document);
    }

}
