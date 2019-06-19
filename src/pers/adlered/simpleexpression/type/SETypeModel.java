package pers.adlered.simpleexpression.type;

public class SETypeModel {
    public static Object[] set(SEType SEType, SELimit SELimit, String LimitArg) {
        Object[] expression = {"::Expression::", SEType, SELimit, LimitArg};
        return expression;
    };
}
