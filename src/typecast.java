


class typecast{
    public static void main( String[] args){
        // automatic conversion

        byte a = 34;
        int b = a;
        System.out.println(b);


        int c = 500;
        float d = c;
        System.out.println(d);


        // non automatic conversion
        int e = 2000;
        byte f = (byte)e;
        System.out.println(f);

    }
}