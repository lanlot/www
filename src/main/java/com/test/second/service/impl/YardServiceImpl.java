package com.test.second.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.test.second.service.YardService;
import com.test.second.domain.Yard;
import com.test.second.mapper.YardMapper;
import org.springframework.stereotype.Service;

@Service
public class YardServiceImpl extends ServiceImpl<YardMapper, Yard> implements YardService {
}
