public class KonstruktoryMetody {
    public static void main(String[] args) {
        Method T = new Method();
        T.Test("Return");                   //Metody należy wywołać ręcznie + można wprowadzać parametry z zewnątrz do wykonania
        T.Test(225);                           //Metody mogą zwracać różne obiekty z klasy pochodnej wewnątrz klasy metody ("przeciążanie metod")
                                                 //Do metody można się odwoływać wielokrotnie i kiedy się chce (można użyć wszystkich jednocześnie)

        Constructor Y = new Constructor("random");  //Konstruktory wywołują się same i wykonują operacje wewnątrz swojej klasy
                                                        //(dodatkowo mogą być puste) KONSTRUKTOR MOŻNA WYWOŁAĆ TYLKO RAZ
                                                        //Konstruktor ma za zadanie upewnić się, że obiekt po stworzeniu posiada poprawny stan
                                                        //można wywołać różne konstruktory wpisując odpowiedni parametr (jedno LUB drugie!) ("przeciążanie konstruktorów")
    }
    static class Method {
        void Test(String one) {
            System.out.println(one);
            int a = 5;
            int b = 5;
            int c = a + b;
            System.out.println(c);
        }
        void Test(int z) {
            System.out.println(z);
        }
    }
    static class Constructor {
        Constructor(double x) {
            String two = "two";
            System.out.println(two);
            int a = 5;
            int b = 5;
            int c = a + b;
            System.out.println(c);
            int z = 15;
            System.out.println(z);
        }
        Constructor(String abc) {
            System.out.println("To inna funkcja");
        }
    }
}