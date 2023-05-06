package com.learn;

import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.HashedMap;

/**
 * @author ：Kristen
 * @date ：2023/5/6
 * @description : MapIterator 示例代码
 *
 * JDK Map 接口很难作为迭代在 EntrySet 或 KeySet 对象上迭代。MapIterator 提供了对 Map 的简单迭代
 *
 */
public class TestMapIterator {
    public static void main(String[] args) {
        IterableMap<String, String> map = new HashedMap<>();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("4", "Four");
        map.put("5", "Five");

        MapIterator<String, String> iterator = map.mapIterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Object value = iterator.getValue();
            System.out.println("key: " + key);
            System.out.println("Value: " + value);
            iterator.setValue(value + "_");
            System.out.println("---------------");
        }
        System.out.println("map: "+map);
    }
}
