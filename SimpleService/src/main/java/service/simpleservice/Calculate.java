package service.simpleservice;

public class Calculate {
    public static int calculateParameter(String name, String a, String b){
        int c = 0;
        int d = 0;
        int result = 0;
        try{
            c = Integer.parseInt(a);
            d = Integer.parseInt(b);
        }catch (NumberFormatException e){
            return 0;
        }

        if (name.equals("sub")){
            result = c-d;
        }else if (name.equals("mul")) {
            result = c*d;
        }else if (name.equals("add")) {
            result = c + d;
        }else if (name.equals("div")) {
            if (d != 0) {
                result = c / d;
            }else{
                result = 0;
            }
        }
        return result;
    }
}
