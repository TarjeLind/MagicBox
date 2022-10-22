public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox1 = new MagicBox<>(5);
        magicBox1.add("Huinday");
        magicBox1.add("BMW");
        magicBox1.add("Opel");
        magicBox1.add("Volvo");
        magicBox1.add("KIA");
        magicBox1.add("Jeep");

        System.out.println(magicBox1.pick());

        MagicBox<Integer> magicBox2 = new MagicBox<>(5);
        magicBox2.add(30);
        magicBox2.add(23);
        magicBox2.add(71);
        magicBox2.add(11);

        System.out.println(magicBox2.pick());

    }
}