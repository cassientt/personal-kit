package com.ntt.jsonTools;

import net.sf.json.JSONObject;

/**
 * @author nietingting
 * Created on 2022-05-05
 */
// 字符串 -> 对象：反系列化
// 对象 -> 字符串：序列化，字符串化
public class JSONStringUse {
    public static void main(String[] args) {
        String str = "{\"str\": \"string\", \"int\":1, \"bool\": true, \"objArr\":[{\"name\": \"perry\"},{\"name\":\"cassie\"}], \"obj\": {\"age\":2}}";
        System.out.println(str);

        JSONObject jsonObj = JSONObject.fromObject(str);
        System.out.println(jsonObj.getJSONObject("obj").getInt("age"));
        //列表里取对象可能获取不到需要强转；
        System.out.println(JSONObject.fromObject(jsonObj.getJSONArray("objArr").get(0)).getString("name"));

//        JSONParser jp = new JSONParser(str, null, false);
//        Object jsonObj = jp.parse();
//        System.out.println(jsonObj);
    }

}
