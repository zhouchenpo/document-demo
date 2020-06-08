package com.document.demo.utils;
import com.aliyun.oss.*;
import com.aliyun.oss.model.PutObjectRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Component
public class OssOperation {
    public String accessKeyId = "LTAI4G5bRch9GA1sdAa8Vo81";
    public String accessKeySecret = "r6sXD9OfaIRhN6Btp8jpTl3SdN5nIP";
    public String endPoint = "oss-cn-hangzhou.aliyuncs.com";
    public String bucket = "jjxx-spz";
    public String region = "oss-cn-hangzhou";

    public void upload(MultipartFile file) throws IOException {
        OSS ossClient = new OSSClientBuilder().build(endPoint, accessKeyId, accessKeySecret);
        String fileName = file.getOriginalFilename();
        String suffix=fileName.substring(fileName.lastIndexOf("."));
        String prefix=fileName.substring(0,fileName.lastIndexOf(".")+1);
        final File tempFile = File.createTempFile(UUID.randomUUID().toString(), suffix);
        file.transferTo(tempFile);

        PutObjectRequest putObjectRequest = new PutObjectRequest(
                bucket, fileName, tempFile);

        ossClient.putObject(putObjectRequest);
        ossClient.shutdown();
        tempFile.delete();
    }

//    public MultipartFile download(String fileName){
//
//    }
}
