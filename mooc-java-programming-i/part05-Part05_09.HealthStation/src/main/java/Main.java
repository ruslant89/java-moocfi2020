
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions

        HealthStation childrensHospital = new HealthStation();

        Person john = new Person("John", 24, 177, 78);
        Person mac = new Person("Mac", 19, 190, 100);

//        System.out.println(john.getName() + " weight: " + childrensHospital.weigh(john) + " kilos");
//        System.out.println(mac.getName() + " weight: " + childrensHospital.weigh(mac) + " kilos");
//
//        childrensHospital.feed(john);
//        childrensHospital.feed(john);
//        childrensHospital.feed(john);
//
//        System.out.println("");
//
//        System.out.println(john.getName() + " weight: " + childrensHospital.weigh(john) + " kilos");
//        System.out.println(mac.getName() + " weight: " + childrensHospital.weigh(mac) + " kilos");
//
//        System.out.println("");

        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(john);
        childrensHospital.weigh(mac);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(john);
        childrensHospital.weigh(john);
        childrensHospital.weigh(john);
        childrensHospital.weigh(john);

        System.out.println("weighings performed: " + childrensHospital.weighings());
    }
}
