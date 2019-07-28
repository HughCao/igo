package cn.hugh.plat.controller;

import cn.hugh.basic.util.AjaxResult;
import cn.hugh.plat.domain.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    //@RequestMapping(value = "/login",method = RequestMethod.POST) : 等同于@PostMapping("/login")
    //@RequestBody 接收前端传递给后端的json字符串中的数据
    @PostMapping("/login")
    public  AjaxResult login(@RequestBody User user){
        String username = user.getUsername();
        String password = user.getPassword();
        //假登录
        if("admin".equals(username)&&"admin".equals(password)){
            return AjaxResult.ajaxResult().setSuccess(true).setMessage("登录成功");
        }
        return AjaxResult.ajaxResult().setSuccess(false).setMessage("登录失败");
    }
}
