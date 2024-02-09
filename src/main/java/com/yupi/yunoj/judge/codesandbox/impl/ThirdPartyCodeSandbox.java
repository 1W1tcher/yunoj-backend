package com.yupi.yunoj.judge.codesandbox.impl;

import com.yupi.yunoj.judge.codesandbox.CodeSandBox;
import com.yupi.yunoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.yunoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 第三方代码沙箱
 */

public class ThirdPartyCodeSandbox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}