package com.ys.util;

import com.ys.entity.AckBlotter;
import com.ys.entity.AdvanceIncome;
import org.apache.commons.collections.map.HashedMap;
import org.apache.poi.util.SystemOutLogger;

import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    /*public static void main(String[] args) {
        try {
            int total = 1000000;
            int income = 100;
            AckBlotter ack = new AckBlotter();
            ack.setfId(UUID.randomUUID().toString());
            ack.setOrderDate("20190111");
            ack.setAckDate("20190114");
            ack.setAckAmt(100000);
            ack.setInvestor("wl");
            AckBlotter ack1 = new AckBlotter();
            ack1.setfId(UUID.randomUUID().toString());
            ack1.setOrderDate("20190112");
            ack1.setAckDate("20190114");
            ack1.setAckAmt(100000);
            ack1.setInvestor("wl");
            AckBlotter ack4 = new AckBlotter();
            ack4.setfId(UUID.randomUUID().toString());
            ack4.setOrderDate("20190113");
            ack4.setAckDate("20190114");
            ack4.setAckAmt(100000);
            ack4.setInvestor("wl");
            AckBlotter ack5 = new AckBlotter();
            ack5.setfId(UUID.randomUUID().toString());
            ack5.setOrderDate("20190114");
            ack5.setAckDate("20190114");
            ack5.setAckAmt(100000);
            ack5.setInvestor("wl");
            AckBlotter ack2 = new AckBlotter();
            ack2.setfId(UUID.randomUUID().toString());
            ack2.setOrderDate("20190111");
            ack2.setAckDate("20190114");
            ack2.setAckAmt(100000);
            ack2.setInvestor("pp");
            AckBlotter ack3 = new AckBlotter();
            ack3.setfId(UUID.randomUUID().toString());
            ack3.setOrderDate("20190112");
            ack3.setAckDate("20190114");
            ack3.setAckAmt(100000);
            ack3.setInvestor("pp");
            AckBlotter ack6 = new AckBlotter();
            ack6.setfId(UUID.randomUUID().toString());
            ack6.setOrderDate("20190113");
            ack6.setAckDate("20190114");
            ack6.setAckAmt(100000);
            ack6.setInvestor("pp");
            AckBlotter ack7 = new AckBlotter();
            ack7.setfId(UUID.randomUUID().toString());
            ack7.setOrderDate("20190114");
            ack7.setAckDate("20190114");
            ack7.setAckAmt(100000);
            ack7.setInvestor("pp");
            List<AckBlotter> ackDatas = new ArrayList<>();
            ackDatas.add(ack);
            ackDatas.add(ack1);
            ackDatas.add(ack2);
            ackDatas.add(ack3);
            ackDatas.add(ack4);
            ackDatas.add(ack5);
            ackDatas.add(ack6);
            ackDatas.add(ack7);
            Map<String, Map<String, Map<String,Integer>>> map = new HashMap<>();
            for (AckBlotter ackData : ackDatas) {
                List<String> days = getDays(ackData.getOrderDate(), ackData.getAckDate());
                Map<String, Map<String,Integer>> perMap = new HashMap<>();
                    if (map.isEmpty() || map.get(ackData.getInvestor()) == null) {
                        for (String day : days) {
                            Map<String,Integer> lastMap = new HashedMap();
                            if (day.equals(ackData.getOrderDate())) {
                                lastMap.put("amt",ackData.getAckAmt());
                                lastMap.put("income",10);
                                perMap.put(day,lastMap);
                            } else {
                                    lastMap.put("amt",0);
                                    lastMap.put("income",10);

                                perMap.put(day,lastMap);
                            }
                        }
                        map.put(ackData.getInvestor(), perMap);
                    } else {
                        Map<String, Map<String, Integer>> stringMapMap = map.get(ackData.getInvestor());
                        for (String day : days) {
                            Map<String,Integer> lastMap = new HashedMap();
                            if (day.equals(ackData.getOrderDate())) {
                                if (null == stringMapMap.get(day)) {
                                    lastMap.put("amt",ackData.getAckAmt());
                                    lastMap.put("income",10);

                                } else {
                                    Map<String, Integer> stringMap = stringMapMap.get(day);
                                    lastMap.put("amt",stringMap.get("amt") + ackData.getAckAmt());
                                    lastMap.put("income",stringMap.get("income") + 10);
                                }
                                stringMapMap.put(day,lastMap);
                            } else {
                                if (null == stringMapMap.get(day)) {
                                    lastMap.put("amt",0);
                                    lastMap.put("income",10);

                                } else {
                                    Map<String, Integer> stringMap = stringMapMap.get(day);
                                    lastMap.put("amt",0);
                                    lastMap.put("income",stringMap.get("income") + 10);
                                }
                                stringMapMap.put(day,lastMap);
                            }
                        }
                        map.put(ackData.getInvestor(), stringMapMap);
                    }
            }
            System.out.println(map.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }*/
   /* public static void main(String[] args) {
        try {
//            int total = 1000000;
//            int income = 100;
            String appDate = "20190114";
            AckBlotter ack = new AckBlotter();
            ack.setfId(UUID.randomUUID().toString());
            ack.setOrderDate("20190111");
            ack.setAckDate("20190114");
            ack.setAckAmt(100000);
            ack.setInvestor("wl");
            AckBlotter ack1 = new AckBlotter();
            ack1.setfId(UUID.randomUUID().toString());
            ack1.setOrderDate("20190112");
            ack1.setAckDate("20190114");
            ack1.setAckAmt(100000);
            ack1.setInvestor("wl");
            AckBlotter ack4 = new AckBlotter();
            ack4.setfId(UUID.randomUUID().toString());
            ack4.setOrderDate("20190113");
            ack4.setAckDate("20190114");
            ack4.setAckAmt(100000);
            ack4.setInvestor("wl");
            AckBlotter ack5 = new AckBlotter();
            ack5.setfId(UUID.randomUUID().toString());
            ack5.setOrderDate("20190114");
            ack5.setAckDate("20190114");
            ack5.setAckAmt(100000);
            ack5.setInvestor("wl");
            AckBlotter ack2 = new AckBlotter();
            ack2.setfId(UUID.randomUUID().toString());
            ack2.setOrderDate("20190111");
            ack2.setAckDate("20190114");
            ack2.setAckAmt(100000);
            ack2.setInvestor("pp");
            AckBlotter ack3 = new AckBlotter();
            ack3.setfId(UUID.randomUUID().toString());
            ack3.setOrderDate("20190112");
            ack3.setAckDate("20190114");
            ack3.setAckAmt(100000);
            ack3.setInvestor("pp");
            AckBlotter ack6 = new AckBlotter();
            ack6.setfId(UUID.randomUUID().toString());
            ack6.setOrderDate("20190113");
            ack6.setAckDate("20190114");
            ack6.setAckAmt(100000);
            ack6.setInvestor("pp");
            AckBlotter ack7 = new AckBlotter();
            ack7.setfId(UUID.randomUUID().toString());
            ack7.setOrderDate("20190114");
            ack7.setAckDate("20190114");
            ack7.setAckAmt(100000);
            ack7.setInvestor("pp");
            List<AckBlotter> ackDatas = new ArrayList<>();
            ackDatas.add(ack);
            ackDatas.add(ack1);
            ackDatas.add(ack2);
            ackDatas.add(ack3);
            ackDatas.add(ack4);
            ackDatas.add(ack5);
            ackDatas.add(ack6);
            ackDatas.add(ack7);
            Map<String, Map<String,Integer>> map = new HashMap<>();
            for (AckBlotter ackData : ackDatas) {

                List<String> days = getDays(ackData.getOrderDate(), ackData.getAckDate());
                if (map.get(ackData.getInvestor()) == null) {
                    int amt = 0;
                    int income = 0;
                    Map<String, Integer> lasMap = new HashedMap();
                    amt += ackData.getAckAmt();
                    for (String day : days) {
                        income += 10;
                        lasMap.put("income",income);
                        if (ackData.getOrderDate().equals(appDate)) {
                            System.out.println("根据产品代码+业务代码【143】+投资人【" + ackData.getInvestor() + "】+收益日期【" + day + "】来计减确认数据");
                        }
                    }
                    lasMap.put("amt", amt);
                    map.put(ackData.getInvestor(), lasMap);
                } else {
                    Map<String, Integer> stringIntegerMap = map.get(ackData.getInvestor());
                    stringIntegerMap.put("amt", stringIntegerMap.get("amt") + ackData.getAckAmt());
                    for (String day : days) {
                        stringIntegerMap.put("income",stringIntegerMap.get("income")+10);
                        if (ackData.getOrderDate().equals(appDate)) {
                            System.out.println("根据产品代码+业务代码【143】+投资人【" + ackData.getInvestor() + "】+收益日期【" + day + "】来计减确认数据");
                        }
                    }
                    map.put(ackData.getInvestor(), stringIntegerMap);
                }
            }
            System.out.println(map.toString());
            int total = 0;
            int totalincome = 0;
            if (null != map) {
                for (String s : map.keySet()) {
                    Map<String, Integer> stringIntegerMap = map.get(s);
                    totalincome = totalincome + stringIntegerMap.get("income");
                    total = total + stringIntegerMap.get("amt");
                }
                System.out.println("垫资户总收益为【" + totalincome + "】，垫资户过户总份额为【" + total + "】");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }*/
    /*public static void main(String[] args) {
        try {
//            int total = 1000000;
//            int income = 100;
            String appDate = "20190114";
            AckBlotter ack = new AckBlotter();
            ack.setfId(UUID.randomUUID().toString());
            ack.setOrderDate("20190111");
            ack.setAckDate("20190114");
            ack.setAckAmt(100000);
            ack.setInvestor("wl");
            ack.setSeatno("DX");
            AckBlotter ack1 = new AckBlotter();
            ack1.setfId(UUID.randomUUID().toString());
            ack1.setOrderDate("20190112");
            ack1.setAckDate("20190114");
            ack1.setAckAmt(100000);
            ack1.setInvestor("wl");
            ack1.setSeatno("DX");
            AckBlotter ack4 = new AckBlotter();
            ack4.setfId(UUID.randomUUID().toString());
            ack4.setOrderDate("20190113");
            ack4.setAckDate("20190114");
            ack4.setAckAmt(100000);
            ack4.setInvestor("wl");
            ack4.setSeatno("DX");
            AckBlotter ack5 = new AckBlotter();
            ack5.setfId(UUID.randomUUID().toString());
            ack5.setOrderDate("20190114");
            ack5.setAckDate("20190114");
            ack5.setAckAmt(100000);
            ack5.setInvestor("wl");
            ack5.setSeatno("DX");
            AckBlotter ack2 = new AckBlotter();
            ack2.setfId(UUID.randomUUID().toString());
            ack2.setOrderDate("20190111");
            ack2.setAckDate("20190114");
            ack2.setAckAmt(100000);
            ack2.setInvestor("pp");
            ack2.setSeatno("DX");
            AckBlotter ack3 = new AckBlotter();
            ack3.setfId(UUID.randomUUID().toString());
            ack3.setOrderDate("20190112");
            ack3.setAckDate("20190114");
            ack3.setAckAmt(100000);
            ack3.setInvestor("pp");
            ack3.setSeatno("DX");
            AckBlotter ack6 = new AckBlotter();
            ack6.setfId(UUID.randomUUID().toString());
            ack6.setOrderDate("20190113");
            ack6.setAckDate("20190114");
            ack6.setAckAmt(100000);
            ack6.setInvestor("pp");
            ack6.setSeatno("DX");
            AckBlotter ack7 = new AckBlotter();
            ack7.setfId(UUID.randomUUID().toString());
            ack7.setOrderDate("20190114");
            ack7.setAckDate("20190114");
            ack7.setAckAmt(100000);
            ack7.setInvestor("pp");
            ack7.setSeatno("DX");

            AckBlotter ak = new AckBlotter();
            ak.setfId(UUID.randomUUID().toString());
            ak.setOrderDate("20190111");
            ak.setAckDate("20190114");
            ak.setAckAmt(100000);
            ak.setInvestor("wl");
            ak.setSeatno("ZX");
            AckBlotter ak1 = new AckBlotter();
            ak1.setfId(UUID.randomUUID().toString());
            ak1.setOrderDate("20190112");
            ak1.setAckDate("20190114");
            ak1.setAckAmt(100000);
            ak1.setInvestor("wl");
            ak1.setSeatno("ZX");
            AckBlotter ak4 = new AckBlotter();
            ak4.setfId(UUID.randomUUID().toString());
            ak4.setOrderDate("20190113");
            ak4.setAckDate("20190114");
            ak4.setAckAmt(100000);
            ak4.setInvestor("wl");
            ak4.setSeatno("ZX");
            AckBlotter ak5 = new AckBlotter();
            ak5.setfId(UUID.randomUUID().toString());
            ak5.setOrderDate("20190114");
            ak5.setAckDate("20190114");
            ak5.setAckAmt(100000);
            ak5.setInvestor("wl");
            ak5.setSeatno("ZX");
            AckBlotter ak2 = new AckBlotter();
            ak2.setfId(UUID.randomUUID().toString());
            ak2.setOrderDate("20190111");
            ak2.setAckDate("20190114");
            ak2.setAckAmt(100000);
            ak2.setInvestor("pp");
            ak2.setSeatno("ZX");
            AckBlotter ak3 = new AckBlotter();
            ak3.setfId(UUID.randomUUID().toString());
            ak3.setOrderDate("20190112");
            ak3.setAckDate("20190114");
            ak3.setAckAmt(100000);
            ak3.setInvestor("pp");
            ak3.setSeatno("ZX");
            AckBlotter ak6 = new AckBlotter();
            ak6.setfId(UUID.randomUUID().toString());
            ak6.setOrderDate("20190113");
            ak6.setAckDate("20190114");
            ak6.setAckAmt(100000);
            ak6.setInvestor("pp");
            ak6.setSeatno("ZX");
            AckBlotter ak7 = new AckBlotter();
            ak7.setfId(UUID.randomUUID().toString());
            ak7.setOrderDate("20190114");
            ak7.setAckDate("20190114");
            ak7.setAckAmt(100000);
            ak7.setInvestor("pp");
            ak7.setSeatno("ZX");

            List<AckBlotter> ackDatas = new ArrayList<>();
            ackDatas.add(ack);
            ackDatas.add(ack1);
            ackDatas.add(ack2);
            ackDatas.add(ack3);
            ackDatas.add(ack4);
            ackDatas.add(ack5);
            ackDatas.add(ack6);
            ackDatas.add(ack7);
            ackDatas.add(ak);
            ackDatas.add(ak1);
            ackDatas.add(ak2);
            ackDatas.add(ak3);
            ackDatas.add(ak4);
            ackDatas.add(ak5);
            ackDatas.add(ak6);
            ackDatas.add(ak7);
            Map<String, List<AckBlotter>> seaMap = new HashedMap();
            for (AckBlotter ackData : ackDatas) {
                if (seaMap.get(ackData.getSeatno()) ==null ) {
                    List<AckBlotter> list = new ArrayList<>();
                    list.add(ackData);
                    seaMap.put(ackData.getSeatno(), list);
                } else {
                    seaMap.get(ackData.getSeatno()).add(ackData);
                }
            }
            System.out.println("按销售机构分类：" + seaMap.toString());

            if (null != seaMap && !seaMap.keySet().isEmpty()) {
                for (String s : seaMap.keySet()) {
                    List<AckBlotter> list = seaMap.get(s);
                    Map<String, Map<String,Integer>> map = new HashMap<>();

                    for (AckBlotter ackData : list) {

                        List<String> days = getDays(ackData.getOrderDate(), ackData.getAckDate());
                        if (map.get(ackData.getInvestor()) == null) {
                            int amt = 0;
                            int income = 0;
                            Map<String, Integer> lasMap = new HashedMap();
                            amt += ackData.getAckAmt();
                            for (String day : days) {
                                income += 10;
                                lasMap.put("income",income);
                                if (ackData.getOrderDate().equals(appDate)) {
                                    System.out.println("根据产品代码+业务代码【143】+投资人【" + ackData.getInvestor() + "】+收益日期【" + day + "】+ 销售机构 + 【" + ackData.getSeatno() + "】 来计减确认数据");
                                }
                            }
                            lasMap.put("amt", amt);
                            map.put(ackData.getInvestor(), lasMap);
                        } else {
                            Map<String, Integer> stringIntegerMap = map.get(ackData.getInvestor());
                            stringIntegerMap.put("amt", stringIntegerMap.get("amt") + ackData.getAckAmt());
                            for (String day : days) {
                                stringIntegerMap.put("income",stringIntegerMap.get("income")+10);
                                if (ackData.getOrderDate().equals(appDate)) {
                                    System.out.println("根据产品代码+业务代码【143】+投资人【" + ackData.getInvestor() + "】+收益日期【" + day + "】+ 销售机构 + 【" + ackData.getSeatno() + "】 来计减确认数据");
                                }
                            }
                            map.put(ackData.getInvestor(), stringIntegerMap);
                        }
                    }
                    System.out.println(map.toString());
                    int total = 0;
                    int totalincome = 0;
                    if (null != map) {
                        for (String str : map.keySet()) {
                            Map<String, Integer> stringIntegerMap = map.get(str);
                            totalincome = totalincome + stringIntegerMap.get("income");
                            total = total + stringIntegerMap.get("amt");
                        }
                        System.out.println("垫资户总收益为【" + totalincome + "】，垫资户过户总份额为【" + total + "】");
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }*/
    /*public static void main(String[] args) {
        try {
//            int total = 1000000;
//            int income = 100;
            String appDate = "20190114";
            AckBlotter ack = new AckBlotter();
            ack.setfId(UUID.randomUUID().toString());
            ack.setOrderDate("20190111");
            ack.setAckDate("20190114");
            ack.setAckAmt(100000);
            ack.setInvestor("wl");
            ack.setFundAccount("001");
            ack.setAdvFundAccount("002");
            ack.setSeatno("DX");
            ack.setAdvInvestor("advance_dx_investor");
            AckBlotter ack1 = new AckBlotter();
            ack1.setfId(UUID.randomUUID().toString());
            ack1.setOrderDate("20190112");
            ack1.setAckDate("20190114");
            ack1.setAckAmt(100000);
            ack1.setInvestor("wl");
            ack1.setFundAccount("001");
            ack1.setAdvFundAccount("002");
            ack1.setSeatno("DX");
            ack1.setAdvInvestor("advance_dx_investor");
            AckBlotter ack4 = new AckBlotter();
            ack4.setfId(UUID.randomUUID().toString());
            ack4.setOrderDate("20190113");
            ack4.setAckDate("20190114");
            ack4.setAckAmt(100000);
            ack4.setInvestor("wl");
            ack4.setFundAccount("001");
            ack4.setAdvFundAccount("002");
            ack4.setSeatno("DX");
            ack4.setAdvInvestor("advance_dx_investor");
            AckBlotter ack5 = new AckBlotter();
            ack5.setfId(UUID.randomUUID().toString());
            ack5.setOrderDate("20190114");
            ack5.setAckDate("20190114");
            ack5.setAckAmt(100000);
            ack5.setInvestor("wl");
            ack4.setFundAccount("001");
            ack4.setAdvFundAccount("002");
            ack5.setSeatno("DX");
            ack5.setAdvInvestor("advance_dx_investor");
            AckBlotter ack2 = new AckBlotter();
            ack2.setfId(UUID.randomUUID().toString());
            ack2.setOrderDate("20190111");
            ack2.setAckDate("20190114");
            ack2.setAckAmt(100000);
            ack2.setInvestor("pp");
            ack2.setFundAccount("002");
            ack2.setAdvFundAccount("003");
            ack2.setSeatno("DX");
            ack2.setAdvInvestor("advance_dx_investor");
            AckBlotter ack3 = new AckBlotter();
            ack3.setfId(UUID.randomUUID().toString());
            ack3.setOrderDate("20190112");
            ack3.setAckDate("20190114");
            ack3.setAckAmt(100000);
            ack3.setInvestor("pp");
            ack3.setSeatno("DX");
            ack3.setAdvInvestor("advance_dx_investor");
            AckBlotter ack6 = new AckBlotter();
            ack6.setfId(UUID.randomUUID().toString());
            ack6.setOrderDate("20190113");
            ack6.setAckDate("20190114");
            ack6.setAckAmt(100000);
            ack6.setInvestor("pp");
            ack6.setSeatno("DX");
            ack6.setAdvInvestor("advance_dx_investor");
            AckBlotter ack7 = new AckBlotter();
            ack7.setfId(UUID.randomUUID().toString());
            ack7.setOrderDate("20190114");
            ack7.setAckDate("20190114");
            ack7.setAckAmt(100000);
            ack7.setInvestor("pp");
            ack7.setSeatno("DX");
            ack7.setAdvInvestor("advance_dx_investor");

            AckBlotter ak = new AckBlotter();
            ak.setfId(UUID.randomUUID().toString());
            ak.setOrderDate("20190111");
            ak.setAckDate("20190114");
            ak.setAckAmt(100000);
            ak.setInvestor("MM");
            ak.setSeatno("ZX");
            ak.setAdvInvestor("advance_zx_investor");
            AckBlotter ak1 = new AckBlotter();
            ak1.setfId(UUID.randomUUID().toString());
            ak1.setOrderDate("20190112");
            ak1.setAckDate("20190114");
            ak1.setAckAmt(100000);
            ak1.setInvestor("MM");
            ak1.setSeatno("ZX");
            ak1.setAdvInvestor("advance_zx_investor");
            AckBlotter ak4 = new AckBlotter();
            ak4.setfId(UUID.randomUUID().toString());
            ak4.setOrderDate("20190113");
            ak4.setAckDate("20190114");
            ak4.setAckAmt(100000);
            ak4.setInvestor("MM");
            ak4.setSeatno("ZX");
            ak4.setAdvInvestor("advance_zx_investor");
            AckBlotter ak5 = new AckBlotter();
            ak5.setfId(UUID.randomUUID().toString());
            ak5.setOrderDate("20190114");
            ak5.setAckDate("20190114");
            ak5.setAckAmt(100000);
            ak5.setInvestor("MM");
            ak5.setSeatno("ZX");
            ak5.setAdvInvestor("advance_zx_investor");
            AckBlotter ak2 = new AckBlotter();
            ak2.setfId(UUID.randomUUID().toString());
            ak2.setOrderDate("20190111");
            ak2.setAckDate("20190114");
            ak2.setAckAmt(100000);
            ak2.setInvestor("KK");
            ak2.setSeatno("ZX");
            ak2.setAdvInvestor("advance_zx_investor");
            AckBlotter ak3 = new AckBlotter();
            ak3.setfId(UUID.randomUUID().toString());
            ak3.setOrderDate("20190112");
            ak3.setAckDate("20190114");
            ak3.setAckAmt(100000);
            ak3.setInvestor("KK");
            ak3.setSeatno("ZX");
            ak3.setAdvInvestor("advance_zx_investor");
            AckBlotter ak6 = new AckBlotter();
            ak6.setfId(UUID.randomUUID().toString());
            ak6.setOrderDate("20190113");
            ak6.setAckDate("20190114");
            ak6.setAckAmt(100000);
            ak6.setInvestor("KK");
            ak6.setSeatno("ZX");
            ak6.setAdvInvestor("advance_zx_investor");
            AckBlotter ak7 = new AckBlotter();
            ak7.setfId(UUID.randomUUID().toString());
            ak7.setOrderDate("20190114");
            ak7.setAckDate("20190114");
            ak7.setAckAmt(100000);
            ak7.setInvestor("KK");
            ak7.setSeatno("ZX");
            ak7.setAdvInvestor("advance_zx_investor");
            List<AckBlotter> ackDatas = new ArrayList<>();
            ackDatas.add(ack);
            ackDatas.add(ack1);
            ackDatas.add(ack2);
            ackDatas.add(ack3);
            ackDatas.add(ack4);
            ackDatas.add(ack5);
            ackDatas.add(ack6);
            ackDatas.add(ack7);
            ackDatas.add(ak);
            ackDatas.add(ak1);
            ackDatas.add(ak2);
            ackDatas.add(ak3);
            ackDatas.add(ak4);
            ackDatas.add(ak5);
            ackDatas.add(ak6);
            ackDatas.add(ak7);
            Map<String, Map<String,Object>> map = new HashMap<>();
            Map<String, Map<String,Object>> advmap = new HashMap<>();

            for (AckBlotter ackData : ackDatas) {
                List<String> days = getDays(ackData.getOrderDate(), ackData.getAckDate());
                //以投资人的维度计算每个投资人的过户份额和过户收益
                if (map.get(ackData.getInvestor()) == null) {
                    int amt = 0;
                    int income = 0;
                    Map<String, Object> lasMap = new HashedMap();
                    amt += ackData.getAckAmt();
                    for (String day : days) {
                        income += 10;
                        lasMap.put("income",income);
                        if (ackData.getOrderDate().equals(appDate)) {
                            System.out.println("根据产品代码+业务代码【143】+投资人【" + ackData.getInvestor() + "】+收益日期【" + day + "】+ 销售机构 + 【" + ackData.getSeatno() + "】 来计减确认数据");
                        }
                        //储存垫资户信息
                    }
                    lasMap.put("amt", amt);
                    map.put(ackData.getInvestor(), lasMap);
                } else {
                    Map<String, Object> stringIntegerMap = map.get(ackData.getInvestor());
                    stringIntegerMap.put("amt", Integer.parseInt(stringIntegerMap.get("amt").toString()) + ackData.getAckAmt());
                    for (String day : days) {
                        stringIntegerMap.put("income",Integer.parseInt(stringIntegerMap.get("income").toString())+10);
                        if (ackData.getOrderDate().equals(appDate)) {
                            System.out.println("根据产品代码+业务代码【143】+投资人【" + ackData.getInvestor() + "】+收益日期【" + day + "】+ 销售机构 + 【" + ackData.getSeatno() + "】 来计减确认数据");
                        }
                    }
                    map.put(ackData.getInvestor(), stringIntegerMap);
                }
                //以垫资户维度计算垫资户过户份额和过户收益
            }
            System.out.println(map.toString());
            int total = 0;
            int totalincome = 0;
            if (null != map) {
                for (String str : map.keySet()) {
                    Map<String, Object> stringIntegerMap = map.get(str);
                    totalincome = totalincome + Integer.parseInt(stringIntegerMap.get("income").toString());
                    total = total + Integer.parseInt(stringIntegerMap.get("amt").toString());
                }
                System.out.println("垫资户总收益为【" + totalincome + "】，垫资户过户总份额为【" + total + "】");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }*/

    public static void main(String[] args) {
        try {
//            int total = 1000000;
//            int income = 100;
            String appDate = "20190114";
            AckBlotter ack = new AckBlotter();
            ack.setfId(UUID.randomUUID().toString());
            ack.setOrderDate("20190111");
            ack.setAckDate("20190114");
            ack.setAckAmt(100000);
            ack.setInvestor("wl");
            ack.setFundAccount("001");
            ack.setAdvFundAccount("002");
            ack.setSeatno("DX");
            ack.setAdvInvestor("advance_dx_investor");
            AckBlotter ack1 = new AckBlotter();
            ack1.setfId(UUID.randomUUID().toString());
            ack1.setOrderDate("20190112");
            ack1.setAckDate("20190114");
            ack1.setAckAmt(100000);
            ack1.setInvestor("wl");
            ack1.setFundAccount("001");
            ack1.setAdvFundAccount("002");
            ack1.setSeatno("DX");
            ack1.setAdvInvestor("advance_dx_investor");
            AckBlotter ack4 = new AckBlotter();
            ack4.setfId(UUID.randomUUID().toString());
            ack4.setOrderDate("20190113");
            ack4.setAckDate("20190114");
            ack4.setAckAmt(100000);
            ack4.setInvestor("wl");
            ack4.setFundAccount("001");
            ack4.setAdvFundAccount("002");
            ack4.setSeatno("DX");
            ack4.setAdvInvestor("advance_dx_investor");
            AckBlotter ack5 = new AckBlotter();
            ack5.setfId(UUID.randomUUID().toString());
            ack5.setOrderDate("20190114");
            ack5.setAckDate("20190114");
            ack5.setAckAmt(100000);
            ack5.setInvestor("wl");
            ack5.setFundAccount("001");
            ack5.setAdvFundAccount("002");
            ack5.setSeatno("DX");
            ack5.setAdvInvestor("advance_dx_investor");
            AckBlotter ack2 = new AckBlotter();
            ack2.setfId(UUID.randomUUID().toString());
            ack2.setOrderDate("20190111");
            ack2.setAckDate("20190114");
            ack2.setAckAmt(100000);
            ack2.setInvestor("pp");
            ack2.setFundAccount("002");
            ack2.setAdvFundAccount("002");
            ack2.setSeatno("DX");
            ack2.setAdvInvestor("advance_dx_investor");
            AckBlotter ack3 = new AckBlotter();
            ack3.setfId(UUID.randomUUID().toString());
            ack3.setOrderDate("20190112");
            ack3.setAckDate("20190114");
            ack3.setAckAmt(100000);
            ack3.setInvestor("pp");
            ack3.setFundAccount("002");
            ack3.setAdvFundAccount("002");
            ack3.setSeatno("DX");
            ack3.setAdvInvestor("advance_dx_investor");
            AckBlotter ack6 = new AckBlotter();
            ack6.setfId(UUID.randomUUID().toString());
            ack6.setOrderDate("20190113");
            ack6.setAckDate("20190114");
            ack6.setAckAmt(100000);
            ack6.setInvestor("pp");
            ack6.setFundAccount("002");
            ack6.setAdvFundAccount("002");
            ack6.setSeatno("DX");
            ack6.setAdvInvestor("advance_dx_investor");
            AckBlotter ack7 = new AckBlotter();
            ack7.setfId(UUID.randomUUID().toString());
            ack7.setOrderDate("20190114");
            ack7.setAckDate("20190114");
            ack7.setAckAmt(100000);
            ack7.setInvestor("pp");
            ack7.setFundAccount("002");
            ack7.setAdvFundAccount("002");
            ack7.setSeatno("DX");
            ack7.setAdvInvestor("advance_dx_investor");

            AckBlotter ak = new AckBlotter();
            ak.setfId(UUID.randomUUID().toString());
            ak.setOrderDate("20190111");
            ak.setAckDate("20190114");
            ak.setAckAmt(100000);
            ak.setInvestor("MM");
            ak.setFundAccount("003");
            ak.setAdvFundAccount("003");
            ak.setSeatno("ZX");
            ak.setAdvInvestor("advance_zx_investor");
            AckBlotter ak1 = new AckBlotter();
            ak1.setfId(UUID.randomUUID().toString());
            ak1.setOrderDate("20190112");
            ak1.setAckDate("20190114");
            ak1.setAckAmt(100000);
            ak1.setInvestor("MM");
            ak1.setFundAccount("003");
            ak1.setAdvFundAccount("003");
            ak1.setSeatno("ZX");
            ak1.setAdvInvestor("advance_zx_investor");
            AckBlotter ak4 = new AckBlotter();
            ak4.setfId(UUID.randomUUID().toString());
            ak4.setOrderDate("20190113");
            ak4.setAckDate("20190114");
            ak4.setAckAmt(100000);
            ak4.setInvestor("MM");
            ak4.setFundAccount("003");
            ak4.setAdvFundAccount("003");
            ak4.setSeatno("ZX");
            ak4.setAdvInvestor("advance_zx_investor");
            AckBlotter ak5 = new AckBlotter();
            ak5.setfId(UUID.randomUUID().toString());
            ak5.setOrderDate("20190114");
            ak5.setAckDate("20190114");
            ak5.setAckAmt(100000);
            ak5.setInvestor("MM");
            ak5.setFundAccount("003");
            ak5.setAdvFundAccount("003");
            ak5.setSeatno("ZX");
            ak5.setAdvInvestor("advance_zx_investor");
            AckBlotter ak2 = new AckBlotter();
            ak2.setfId(UUID.randomUUID().toString());
            ak2.setOrderDate("20190111");
            ak2.setAckDate("20190114");
            ak2.setAckAmt(100000);
            ak2.setInvestor("KK");
            ak2.setFundAccount("003");
            ak2.setAdvFundAccount("003");
            ak2.setSeatno("ZX");
            ak2.setAdvInvestor("advance_zx_investor");
            AckBlotter ak3 = new AckBlotter();
            ak3.setfId(UUID.randomUUID().toString());
            ak3.setOrderDate("20190112");
            ak3.setAckDate("20190114");
            ak3.setAckAmt(100000);
            ak3.setInvestor("KK");
            ak3.setFundAccount("003");
            ak3.setAdvFundAccount("003");
            ak3.setSeatno("ZX");
            ak3.setAdvInvestor("advance_zx_investor");
            AckBlotter ak6 = new AckBlotter();
            ak6.setfId(UUID.randomUUID().toString());
            ak6.setOrderDate("20190113");
            ak6.setAckDate("20190114");
            ak6.setAckAmt(100000);
            ak6.setInvestor("KK");
            ak6.setFundAccount("003");
            ak6.setAdvFundAccount("003");
            ak6.setSeatno("ZX");
            ak6.setAdvInvestor("advance_zx_investor");
            AckBlotter ak7 = new AckBlotter();
            ak7.setfId(UUID.randomUUID().toString());
            ak7.setOrderDate("20190114");
            ak7.setAckDate("20190114");
            ak7.setAckAmt(100000);
            ak7.setInvestor("KK");
            ak7.setFundAccount("003");
            ak7.setAdvFundAccount("003");
            ak7.setSeatno("ZX");
            ak7.setAdvInvestor("advance_zx_investor");
            List<AckBlotter> ackDatas = new ArrayList<>();
            ackDatas.add(ack);
            ackDatas.add(ack1);
            ackDatas.add(ack2);
            ackDatas.add(ack3);
            ackDatas.add(ack4);
            ackDatas.add(ack5);
            ackDatas.add(ack6);
            ackDatas.add(ack7);
            ackDatas.add(ak);
            ackDatas.add(ak1);
            ackDatas.add(ak2);
            ackDatas.add(ak3);
            ackDatas.add(ak4);
            ackDatas.add(ak5);
            ackDatas.add(ak6);
            ackDatas.add(ak7);
            //以投资人维度统计申请数据
            Map<String, List<AckBlotter>> listMap = new HashedMap();
            //以垫资户维度统计过户总份额
            Map<String,Integer> advMap = new HashedMap();
            for (AckBlotter ackData : ackDatas) {
                String param1 = ackData.getSeatno() + "," + ackData.getFundAccount() + "," + ackData.getInvestor();
                if (listMap == null || listMap.isEmpty()) {
                    List<AckBlotter> list = new ArrayList<>();
                    list.add(ackData);
                    listMap.put(param1, list);
                } else {
                    if (listMap.containsKey(param1)) {
                        /*List<AckBlotter> list = listMap.get(param1);
                        list.add(ackData);
                        listMap.put(param1, list);*/
                        listMap.get(param1).add(ackData);
                    } else {
                        List<AckBlotter> list = new ArrayList<>();
                        list.add(ackData);
                        listMap.put(param1, list);
                    }
                }
                //以垫资户维度统计过户总份额
                String param2 = ackData.getSeatno() + "," + ackData.getAdvFundAccount() + "," + ackData.getAdvInvestor();
                if (advMap == null || advMap.isEmpty()) {
                    int transferAmt = 0;
                    transferAmt += ackData.getAckAmt();
                    advMap.put(param2, transferAmt);
                } else {
                    if (advMap.containsKey(param2)) {
                        advMap.put(param2, advMap.get(param2) + ackData.getAckAmt());
                    } else {
                        int transferAmt = 0;
                        transferAmt += ackData.getAckAmt();
                        advMap.put(param2, transferAmt);
                    }
                }
            }
            System.out.println("以投资人维度汇总申请数据" + listMap.toString());
            System.out.println("垫资户过户份额" + advMap.toString());
            //初始化垫资户过户份额信息
            List<AdvanceIncome> advList = new ArrayList<>();
            //初始化投资人过户总份额和过户收益
            Map<String, Map<String, Integer>> zmap = new HashedMap();
            for (String key : listMap.keySet()) {
                int totalamt = 0;
                int totalincome = 0;
                List<AckBlotter> ackBlotters = listMap.get(key);
                for (AckBlotter ackBlotter : ackBlotters) {
                    totalamt += ackBlotter.getAckAmt();
                    List<String> days = getDays(ackBlotter.getOrderDate(), ackBlotter.getAckDate());
                    for (String day : days) {
                        totalincome += 10;
                        AdvanceIncome advanceIncome = new AdvanceIncome();
                        advanceIncome.setfId(UUID.randomUUID().toString());
                        advanceIncome.setInvestor(ackBlotter.getInvestor());
                        advanceIncome.setFundAccount(ackBlotter.getFundAccount());
                        advanceIncome.setSeatno(ackBlotter.getSeatno());
                        advanceIncome.setTransferAmt(ackBlotter.getAckAmt());
                        advanceIncome.setTransferIncome(10);
                        advanceIncome.setSeatno(ackBlotter.getSeatno());
                        advanceIncome.setOrderDate(ackBlotter.getOrderDate());
                        advanceIncome.setAdvFundAccount(ackBlotter.getAdvFundAccount());
                        advanceIncome.setAdvInvestor(ackBlotter.getAdvInvestor());
                        advList.add(advanceIncome);
                        if (ackBlotter.getOrderDate().equals(appDate)) {
                            System.out.println("根据产品代码+业务代码【143】+投资人【" + ackBlotter.getInvestor() + "】+收益日期【" + day + "】+ 销售机构 + 【" + ackBlotter.getSeatno() + "】 来计减确认数据");
                        }
                        //储存垫资户信息
                    }
                    Map<String, Integer> amtmap = new HashedMap();
                    amtmap.put("amt", totalamt);
                    amtmap.put("income", totalincome);
                    zmap.put(key, amtmap);
                }

            }
            System.out.println("投资人过户份额和过户收益" + zmap.toString());
            System.out.println("垫资户收益信息" + advList.toString());

            //计算垫资户过户总收益
            Map<String, Integer> incomeMap = new HashedMap();
            for (AdvanceIncome advanceIncome : advList) {
                String param = advanceIncome.getSeatno() + "," + advanceIncome.getAdvFundAccount() + "," + advanceIncome.getAdvInvestor();
                if (null == incomeMap || incomeMap.isEmpty()) {
                    int income = 0;
                    income += advanceIncome.getTransferIncome();
                    incomeMap.put(param, income);
                } else {
                    if (incomeMap.containsKey(param)) {
                        incomeMap.put(param, incomeMap.get(param) + advanceIncome.getTransferIncome());
                    } else {
                        int income = 0;
                        income += advanceIncome.getTransferIncome();
                        incomeMap.put(param, income);
                    }
                }
            }
            System.out.println("垫资户过户总收益" + incomeMap.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static List<String> getDays(String date1,String date2) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        List<String> days = new ArrayList<>();
        int paramer = 24*60*60*1000;
        long long1 = format.parse(date1).getTime();
        long long2 = format.parse(date2).getTime();
        while (long2 >= long1) {
            String time = format.format(long1);
            days.add(time);
            long1 += paramer;
        }
        return days;
    }
}
