public class FuellBill {
    private int id;
    private String pathToBill;

    private FuellBill(int id, String path){
        this.id = id;
        this.pathToBill = path;
    }



    public int getId() {
        return id;
    }

    public String getPathToBill() {
        return pathToBill;
    }
}
