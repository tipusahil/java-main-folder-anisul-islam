public class JavaFormatSpecifiers {

    public static void main(String[] args) {

        int id = 101;
        String title = "iphone 15";
        float price = 80.00f;
        String description = " perfect product with best image quality";
        String category = "phone";

        // System.out.println(id + "\n" + title + "\n" + price + "\n" + description +
        // "\n" + category);
        String output1 = "ID:" + id + "\nTitle:" + title + "\nPrice: " + price + "\nDescription:" + description
                + "\nCategory: " + category;

        System.out.println(output1);

        String  name = "tipu";
        int age = 23;
        float CGPA = 4.2f;


        String format_specifier = String.format("Name: %s \n age: %d \n CGPA: %.3f " , name,age,CGPA);//ekane evate format specifier er maddome evabe tamplete er moto kore lika hoise jeta js e batcktick diye lika hoto.



        String format_specifier2 = String.format("%s  , %.6f  , %d " , name,CGPA,age);///ekane cgpa er ketre dosomik er pore 6ta ghor/sonkadekabe, karon ami format specifier er ketre f er age dosoomik er pore 6diyeci tai

/* 
 * dosomik er pore (%.2f = dosomik er pore 2ta sonka dekabe evabe parcenttage er pore dosomik er pore f er age jei sonka dewa hobe dosomik er pore tik tototai sonka float number e dekabe.)
 */

        System.out.println(format_specifier);
        System.out.printf(format_specifier2);
    }
}
