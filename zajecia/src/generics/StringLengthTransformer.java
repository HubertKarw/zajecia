package generics;

public class StringLengthTransformer implements Transformer<String, Integer> {
    @Override
    public Integer transform(String source) {
        return source.length();
    }

}
