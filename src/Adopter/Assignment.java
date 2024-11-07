package Adopter;

class Assignment {

    private  Pen p;

    public void setP(Pen p){
        this.p=p;
    }

    public Adopter.Pen getP(){
        return p;
    }

    public void writeAssignment(String str) {
        p.write(str);
    }
}
