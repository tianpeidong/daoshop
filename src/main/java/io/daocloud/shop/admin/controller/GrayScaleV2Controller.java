package io.daocloud.shop.admin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianpeidong
 * @version 创建时间: 19-8-20 下午9:43
 */
@RestController
@RequestMapping("/v2")
public class GrayScaleV2Controller {

    @GetMapping
    public ResponseEntity getGrayScaleVersionOne() {
        return ResponseEntity.ok()
                .header("apiVersion", "v2")
                .body("this is is version 2");
    }
}
