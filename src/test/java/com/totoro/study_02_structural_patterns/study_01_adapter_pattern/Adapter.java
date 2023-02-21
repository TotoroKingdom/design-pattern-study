package com.totoro.study_02_structural_patterns.study_01_adapter_pattern;

/**
 * @author:totoro
 * @createDate:2023/2/21
 * @description:
 */
public class Adapter {

    private TypeCReplenisher typeCReplenisher;

    public Adapter(TypeCReplenisher typec) {
        this.typeCReplenisher = typec;
    }

    public Lightning change(){
        Lightning lightning = new Lightning();
        //电流减小一点
        String electron = typeCReplenisher.getElectron();
        electron = "20w";
        lightning.setElectron(electron);
        return lightning;
    }
}
