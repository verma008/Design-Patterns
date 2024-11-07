package Adopter;

public class School {
    public static void main(String[] args) {

//        PilotPen pilotPen=new PilotPen();

        Pen p=new PenAdapter();
        Assignment a=new Assignment();
        a.setP(p);
        a.writeAssignment("I don't like to write an assignment");
    }
}
