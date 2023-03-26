//package com.example.demo.cookies;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//public class MyCookiesForGet {
//
//    /**
//     * 开发至少带一个参数才能访问get请求
//     * 返回商品列表
//     * @return MyList;
//     */
//    @RequestMapping(value = "/get/with/param",method = RequestMethod.GET)
//    public Map<Object, Object> getList(@RequestParam Integer start,
//                                       @RequestParam Integer end){
//        Map<Object, Object> MyList = new HashMap<>();
//        MyList.put("鞋子",200);
//        MyList.put("方便面",40);
//        MyList.put("寸衫",90);
//        return MyList;
//    }

//}
