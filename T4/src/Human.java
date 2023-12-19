class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    public void walk() {
        leftLeg.move();
        rightLeg.move();
    }

    public void clap() {
        leftHand.clap();
        rightHand.clap();
    }

    public void talk(String message) {
        head.talk(message);
    }
}

class Head {
    public void talk(String message) {
        System.out.println("Говорю: " + message);
    }
}

class Leg {
    public void move() {
        System.out.println("Двигаю ногой");
    }
}

class Hand {
    public void clap() {
        System.out.println("Хлопаю в ладоши");
    }
}


