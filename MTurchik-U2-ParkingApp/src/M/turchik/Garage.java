package M.turchik;

class Garage {
    private final CheckIn in;
    private final CheckOut out;
    private static boolean isOpen;
    private static boolean isEmpty;

    public Garage() {
        in = new CheckIn();
        out = new CheckOut();
        isOpen = true;
        isEmpty = true;
    }

    public void open(){
        while(isOpen){
            if(isEmpty) {
                in.access();
            }else{
                out.access();
            }
        }
    }

    public static void close(){
        System.out.println("Closing the parking garage for the day.");
        isOpen = false;
    }

    public static void fill(){
        isEmpty = false;
    }

    public static void empty(){
        isEmpty = true;
    }
}
