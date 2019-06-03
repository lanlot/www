package com.test.second.domain.Util;



/**
 * com.isoftstone.lsbase.entity.bean
 *
 * @author liyawei
 * @date 2018/8/3 16:04
 */
public interface PageBean {

    static Result getFailedPageBean() {
        return ResultTool.failed();
    }
}
