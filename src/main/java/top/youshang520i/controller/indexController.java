package top.youshang520i.controller;

import com.alibaba.druid.util.StringUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.convert.RedisData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import top.youshang520i.pojo.User;
import top.youshang520i.service.UserServiceI;
import top.youshang520i.util.RedisUtils;

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
    @Autowired
    private RedisUtils redisUtils;
    @Autowired
    private ObjectMapper objectMapper;

    @RequestMapping(value = "/index",produces = "text/html;charset=utf-8",method = RequestMethod.GET)
    public String index() throws JsonProcessingException {
        System.out.println("进来了.....................");
        String key = "top.youshang520i.service.impl.UserServiceImpl.selectByPrimaryKey";
        String json = redisUtils.get(key);
        String s1 = "";
        System.out.println("从缓存中查询是否有数据存在:"+json);
        if(json == null){
            User user = userServiceI.selectByPrimaryKey(1l);
            s1 = objectMapper.writeValueAsString(user);
            redisUtils.set(key,s1);
        }else{
            s1 = json;
        }
        System.out.println("得到缓存中的数据："+redisUtils.get(key));
        return "hello";
    }
}
