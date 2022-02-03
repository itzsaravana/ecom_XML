package com.comcast.controller.ajax;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@RestController
@RequestMapping("ajax/product")
public class ProductAjaxController {

    @RequestMapping(value="saveProduct.htm",method= RequestMethod.POST)
    public @ResponseBody
    String sendMail(HttpServletRequest request, HttpServletResponse response) throws Exception {

        JSONObject object=new JSONObject();
       // JSONArray array=new JSONArray();


        //JSONObject jsonObject = new JSONObject();

        object.put("Object", object);
        response.setHeader("Cache-Control", "no-cache");
        response.setContentType("application/json");
        PrintWriter pw = response.getWriter();
        pw.println(object);
        pw.close();

        return null;

    }

}
