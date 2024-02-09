package com.yupi.yunoj.judge.codesandbox;

import com.yupi.yunoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.yunoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */

public interface CodeSandBox {
    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);

}
