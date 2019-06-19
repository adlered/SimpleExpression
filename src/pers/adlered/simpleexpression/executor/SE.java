package pers.adlered.simpleexpression.executor;

public class SE {
    public static void splicing(Object[] expression) {
        for (Object object : expression) {
            if (object.getClass().getName().equals("[Ljava.lang.Object;")) {
                Object[] obj = (Object[])object;
                if (obj[0].equals("::Expression::")) {
                    System.out.println("yes it is");
                } else {
                    System.out.println("no it isn't");
                }
            } else {
                System.out.println(object);
            }
        }
    }
}
