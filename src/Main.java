public class Main {
    public static void main(String[] args) {

        BasicStructure audi=new BasicStructure();
        audi.color="blue";
        audi.model="A3";
        audi.power="344lc";

        Engine x = new Engine();
        x.cylinders="8";
        x.size="18181";
        x.weight="111";
        
        lights neon=new lights();
        neon.color="red";
        neon.size="15cm";
        neon.intensity="434";
    }
}