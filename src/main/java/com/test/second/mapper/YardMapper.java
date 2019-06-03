package com.test.second.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.test.second.domain.Yard;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface YardMapper extends BaseMapper<Yard> {
}
