package com.dmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by liuhuan on 2017/9/17.
 */
public interface IFileService {
    public String upload(MultipartFile file, String path);
}
