package com.test.second.domain.Util;



public interface ResultBean {
    static Result getSuccessResultBean() {
        return ResultTool.success();
    }

    static ResultBean getFailedResultBean() {
        return ResultTool.failed();
    }
}
