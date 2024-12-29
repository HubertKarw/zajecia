package generics;

public class StringIntegerConverter extends TwoWayConverter<String, Integer> {
    @Override
    public Integer convertForward(String s) {
        try {
            return Integer.valueOf(s);
        } catch (NumberFormatException nfe) {
            System.out.println("this string cannot be converted");
            throw new IllegalArgumentException();
        }

    }

    @Override
    public String convertBackword(Integer integer) {
        if(integer.toString() == null){
            throw new IllegalArgumentException("integer is null");
        }
        return integer.toString();
    }
}
