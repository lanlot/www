package com.test.second.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.test.second.domain.Job;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JobMapper extends BaseMapper<Job> {
}
