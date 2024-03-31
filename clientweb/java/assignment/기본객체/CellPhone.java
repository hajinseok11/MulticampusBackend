public class CellPhone {
    private String model;
    private double battery;
    public CellPhone(){}
    public CellPhone(String model, double battery) {
        this.model = model;
        this.battery = battery;
    }
    public CellPhone(String model) {
        this.model = model;
    }
    public void call(int time){
        if (time > 0){
            System.out.println("통화시간: "+time);
            battery = battery - (time*0.5);
        }else {
            System.out.println("통화시간입력오류");
            return;
        }
    }
    public void charge(int time){
        if (time < 0){
            System.out.println("충전시간입력오류");
        }
        System.out.printf("충전시간 %s\n",time);
        if (battery > 0 & battery < 101){
            battery = battery + time*3;
            if (battery==100){
                return;
            }
        }
    }
    public void printBattery(){
        System.out.println("남은배터리양:"+battery);
    }
    public boolean equals(Object otherObject){
        if (otherObject instanceof CellPhone){
            return true;
        }
        return false;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getBattery() {
        return this.battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }



    
}
