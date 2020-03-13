package com.renrenjian.plugin;

import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Created by 许成谱 on 2020/3/13 13:49.
 * qq:1550540124
 * 热爱生活每一天！
 */
public class HotfixPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        Ext hotfix = project.getExtensions().create("hotfix", Ext.class);
        project.afterEvaluate(new Action<Project>() {
            @Override
            public void execute(Project project) {
                System.out.println(hotfix.getApkName());
            }
        });
    }
}
