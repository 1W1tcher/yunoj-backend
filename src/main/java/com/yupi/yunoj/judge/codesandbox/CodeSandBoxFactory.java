package com.yupi.yunoj.judge.codesandbox;

import com.yupi.yunoj.judge.codesandbox.impl.ExampleCodeSandbox;
import com.yupi.yunoj.judge.codesandbox.impl.RemoteCodeSandbox;
import com.yupi.yunoj.judge.codesandbox.impl.ThirdPartyCodeSandbox;

/**
 * 代码沙箱工厂
 */

public class CodeSandBoxFactory {
    public static CodeSandBox newInstance(String type) {
        switch (type) {
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdParty":
                return new ThirdPartyCodeSandbox();
            case "default":
                return new ExampleCodeSandbox();
        }
        return null;
    }
}
