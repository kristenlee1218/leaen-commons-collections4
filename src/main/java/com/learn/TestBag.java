package com.learn;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;

/**
 * @author ：Kristen
 * @date ：2023/5/6
 * @description : Bag 的示例代码
 *
 * 新的接口被添加到支持 Bag。Bag 接口定义了一个集合，它可以计算一个对象出现在集合中的次数
 *
 * 1、boolean add(E object)
 * （冲突）将指定的对象到 Bag 的一个副本
 *
 * 2、boolean add(E object, int nCopies)
 * 将指定对象的 nCopies 副本添加到 Bag 中
 *
 * 3、boolean containsAll(Collection<?> coll)
 * （冲突）如果包包含给定集合中的所有元素，并且尊重基数，则返回 true
 *
 * 4、int getCount(Object object)
 * 返回包中当前给定对象的出现次数（基数）
 *
 * 5、Iterator<E> iterator()
 * 在整个成员集上返回一个迭代器，包括由于基数而产生的副本
 *
 * 6、boolean remove(Object object)
 * 从 Bag 中移除所有给定的对象
 *
 * 7、boolean remove(Object object, int nCopies)
 * 从 Bag 中删除指定对象的 nCopies 副本
 *
 * 8、boolean removeAll(Collection<?> coll)
 * 删除给定集合中的所有元素，尊重基数
 *
 * 9、boolean retainAll(Collection<?> coll)
 * 移除不在给定集合中的所有 Bag 成员，尊重基数
 *
 * 10、int size()
 * 返回 Bag 中所有类型对象的总数
 *
 * 11、Set<E> uniqueSet()
 * 返回 Bag 中的一组唯一元素
 */
public class TestBag {
    public static void main(String[] args) {
        Bag<String> bag = new HashBag<>();

        //add "a" two times to the bag.
        bag.add("a", 2);

        //add "b" one time to the bag.
        bag.add("b");

        //add "c" one time to the bag.
        bag.add("c");

        //add "d" three times to the bag.
        bag.add("d", 3);

        //get the count of "d" present in bag.
        System.out.println("d is present " + bag.getCount("d") + " times.");
        System.out.println("bag: " + bag);

        //get the set of unique values from the bag
        System.out.println("Unique Set: " + bag.uniqueSet());
        System.out.println("------------------------------");

        //remove 2 occurrences of "d" from the bag
        bag.remove("d", 2);
        System.out.println("2 occurrences of d removed from bag: " + bag);
        System.out.println("d is present " + bag.getCount("d") + " times.");
        System.out.println("bag: " + bag);
        System.out.println("Unique Set: " + bag.uniqueSet());
    }
}
