package io.daocloud.shop.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Package io.daocloud.shop.admin.controller
 * @Classname ImageController
 * @Description TODO
 * @Date 2019/3/19 下午4:43
 * @Created by chenghao
 * @desc ImageController
 * @project admin
 */
@RestController
public class ImageController {

    @Value("#{'${daoshop.main.img:https://qiniu-download-public.daocloud.io/DaoCloud_MicroServices_Platform/dmp_logo.svg}'.split(',')}")
    private List<String> images;
    @GetMapping("/image/main")
    private List<String> getImgUrl(){
        return images;
    }

}
