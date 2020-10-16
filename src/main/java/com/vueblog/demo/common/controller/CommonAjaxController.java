package com.vueblog.demo.common.controller;

import com.vueblog.demo.common.processor.JsonDateValueProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * @author bw
 */
@Slf4j
@Controller
public class CommonAjaxController {
    /**
     * 异步请求 status返回状态 returnMessage 返回携带信息
     *
     * @param response
     * @param status
     */
    protected void returnAjaxRequestMessage(HttpServletResponse response,
                                            String status, String returnMessage) {
        try {
            response.setContentType("application/json;charset=UTF-8");
            response.setHeader("Access-Control-Allow-Origin", "*");
            Map<String, String> map3 = new HashMap<String, String>();
            map3.put("status", status);
            map3.put("message", returnMessage);
            response.getWriter().println(JSONObject.fromObject(map3).toString());
        } catch (IOException e) {
            log.error(String.valueOf(e));
            return;
        }
    }

    /**
     * 异步请求返回json结果Object形式
     *
     * @param response
     */
    protected void returnAjaxObjectJson(HttpServletResponse response, Object obj) {
        try {
            response.setContentType("application/json;charset=UTF-8");
            response.setHeader("Access-Control-Allow-Origin", "*");
            JsonConfig jsonConfig = new JsonConfig();
            jsonConfig.registerJsonValueProcessor(Date.class,
                    new JsonDateValueProcessor());
            String json = JSONObject.fromObject(obj, jsonConfig).toString();
            log.info("response data : " + json);
            response.getWriter().println(json);
        } catch (IOException e) {
            log.error(String.valueOf(e));
            return;
        }
    }

    /**
     * 异步请求返回json结果
     * @desc @SuppressWarnings 用于抑制编译器产生警告信息  (unchecked和rawtypes混用，用于抑制单类型的警告)
     * @desc @SuppressWarnings(value={"unchecked", "rawtypes"})抑制多类型的警告
     * @desc @SuppressWarnings("all") 用于抑制所有类型的警告
     */
    @SuppressWarnings("unchecked")
    protected void returnAjaxArrayJson(HttpServletResponse response,
                                       Object obj, String listName) {
        @SuppressWarnings("rawtypes")
        Map resultMap = new HashMap();
        resultMap.put(listName, obj);
        this.returnAjaxObjectJson(response, resultMap);
    }

    /**
     * 异步请求返回json结果
     *
     * @param response
     */
    protected void returnAjaxArrayJson(HttpServletResponse response, Object obj) {
        try {
            response.setContentType("application/json;charset=UTF-8");
            response.setHeader("Access-Control-Allow-Origin", "*");
            JsonConfig jsonConfig = new JsonConfig();
            jsonConfig.registerJsonValueProcessor(Date.class,
                    new JsonDateValueProcessor());
            log.info("response data : " + JSONArray.fromObject(obj, jsonConfig).toString());
            response.getWriter().println(JSONArray.fromObject(obj, jsonConfig).toString());
        } catch (IOException e) {
            log.error(String.valueOf(e));
            return;
        }
    }
}
