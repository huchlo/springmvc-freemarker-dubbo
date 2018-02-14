package com.web.wareConfigure;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@CrossOrigin
@RestController
@RequestMapping("/brandConfigure")
public class brandConfigure {


    @RequestMapping(value="/fetchList", method = RequestMethod.GET,produces="application/json;charset=utf-8")
    public Object fetchList(HttpServletRequest request, HttpServletResponse response){
        String str ="{\"list\":[{\"brand_id\":\"12\",\"brand_category_id\":\"电视\",\"brand_name\":\"长虹\",\"brand_logo\":\"http://localhost:8080/img/brandLogo/changhong.png\",\"brand_companyName\":\"长虹公司\",\"brand_website\":\"http://cn.changhong.com/\",\"brand_status\":\"2\"},{\"brand_id\":\"13\",\"brand_category_id\":\"空调\",\"brand_name\":\"格力\",\"brand_logo\":\"http://localhost:8080/img/brandLogo/gree.png\",\"brand_companyName\":\"格力公司\",\"brand_website\":\"http://www.gree.com.cn/\",\"brand_status\":\"1\"},{\"brand_id\":\"13\",\"brand_category_id\":\"洗衣机\",\"brand_name\":\"海尔\",\"brand_logo\":\"\",\"brand_companyName\":\"\",\"brand_website\":\"\",\"brand_status\":\"1\"}],\"pagination\":{\"total\":2,\"pageSize\":10,\"current\":1}}";
        return str;
    }

    @RequestMapping(value="/add", method = RequestMethod.POST, produces="application/json;charset=utf-8")
    public Object add(HttpServletRequest request, HttpServletResponse response) {
        String urlkey=request.getRemoteAddr();
        if(urlkey.equals("127.0.0.1")){
            StringBuffer out = new StringBuffer();
            BufferedReader reader=null;
            try{
                reader = new BufferedReader(new InputStreamReader(request.getInputStream(),"utf-8"));
                String line=null;
                while((line = reader.readLine())!=null){
                    out.append(line);
                }
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                if(null!=reader) {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println(out.toString());

            String str ="{\"list\":[{\"brand_id\":\"12\",\"brand_category_id\":\"电视\",\"brand_name\":\"长虹\",\"brand_logo\":\"http://localhost:8080/img/brandLogo/changhong.png\",\"brand_companyName\":\"长虹公司\",\"brand_website\":\"cn.changhong.com\",\"brand_status\":\"2\"},{\"brand_id\":\"13\",\"brand_category_id\":\"空调\",\"brand_name\":\"格力\",\"brand_logo\":\"http://localhost:8080/img/brandLogo/gree.png\",\"brand_companyName\":\"格力公司\",\"brand_website\":\"www.gree.com.cn\",\"brand_status\":\"1\"},{\"brand_id\":\"13\",\"brand_category_id\":\"洗衣机\",\"brand_name\":\"海尔\",\"brand_logo\":\"\",\"brand_companyName\":\"\",\"brand_website\":\"\",\"brand_status\":\"1\"}],\"pagination\":{\"total\":2,\"pageSize\":10,\"current\":1}}";
            return str;
        }else{
            return "{\"data\":\"success\"}";
        }

    }
}
