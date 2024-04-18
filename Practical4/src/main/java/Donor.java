public class Donor {
    private String donorName;
    private String hometown;
    private double charityScale; //the %activity time of each champion

    //empty constructor for the class
    public Donor()
    {
        donorName = "";
        hometown = "";
        charityScale = 0.0;
    }

    //non-empty constructor for the class
    public Donor( String town, String name, double active )
    {
        donorName = name;
        hometown = town;
        charityScale = active;
    }

    //setters
    public void setDonorName( String name )
    {
        donorName = name;
    }

    public void setHomeTown( String town )
    {
        hometown = town;
    }

    public void setCharityScale(double charityScale){
        this.charityScale = charityScale;
    }

    //getters
    public String getDonorName()
    {
        return donorName;
    }

    public String getHomeTown()
    {
        return hometown;
    }

    public double getCharityScale()
    {
        return charityScale;
    }

    //toString method for creating a string of the champion data
    public String toString()
    {
        return String.format("Name: %-22s  Hometown: %-18s  Charity Scale: %.2f%%", hometown, donorName, charityScale);
    }
}
