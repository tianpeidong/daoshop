package io.daocloud.shop.admin.controller.v1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianpeidong
 * @version 创建时间: 19-8-20 下午9:33
 */
@RestController
@RequestMapping(path="/v1")
public class GrayScaleController {

    @Value("${helloMsg}")
    private String helloMsg;

    @Value("${testMsg}")
    private String testMsg;

    @GetMapping
    public ResponseEntity testKnoxApp() {
        return ResponseEntity.ok(helloMsg);
    }

    @GetMapping("/hello")
    public ResponseEntity sayHello() {
        return ResponseEntity.ok(testMsg);
    }


}
