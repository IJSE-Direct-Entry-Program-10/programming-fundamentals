public  class TypeSystem9 {

    public static  void main(String[] args) {
        float f1 = 12;
        float f2 = 12.25f;
        double d1 = 12.25D;

        float f4 = 12.24561234561f;
        double d2 = f4;
        System.out.println(f4);
        System.out.println(d2);

        //strictfp {
            double result = 0.3-0.2;
            System.out.println(result);
        //}

    }
}
