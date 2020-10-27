package com.vueblog.demo.controller;


import com.vueblog.demo.common.lang.Result;
import com.vueblog.demo.entity.User;
import com.vueblog.demo.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author bw
 * @since 2020-10-26
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

//    @RequiresAuthentication
    @GetMapping("/index")
    public Result index() {
        User user = userService.getById(1L);
        return Result.succ(user);
    }

    @PostMapping("/save")
    public Result save(@Validated @RequestBody User user) {
        return Result.succ(user);
    }
}
