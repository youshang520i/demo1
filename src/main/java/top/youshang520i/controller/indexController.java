package top.youshang520i.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import top.youshang520i.pojo.User;
import top.youshang520i.service.UserServiceI;

import java.util.List;

/**
 * @actuor youshang520i
 * @create 2018-11-08 11:48
 * @desc
 */
@Controller
public class indexController {
    @Autowired
    private UserServiceI userServiceI;
    //application/json;
    @ResponseBody
    @RequestMapping(value = "/index",produces = "text/html;charset=utf-8",method = RequestMethod.GET)
    public String index(){
        System.out.println("进来了.....................");
         User user = userServiceI.selectByPrimaryKey(1l);
        System.out.println("查询得到的结果:"+user);
        return "123"; //userServiceI.selectByPrimaryKey(1l);
    }
}
