package com.learn;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

/**
 * @author ：Kristen
 * @date ：2023/5/6
 * @description : BidiMap 的示例代码
 * 
 * 新接口被添加到支持双向映射。使用双向映射，可以使用值查找键，并且可以使用键轻松查找值
 * 
 * 1、K getKey(Object value)
 * 获取当前映射到指定值的键
 * 
 * 2、BidiMap<V,K> inverseBidiMap()
 * 获取该映射的键和值的键视图
 * 
 * 3、V put(K key, V value)
 * 将键值对放入映射中，替换之前的任何一对
 * 
 * 4、K removeValue(Object value)
 * 删除当前映射到指定值的键值对（可选操作）
 * 
 * 5、Set<V> values()
 * 返回此映射中包含的值的 Set 视图
 */
public class TestBidiMap {
    public static void main(String[] args) {
        BidiMap<String, String> bidi = new TreeBidiMap<>();

        bidi.put("One", "1");
        bidi.put("Two", "2");
        bidi.put("Three", "3");

        System.out.println(bidi.get("One"));
        System.out.println(bidi.getKey("1"));
        System.out.println("Original Map: " + bidi);
        System.out.println("---------------------");

        bidi.removeValue("1");
        System.out.println("Modified Map: " + bidi);
        BidiMap<String, String> inversedMap = bidi.inverseBidiMap();
        System.out.println("Inversed Map: " + inversedMap);
    }
}
