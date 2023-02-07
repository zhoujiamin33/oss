/**
 * 对接外部接口  HTTP请求
 */
package com.example.demo2.rpc;

import cn.hutool.core.lang.TypeReference;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @version 1.0
 * @Author AO Jm
 * Created on 2023/2/7 16:42
 */
public class UserServiceRpc {


    private static String baseUrl = "http://192.168.64.6:8860";
    private static Long appId = 1070638173727491297L;
    private static String publicKey = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAJzRcpjvt4VRujDgeXN4pAOyNfeuhfDVf70NogCfRzi3CU17O9Qq37TC7mBd4ONhDY4PgVylMH7Ye4wMrCX56IMCAwEAAQ==";
    private static String priviteKey = "c686f8b1552a416e86f9e40b28eaa0df";


    /**
     * 示例参数
     *    CenterUserDTO centerUserDTO = CenterUserDTO.builder().account("19911111111")
     *                                                          .mobile("19911111111")
     *                                                          .password(password).name("大哥").build();
     */
//    public CenterUserDTO saveUser(CenterUserDTO centerUserDTO, String token) {
//        String url = baseUrl + "/api/authority/center/user";
//        log.info(">>>> 请求URL:{}", url);
//        centerUserDTO.setPassword(RSAKeyPairUtil.encrypt(centerUserDTO.getPassword(),
//                publicKey));
//
//        String param = JSONUtil.toJsonStr(centerUserDTO);
//        log.info(">>>> 请求参数:{}", param);
//        String s = HttpRequest.post(url)
//                .contentType("application/json").header("token", token)
//                .header("Accept", "*/*").header("Content-Type", "application/json")
//                .body(param)
//                .execute().body();
//
//        System.out.println(s);
//        TypeReference<CenterResult<CenterUserDTO>> type = new TypeReference<CenterResult<CenterUserDTO>>() {
//        };
//        CenterResult<CenterUserDTO> centerResult = JSONUtil.toBean(s, type, true);
//        return centerResult.getData();
//    }
}