package generics;

public class StringIntegerConverter extends TwoWayConverter<String,Integer>{
    @Override
    public Integer convertForward(String s) {
        try{
            return Integer.valueOf(s);
        }catch(NumberFormatException nfe){
            System.out.println("this string cannot be converted");
        }
        return 0;
    }

    @Override
    public String convertBackword(Integer integer) {
        return integer.toString();
    }
}
