package com.example.demo2.repository.mapperService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo2.mapper.UserMapper;
import com.example.demo2.repository.dataobject.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * @author Tina
 */
@Slf4j
@Repository
public class UserMapperService extends ServiceImpl<UserMapper, UserDO> {

}
