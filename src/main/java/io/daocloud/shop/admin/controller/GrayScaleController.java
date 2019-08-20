package io.daocloud.shop.admin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianpeidong
 * @version 创建时间: 19-8-20 下午9:33
 */
@RestController
@RequestMapping("/v1")
public class GrayScaleController {

    @GetMapping
    public ResponseEntity getGrayScaleVersionOne() {
        return ResponseEntity.ok()
                .header("apiVersion", "v1")
                .body("this is is version 1");
    }
}
