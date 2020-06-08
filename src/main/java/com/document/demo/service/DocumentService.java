package com.document.demo.service;

import com.document.demo.controller.query.DocumentQuery;
import com.document.demo.example.DocumentExample;
import com.document.demo.mapper.DocumentMapper;
import com.document.demo.result.Result;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.UUID;

@Service
public class DocumentService {

    @Autowired
    private DocumentMapper documentMapper;

    public Result queryAll(String pageNumber, String limit){
//        int pageInt = Integer.parseInt(pageNumber);
//        int limitInt = Integer.parseInt(limit);
//        Page page= PageHelper.startPage(pageInt,limitInt);
//        List<Document> content =  documentMapper.queryAll();
//        long total = page.getTotal();
//        HashMap<String, Object> dataMap = new HashMap<>();
//        HttpServletResponse httpServletResponse = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
//        assert httpServletResponse != null;
//        int status = httpServletResponse.getStatus();
//
//        dataMap.put("content",content);
//        dataMap.put("total",total);
//        dataMap.put("limit",limit);
//        dataMap.put("PageNumber",pageNumber);
//        if(pageInt>total/limitInt+1){
//            dataMap.put("content",new ArrayList<Document>());
//
//            return new Result(dataMap,status,"页数超出",true);
//        }
//        return new Result(dataMap,status,"查询成功",true);
        return null;
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
//        documentMapper.insert(new Document(
//                documentNumber,fileNumber,
//                boxNumber,folderNumber,name,
//                time,effectiveTime,securityLevel,
//                responsibility,remarks,year,page,
//                UUID.randomUUID().toString().replace("-","")));
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
//        documentMapper.updateById(new Document(
//                documentNumber,fileNumber,
//                boxNumber,folderNumber,name,
//                time,effectiveTime,securityLevel,
//                responsibility,remarks,year,page,
//                id));
    }




//    ******************************************************************************
public List<com.document.demo.domain.Document> queryAllNew(DocumentQuery query){

    DocumentExample example = new DocumentExample();
    example.setOffset(query.getPageNumber().longValue());
    example.setLimit(query.getLimit());
    DocumentExample.Criteria criteria = example.createCriteria();
    if(!StringUtils.isEmpty(query.getName())){
        criteria.andNameLike("%" + query.getName() + "%");
    }
    List<com.document.demo.domain.Document> documents = documentMapper.selectByExample(example);
    return documents;
}

    public long queryAllTotal(DocumentQuery query){
//        Page page= PageHelper.startPage(query.getPageNumber(),query.getLimit());
        DocumentExample example = new DocumentExample();
        DocumentExample.Criteria criteria = example.createCriteria();
        if(!StringUtils.isEmpty(query.getName())){
            criteria.andNameLike("%"+query.getName()+"%");
        }
        return documentMapper.countByExample(example);
    }



    public com.document.demo.domain.Document detail(String id){
        Assert.isTrue(!StringUtils.isEmpty(id),"id不存在");
        return documentMapper.selectByPrimaryKey(id);
    }

    public int delete(String id){
        Assert.isTrue(!StringUtils.isEmpty(id),"id不存在");
        return documentMapper.deleteByPrimaryKey(id);
    }

    public void deleteByName(String name){
//        documentMapper.deleteByName(name);

        DocumentExample example = new DocumentExample();
        DocumentExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(name);
        documentMapper.deleteByExample(example);

    }


    public int insertSelective(com.document.demo.domain.Document document) {
        document.setId(UUID.randomUUID().toString().replace("-",""));
        return documentMapper.insertSelective(document);
    }

    public int updateSelective(com.document.demo.domain.Document document){

        Assert.isTrue(!StringUtils.isEmpty(document.getId()),"ID不存在");

        return documentMapper.updateByPrimaryKeySelective(document);

    }


}
