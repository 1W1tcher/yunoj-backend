package com.yupi.yunoj.judge;

import com.yupi.yunoj.judge.strategy.DefaultJudgeStrategy;
import com.yupi.yunoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.yupi.yunoj.judge.strategy.JudgeContext;
import com.yupi.yunoj.judge.strategy.JudgeStrategy;
import com.yupi.yunoj.model.dto.questionsubmit.JudgeInfo;
import com.yupi.yunoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
