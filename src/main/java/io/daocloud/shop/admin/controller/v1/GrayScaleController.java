package io.daocloud.shop.admin.controller.v1;

import io.daocloud.shop.admin.controller.v1.service.Sender;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(path="/${apiVersion}")
public class GrayScaleController {

    @Value("${apiVersion}")
    private String apiVersion;

    @Autowired
    private Sender sender;

    @GetMapping("/image/main")
    public ResponseEntity testGrayScale() {
        return ResponseEntity.ok()
                .header("version", apiVersion)
                .body("this is is " + apiVersion);
    }

    @GetMapping("/sendMsg")
    public ResponseEntity sendMsg() {
        sender.send();
        return ResponseEntity.ok().build();
    }


}
