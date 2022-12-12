package Pr24;

public class Client{

    private Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public void sit(){
        chair.sit();
    }
}