import java.text.DecimalFormat;

public class jet extends Aircraft{
    private int jetCount= 0;
    private double fuelTank= -1;
    private  double fuelUsed= 0;

    public jet(String craftType,double craftCost){
        super(craftType,"ramjet",craftCost);
    }
    public jet(String craftType,String propulsionType ,double craftCost,int Jetcount,double fuelTank, double fuelUsed){
        super(craftType,propulsionType,craftCost);
        jetCount = Jetcount;
        this.fuelTank= fuelTank;
        this.fuelUsed = fuelUsed;
    }

    public int getJetCount() {
        return jetCount;
    }

    public void setJetCount(int jetCount) {
        this.jetCount = jetCount;
    }

    public double getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(double fuelTank) {
        this.fuelTank = fuelTank;
    }

    public double getFuelUsed() {
        return fuelUsed;
    }

    public void setFuelUsed(double fuelUsed) {
        this.fuelUsed = fuelUsed;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        DecimalFormat df = new DecimalFormat("###.#");
        s.append(super.toString());
        s.append("\n");
        if (jetCount == 0){
            s.append("Jet Count is not defined ");
        }else{
            s.append(String.format("There are %d jets on the jet ",jetCount));
        }
        if (fuelTank == -1){
            s.append("The fuel size is not defined ");
        }else{
            s.append(String.format("this jet can hold %s gallons of fuel ",df.format(fuelTank)));
        }
        if (fuelUsed == 0){
            s.append("Jet fuel is not defined ");
        }else{
            s.append(String.format("There is %s%% of fuel on the jet ",df.format(fuelUsed)));
        }
        return s.toString();
    }
    public void printCraft(){
        StringBuilder s = new StringBuilder();
        DecimalFormat df = new DecimalFormat("###.#");
        super.printCraft();
        if (jetCount == 0){
            s.append("Jet Count is not defined ");
        }else{
            s.append(String.format("There are %d jets on the jet ",jetCount));
        }
        if (fuelTank == -1){
            s.append("The fuel size is not defined ");
        }else{
            s.append(String.format("this jet can hold %s gallons of fuel ",df.format(fuelTank)));
        }
        if (fuelUsed == 0){
            s.append("Jet fuel is not defined ");
        }else{
            s.append(String.format("There is %s%% of fuel on the jet ",df.format(fuelUsed)));
        }
        System.out.println(s);

    }
}
