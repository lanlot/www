package com.test.second.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.test.second.domain.Job;
import com.test.second.mapper.JobMapper;
import com.test.second.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends ServiceImpl<JobMapper, Job> implements TestService {
}
