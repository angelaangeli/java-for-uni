package Pr24;
public class ChairFactory extends AbstractChairFactory{
    public Chair createChair(ChairType type){
        Chair chair = null;
        Client client = null;
        switch (type){
            case Victorian:
                int age = 150;
                chair = new VictorianChair(age);
                client = new Client();
                client.setChair(chair);
                client.sit();
                break;
            case Magic:
                chair = new MagicChair();
                MagicChair mc = new MagicChair();
                client = new Client();
                client.setChair(chair);
                client.sit();
                mc.doMagic();
                break;
            case Functional:
                chair = new FunctionalChair();
                client = new Client();
                FunctionalChair fc = new FunctionalChair();
                client.setChair(chair);
                client.sit();
                System.out.println(fc.sum(2, 7));
                break;
        }

        return chair;
    }
}
