package com.learn;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Transformer;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：Kristen
 * @date ：2023/5/6
 * @description : CollectionUtils.collect 的实例代码
 *
 * CollectionUtils 的 collect() 可用于将一种类型的对象列表转换为不同类型的对象列表
 */
public class TestCollectionUtils3 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("1", "2", "3");
        List<Integer> integerList = (List<Integer>) CollectionUtils.collect(stringList,
                new Transformer<String, Integer>() {
                    @Override
                    public Integer transform(String input) {
                        return Integer.parseInt(input);
                    }
                });
        System.out.println("integerList: " + integerList);
    }
}
