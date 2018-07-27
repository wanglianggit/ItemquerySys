package com.ys.config.controller;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.ys.response.ResponseCode;
import com.ys.response.ValiResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

public  abstract  class ABaseController {

    @Autowired
    protected HttpServletRequest request;

    @Autowired
    protected HttpSession session;


    //默认的缓存有效期
    public int DEFAULT_TIME_OUT=60*60*2;
    public int DEFAULT_MAX_TIME_OUT=60*60*24;


    protected Gson gson = new Gson();


    protected  String getParamString(){
      String  json =  request.getParameter("params");
        return  json;
    }
    protected  <T> T getParamEntity(Class<T> tClass){
        String  json =  request.getParameter("params");
       return    JSON.parseObject(json,tClass);
    }
    protected Map<String,Object> getParamMap(){
        String  json =  request.getParameter("params");

        return  JSON.parseObject(json, HashMap.class);
    }

    protected ValiResult validataParams(String... names) {
        boolean isSuccess = true;
        ResponseCode responseCode = ResponseCode.SUCCESS;
        StringBuilder sb= new StringBuilder("");
        if (names.length > 0) {
            Map<String, Object> pamrasMap = this.getParamMap();
            for (String name : names) {
                Object val = pamrasMap.get(name);
                if (val == null) {
                    sb.append("参数【"+name+"】缺失！");
                    responseCode=ResponseCode.PARAMETER_MISS;
                    isSuccess = false;
                    break;
                } else {
                    if (val instanceof String) {
                        if (StringUtils.isEmpty(val.toString())) {
                            sb.append("参数【"+name+"】的值为null！");
                            responseCode=ResponseCode.PARAMETER_MISS;
                            isSuccess = false;
                            break;
                        }
                    }
                }
            }
        }
        ValiResult valiResult= new ValiResult(isSuccess,sb.toString(),responseCode);
        return valiResult;
    }



    protected  String getGradeName(int grade){
        String result = "";
        switch (grade){
            case 11:
                result="一年级";
                break;

            case 12:
                result="二年级";
                break;
            case 13:
                result="三年级";
                break;

            case 14:
                result="四年级";
                break;
            case 15:
                result="五年级";
                break;

            case 16:
                result="六年级";
                break;
            case 21:
                result="七年级";
                break;

            case 22:
                result="八年级";
                break;
            case 23:
                result="九年级";
                break;
            case 24:
                result="中考";
                break;
            case 31:
                result="高一";
                break;
            case 32:
                result="高二";
                break;
            case 33:
                result="高考";
                break;
            default:
                break;
        }
        return  result ;
    }
    protected  String getSubjectName(int subjectCode){
    	String result = "";
    	switch (subjectCode){
    	case 1:
    		result="语文";
    		break;
    		
    	case 2:
    		result="数学";
    		break;
    	case 3:
    		result="英语";
    		break;
    		
    	case 4:
    		result="物理";
    		break;
    	case 5:
    		result="化学";
    		break;
    		
    	case 6:
    		result="生物";
    		break;
    	case 7:
    		result="历史";
    		break;
    		
    	case 8:
    		result="地理";
    		break;
    	case 9:
    		result="政治";
    		break;
    	}
    	return  result ;
    }

}
