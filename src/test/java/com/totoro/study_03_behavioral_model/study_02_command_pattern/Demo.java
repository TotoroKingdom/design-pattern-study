package com.totoro.study_03_behavioral_model.study_02_command_pattern;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
public class Demo {
    public static void main(String[] args) {

        GuangDongCuisine guangDongCuisine = new GuangDongCuisine(new GuangDongCook());
        HuNanCuisinel huNanCuisinel = new HuNanCuisinel(new HuNanCook());

        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(guangDongCuisine);
        xiaoEr.order(huNanCuisinel);

        xiaoEr.placeOrder();

    }
}
