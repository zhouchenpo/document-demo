package com.document.demo.controller;

import com.document.demo.controller.query.DocumentQuery;
import com.document.demo.domain.Document;
import com.document.demo.execption.StatusCode;
import com.document.demo.result.Result;
import com.document.demo.result.Results;
import com.document.demo.service.DocumentService;
import com.document.demo.utils.OssOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/document")
public class DocumentController {
    @Autowired
    private OssOperation ossOperation;
    @Autowired
    private DocumentService documentService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Result queryAll(String pageNumber, String limit) {
        return documentService.queryAll(pageNumber, limit);
    }


    @RequestMapping(value = "/allNew", method = RequestMethod.GET)
    public Results allNew(DocumentQuery query) {

        try {
            List<Document> documents = documentService.queryAllNew(query);
            long total = documentService.queryAllTotal(query);
            return new Results(new HashMap<String, Object>() {{
                put("list", documents);
                put("total", total);
            }});
        } catch (Exception e) {
            return new Results(StatusCode.SYSTEM_ERROR, e.getMessage());
        }

    }


//    @RequestMapping(value = "/queryByName", method = RequestMethod.GET)
//    public Result queryByName(String name,String pageNumber,String limit) {
//        return documentService.queryByName(name,pageNumber,limit);
//    }

    @RequestMapping(value = "/deleteByName", method = {RequestMethod.GET, RequestMethod.POST})
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
                boxNumber, folderNumber, name,
                time, effectiveTime, securityLevel,
                responsibility, remarks, year, page);
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
                boxNumber, folderNumber, name,
                time, effectiveTime, securityLevel,
                responsibility, remarks, year, page, id);
    }


//************************************************************************************


    @RequestMapping(value = "/insertSelective", method = {RequestMethod.GET, RequestMethod.POST})
    public Results insertSelective(Document document) {
        try {
            return new Results(documentService.insertSelective(document));
        } catch (Exception e) {
            return new Results(StatusCode.SYSTEM_ERROR, e.getMessage());
        }
    }

    @RequestMapping(value = "/updateSelective", method = {RequestMethod.GET, RequestMethod.POST})
    public Results updateSelective(Document document) {
        try {
            return new Results(documentService.updateSelective(document));
        } catch (Exception e) {
            return new Results(StatusCode.SYSTEM_ERROR, e.getMessage());
        }

    }

    @RequestMapping(value = "/upload", method = {RequestMethod.GET,RequestMethod.POST})
    public void upload(MultipartFile file) throws IOException {
        ossOperation.upload(file);
    }

}
