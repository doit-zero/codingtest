package generic;

public class WildcardSample {

    public static void main(String[] args){
        WildcardSample sample = new WildcardSample();
        sample.callWildcardMethod();
    }

    public void callWildcardMethod(){
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        wildcard.setWildcard("33");
        wildcardStringMethod(wildcard);
    }

    public void wildcardStringMethod(WildcardGeneric<?> c){
        Object value = c.wildcard;
        if(value instanceof String) System.out.println(value);
    }
}
