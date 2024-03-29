package com.example.demo.test;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author robert
 */
@Slf4j
public class Test {
    public static final String PIC_TYPE = "jpg,jpeg,png,gif";
    static final int low = -128;

    public static void main(String[] args) {
//        String a = "aaa";
//        String b = "bbb";
//        String c = "aaa" + "bbb";
//        String d = a + b;
//        String e = new String("aaa") + new String("bbb");
//        StringBuilder builder = new StringBuilder();
//        builder.append("aa");
//        builder.toString();

//        Integer[] arr = new Integer[] {1,2,3};
//        List<Integer> integers = Arrays.asList(arr);
//        integers.add(4);
//        List<Integer> list = new ArrayList<>(integers);
//        list.add(4);
//        System.out.println(integers);
//        System.out.println(list);

//        String c = new String("a") + new String("b");
//        String d = "ab";
//        System.out.println(c == d);
//
//        Integer[] fileIdsArray = {1,9,7,5,8,4,6,2};
//        List<Integer> fileIds = new ArrayList<>(Arrays.asList(fileIdsArray));
//        String sourceFileIds = fileIds.stream().sorted().map(String::valueOf).collect(Collectors.joining(","));
//        System.out.println(sourceFileIds);

//        String b = "\n";
//        String c = "\101";
//        // iterator会改变原集合里的元素
//        List<Long> a = new LinkedList<>();
//        a.add(5L);
//        a.add(4L);
//        a.add(9L);
//        a.add(8L);
//        a.add(6L);
//        System.out.println(a + "");
//        Iterator<Long> iter = a.iterator();
////        a.removeIf(next -> next == 4L);
//        while (iter.hasNext()) {
//            Long next = iter.next();
//            if (next == 4L) {
//                iter.remove();
//            }
//        }
//        System.out.println(a + "");


        //        String[] split = PIC_TYPE.split(",");
//        List<String> picList = Arrays.asList(split);
//        System.out.println(picList + "------" + picList.contains("gif"));
//        System.out.println(DateTime.now().getMillis());
//
//        String[] provinceNames = {"西藏自治区", "江苏省", "广西壮族自治区", "宁夏回族自治区"};
//        String[] suffixArray = {"回族","壮族","维吾尔","市","省","自治区"};
//        for (String provinceName : provinceNames) {
//            for (String suffix : suffixArray) {
//                provinceName = provinceName.replace(suffix, "");
//            }
//            System.out.println(provinceName);
//        }

//        int a = 16;
//        log.info((a >>> 1) + "");
//        Integer b = new Integer(16);
//        log.info(b.equals(a) + "");

//        int a = -1;
//        log.info((a >>> 1) + "");
//        log.info((a >> 1) + "");
//        log.info(Integer.MAX_VALUE + "");

//        int a = 129;
//        Integer b = 129;
//        Integer c = new Integer(129);
//        System.out.println(a == b); //true
//        System.out.println(a == c); //true
//        System.out.println(b == c); //false

//        String str1 = new String("1");
//        str1.intern();
//        String str2 = "1";
//        System.out.println(str1 == str2);   // false
//
//        String str3 = new String("2") + new String("2");
//        str3.intern();
//        String str4 = "22";
//        System.out.println(str3 == str4);   // true
//
//        String str5 = new String("2") + new String("2");
//        String str6 = "22";
//        str5.intern();
//        System.out.println(str5 == str6);   // false
//        System.out.println(1^3);

        ArrayList<Object> arrayList = new ArrayList<>();    // 容量默认10，1/2扩容
        arrayList.add(1);
        arrayList.get(1);
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.get(1);
        Hashtable<Object, Object> hashtable = new Hashtable<>();    // 容量默认11，加载因子0.75f
        hashtable.put(1, 1);
        Properties properties = new Properties();   // 继承Hashtable
        properties.setProperty("1","1");
        Vector<Object> vector = new Vector<>(); // 默认10，指定扩容容量按指定扩容，否则默认2倍扩容
        new Stack<>(); // 继承Vector
        HashSet<Object> set = new HashSet<>();
        set.add(1);
        Map<Object, Object> map = new HashMap<>();
        map.put(1, 1);
        ConcurrentHashMap<Object, Object> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1, 1);

        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();
    }
}
