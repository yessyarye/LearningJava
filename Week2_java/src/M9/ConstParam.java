package M9;

public class ConstParam {
    String language;

    //constructor accepting single value
    ConstParam(String lang){
        language = lang;
        System.out.println(language + " is programming language. ");
    }

    public static void main(String[] args) {
        //call const by passing a single value
        ConstParam obj1 = new ConstParam("Java");
        ConstParam obj2 = new ConstParam("Python");
        ConstParam obj3 = new ConstParam("C");
    }

}
