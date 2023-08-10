package com.xubo.flowable.handler;

import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;

/**
 * @Author xubo
 * @Date 2023/7/10 10:30
 * @Description：
 * @Version 1.0
 */
public class BossTaskHandler implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {
        delegateTask.setAssignee("老板");
    }
}
