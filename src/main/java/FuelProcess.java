import java.util.Date;

public class FuelProcess {

    private int id;
    private Date dateOfFuelling;
    private double Liter;
    private double totalPrice;
    private double totalKM;


    private FuelProcess(){}

    static FuelProcess from(int id, Date dateOfFuelling, double Liter, double totalPrice, double totalKM)
    {
        FuelProcess process = new FuelProcess();
        process.id = id;
        process.dateOfFuelling = dateOfFuelling;
        process.Liter = Liter;
        process.totalPrice = totalPrice;
        process.totalKM = totalKM;

        return  process;

    }

    public int getId() {
        return id;
    }

    public Date getDateOfFuelling() {
        return dateOfFuelling;
    }

    public double getLiter() {
        return Liter;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getTotalKM() {
        return totalKM;
    }
}
