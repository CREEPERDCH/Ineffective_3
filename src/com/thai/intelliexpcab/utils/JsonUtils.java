package com.thai.intelliexpcab.utils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * json工具类
 */
public class JsonUtils {

    private static Gson gson = null;

    static {
        if (gson == null) {
            gson = new Gson();
        }
    }

    private JsonUtils() {
    }

    /**
     * 将object对象转换为Json字符串
     *
     * @param object
     * @return
     */
    public static String createGsonString(Object object) {
        String gsonString = null;
        if (gson != null) {
            gsonString = gson.toJson(object);
        }
        return gsonString;
    }

    /**
     * 将Json字符串转换为泛型bean
     *
     * @param gsonString
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T changeGson2Bean(String gsonString, Class<T> clazz) {
        T t = null;
        if (gson != null) {
            t = gson.fromJson(gsonString, clazz);
        }
        return t;
    }

    /**
     * 转为list
     * 泛型在编译期类型被擦除导致报错
     *
     * @param gsonString
     * @param <T>
     * @return
     */
//    public static <T> List<T> changeGson2List(String gsonString) {
//        List<T> list = null;
//        if (gson != null) {
//            list = gson.fromJson(gsonString, new TypeToken<List<T>>() {
//            }.getType());
//        }
//        return list;
//    }

    /**
     * 转为list
     * 解决泛型问题
     *
     * @param gsonString
     * @param <T>
     * @return
     */
    public static <T> List<T> changeGsontoList(String gsonString, Class<T> clazz) {
        List<T> list = new ArrayList<>();
        if (gson != null) {
            JsonArray array = new JsonParser().parse(gsonString).getAsJsonArray();
            for (final JsonElement elem : array) {
                list.add(gson.fromJson(elem, clazz));
            }
        }
        return list;
    }

    /**
     * 转为list→map
     *
     * @param gsonString
     * @param <T>
     * @return
     */
    public static <T> List<Map<String, T>> changeGson2ListMaps(String gsonString) {
        List<Map<String, T>> list = null;
        if (gson != null) {
            list = gson.fromJson(gsonString, new TypeToken<List<Map<String, T>>>() {
            }.getType());
        }
        return list;
    }

    /**
     * 转为map
     *
     * @param gsonString
     * @param <T>
     * @return
     */
    public static <T> Map<String, T> changeGsonToMaps(String gsonString) {
        Map<String, T> map = null;
        if (gson != null) {
            map = gson.fromJson(gsonString, new TypeToken<Map<String, T>>() {
            }.getType());
        }
        return map;
    }
}
