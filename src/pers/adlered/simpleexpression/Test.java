package pers.adlered.simpleexpression;

import pers.adlered.simpleexpression.executor.SE;
import pers.adlered.simpleexpression.type.SELimit;
import pers.adlered.simpleexpression.type.SEType;
import pers.adlered.simpleexpression.type.SETypeModel;

public class Test {
    public static void main(String[] args) {
        Object expression[] = {"hello", SETypeModel.set(SEType.NUMBERS, SELimit.APPOINT_LIMIT, "5"), "world", "hahaha"};
        SE.splicing(expression);
    }
}
