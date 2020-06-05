package com.document.demo.controller;

import com.document.demo.bean.Document;
import com.document.demo.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<Document> queryAll(){
        return documentService.queryAll();
    }

    @RequestMapping( value = "/queryByName", method = RequestMethod.GET)
    public List<Document> queryByName(String name) {
        return documentService.queryByName(name);
    }
}
