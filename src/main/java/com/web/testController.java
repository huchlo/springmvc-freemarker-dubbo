package com.web;

import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@CrossOrigin
@RestController
@RequestMapping("/test")
public class testController {
    //String str ="[{\"brand_id\":\"12\",\"brand_category_id\":\"2\",\"brand_name\":\"长虹\",\"brand_logo\":\"2\",\"brand_companyName\":\"长虹公司\",\"brand_website\":changhong.cochan.com\"\",\"brand_status\":\"2\"},{\"brand_id\":\"13\",\"brand_category_id\":\"2\",\"brand_name\":\"格力\",\"brand_logo\":\"2\",\"brand_companyName\":\"格力公司\",\"brand_website\":\"geli.com\",\"brand_status\":\"1\"}]\n";

    @RequestMapping(value="/a", method = RequestMethod.GET,produces="application/json;charset=utf-8")//,produces="application/json;charset=utf-8"
    //@ResponseBody()
    public Object login(HttpServletRequest request, HttpServletResponse response){
        //response.setContentType("application/x-www-form-urlencoded;charset=UTF-8");
        //response.con
        //response.addHeader("Vary","Accept-Encoding");
        //response.addHeader("Content-Encoding","gzip");
        //response.addHeader("Access-Control-Allow-Origin", "*");
        String str ="{\"list\":[{\"brand_id\":\"12\",\"brand_category_id\":\"电视\",\"brand_name\":\"长虹\",\"brand_logo\":\"http://localhost:8080/img/brandLogo/changhong.png\",\"brand_companyName\":\"长虹公司\",\"brand_website\":\"http://cn.changhong.com/\",\"brand_status\":\"2\"},{\"brand_id\":\"13\",\"brand_category_id\":\"空调\",\"brand_name\":\"格力\",\"brand_logo\":\"http://localhost:8080/img/brandLogo/gree.png\",\"brand_companyName\":\"格力公司\",\"brand_website\":\"http://www.gree.com.cn/\",\"brand_status\":\"1\"},{\"brand_id\":\"13\",\"brand_category_id\":\"洗衣机\",\"brand_name\":\"海尔\",\"brand_logo\":\"\",\"brand_companyName\":\"\",\"brand_website\":\"\",\"brand_status\":\"1\"}],\"pagination\":{\"total\":2,\"pageSize\":10,\"current\":1}}";
        //JSONObject jo=JSONObject.fromObject(str);
        //System.out.println(jo);
        //modelMap.put("data", jo);
        //return jo.toString();
        return str;
    }

    @RequestMapping(value="/b/{id}", method = RequestMethod.GET,produces="text/html;charset=UTF-8")
    public Object login1(@PathVariable("id") String id){
        return id;
    }

    @RequestMapping(value="c", method = RequestMethod.GET,params = {"asd"},produces="text/html;charset=UTF-8")
    public Object login2(@RequestParam(value = "asd") String asd,
                         @RequestParam(value = "qwe") Integer qwe){
        return asd;//asd,qwe必须同时有值,且能被String接收
    }

    public static void main(String[] args) {
        String str ="{\"list\":[{\"brand_id\":\"12\",\"brand_category_id\":\"电视\",\"brand_name\":\"长虹\",\"brand_logo\":\"2\",\"brand_companyName\":\"长虹公司\",\"brand_website\":\"http://cn.changhong.com/\",\"brand_status\":\"2\"},{\"brand_id\":\"13\",\"brand_category_id\":\"空调\",\"brand_name\":\"格力\",\"brand_logo\":\"2\",\"brand_companyName\":\"格力公司\",\"brand_website\":\"http://www.gree.com.cn/\",\"brand_status\":\"1\"}],\"pagination\":{\"total\":2,\"pageSize\":10,\"current\":1}}";
        JSONObject jo=JSONObject.fromObject(str);

        System.out.println(jo);
    }
}
