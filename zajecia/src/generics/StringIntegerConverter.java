package generics;

public class StringIntegerConverter extends TwoWayConverter<String, Integer> {
    @Override
    public Integer convertForward(String s) {
        try {
            return Integer.valueOf(s);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("this string cannot be converted");
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
