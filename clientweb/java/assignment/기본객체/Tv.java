public class Tv {
    private String color;
    private boolean power;
    private int channel;

    public Tv(){
        this.color = "black";
        this.power = false;
        this.channel = 0;
    }

    public Tv(String color, boolean power, int channel) {
        this.color = color;
        this.power = power;
        this.channel = channel;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isPower() {
        return this.power;
    }
    public boolean getPower() {
        return this.power;
    }
    public void setPower(boolean power) {
        this.power = power;
    }
    public int getChannel() {
        return this.channel;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
    public void power(){
        setPower(!power);
    }
    public void channelUp(){
        channel++;
    }
    public void channelDown(){
        channel--;
    }
    public void print() {
        System.out.println("{" +
        " color='" + getColor() + "'" +
        ", power='" + isPower() + "'" +
        ", channel='" + getChannel() + "'" +
        "}"); 
    }
    
   
    





}
