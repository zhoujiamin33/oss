package com.example.demo2.util;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.util.RandomUtil;
import com.example.demo2.enums.BusinessCodeEnum;


public class BusinessCodeGenerator {


    /**
     * 根据业务类型规则生成业务单号
     *
     * 单号组成规则：prefix + 6位日期(yyMMdd) + (length - prefix.length)位随机数
     * prefix 可以为空; 同一天内毫秒级时间戳的后六位是唯一的
     * 至少返回 12位 长度的编码
     *
     * @param businessCode
     * @return
     */
    public static String getGeneratorCode(BusinessCodeEnum businessCode) {
        String prefix = businessCode.getPrefix();
        Integer length = businessCode.getLength();
        DateTime dateTime = DateTime.now();
        String time = String.valueOf(dateTime.getTime());
        String yyMMdd = dateTime.toString("yyMMdd");
        StringBuilder sb = new StringBuilder(prefix);
        sb.append(yyMMdd);
        if (length <= 6 + prefix.length()) {
            return sb.toString();
        }
        sb.append(RandomUtil.randomNumbers(length - 6 - prefix.length()));
        return sb.toString();
    }


}
