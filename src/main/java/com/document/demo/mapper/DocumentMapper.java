package com.document.demo.mapper;

import com.document.demo.bean.Document;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface DocumentMapper {
    List<Document> queryAll();

    List<Document> queryByName(String name);
}
