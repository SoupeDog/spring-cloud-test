package org.xavier.controller;

import org.xavier.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;

/**
 * 描述信息：<br/>
 *
 * @author Xavier
 * @version 1.0
 * @date 2019/1/5
 * @since Jdk 1.8
 */
@RestController
public class UserController {

    public ResponseEntity<?> success(Object entity) {
        MediaType mediaType = new MediaType("application", "json", Charset.forName("UTF-8"));
        ResponseEntity.BodyBuilder builder = ResponseEntity.status(HttpStatus.OK);
        builder.contentType(mediaType);
        return builder.body(entity);
    }

    @GetMapping("/user/{uId}")
    public ResponseEntity<?> getUser(@PathVariable("uId") String uId) {
        User user = new User();
        user.setName("我叫" + uId);
        user.setuId(uId);
        return success(user);
    }
}
