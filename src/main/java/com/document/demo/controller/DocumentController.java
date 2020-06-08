package com.document.demo.controller;
import com.document.demo.result.Result;
import com.document.demo.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @RequestMapping(value = "/document/all", method = RequestMethod.GET)
    public Result queryAll(String pageNumber, String limit) {
        return documentService.queryAll(pageNumber,limit);
    }

    @RequestMapping(value = "/document/queryByName", method = RequestMethod.GET)
    public Result queryByName(String name,String pageNumber,String limit) {
        return documentService.queryByName(name,pageNumber,limit);
    }

    @RequestMapping(value = "/document/deleteByName", method = RequestMethod.GET)
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

}
