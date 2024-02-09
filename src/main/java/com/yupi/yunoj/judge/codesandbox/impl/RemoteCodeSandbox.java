package com.yupi.yunoj.judge.codesandbox.impl;

import com.yupi.yunoj.judge.codesandbox.CodeSandBox;
import com.yupi.yunoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.yunoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 远程代码沙箱（实际调用接口的沙箱）
 */

public class RemoteCodeSandbox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程代码沙箱");
        return null;
    }
}