package com.ntt.jsonTools;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONString;
import net.sf.json.util.JSONBuilder;


public class JSONObjectUse {
//接口返回的是字符串（序列化后的），需要转化为json
    // 取脚表只可以取json
    public static void main(String[] args) {
        //创建JSONObject对象
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("username","wln");
        jsonObject.put("password",123);
        System.out.println("1：" + jsonObject);

        //增加属性
        jsonObject.element("sex","男");
        // json 里面没有json对象[大括号套大括号]，故不可以使用getJSONObject
        System.out.println("1.1：" + jsonObject.getString("username"));
        //JSONObject["username"] is not a JSONObject.
//        System.out.println("1.1：" + jsonObject.getJSONObject("username"));
        System.out.println("1.1：" + jsonObject.get("password")); // get可以获取任何类型的，如不指导会默认为字符串


//        获取属性
        System.out.println("2.1：" +  jsonObject.getClass().getName());
        System.out.println("2.2：" +  jsonObject.toString().getClass().getName());
        System.out.println("2.3：" +  jsonObject.toString());



        //判断输出对象的类型
        boolean isArray = jsonObject.isArray();
        boolean isEmpty = jsonObject.isEmpty();
        boolean isNullObject = jsonObject.isNullObject();
        System.out.println("3：" + "是否是数组：" + isArray +" 是否是空：" + isEmpty + " 是否是空对象：" + isNullObject);

        //创建JSONArray
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(0,"aa");
        jsonArray.add("BB");
        jsonArray.add(1,"AB");
        jsonArray.add("cc");

        //将JSONArray 添加到JSONObject
        jsonObject.element("student",jsonArray);
        System.out.println("4：" + jsonObject);
        System.out.println("5:"+ jsonArray);
        // 获取列表的脚标
        System.out.println("6.1:"+ jsonObject.getJSONArray("student").get(0));
    }
}
