public class Main {
    
    public static void main(String[] args){

        Students s1 = new Students();
        Students s2 = new Students();

        s1.name = "Bilal Yasir";
        s1.rollNumber = 15037;

        s2.name = "Tayyab Khokhar";
        s2.rollNumber = 15030;


        s1.displayinfo();
        s2.displayinfo();

    }
}
