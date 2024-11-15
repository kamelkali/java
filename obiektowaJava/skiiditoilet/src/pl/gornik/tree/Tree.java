package pl.gornik.tree;

public class Tree {
    String name;
    double height;
    double diameter;
    String treeType;

    public double getVolume(int lostDiameter, int lostHeight){
        return (height*lostHeight/100) * getBase(lostDiameter);
    }
    public void describe(){
        System.out.println(name + " ma wysokosc "+ height+" i srednice pnia + "+diameter);
    }
    public double getBase(int lostDiameter){
        return (Math.PI * Math.pow(diameter*0.9,2))/4;
    }

    public double CubicCapacity(){
        int lostDiameter;
        int lostHeight;
        if(treeType.equalsIgnoreCase("iglaste")){
            lostDiameter =5;
            lostHeight = 15;
        }
        else{
            lostDiameter = 10;
            lostHeight = 10;
        }
        return Math.PI * Math.pow((100 - lostDiameter)* diameter / 100, 2) * (100 - lostHeight) * height / 400;
    }

}