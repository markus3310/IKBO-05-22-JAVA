class HumanTest {
    public static void main(String[] args) {
        Head head = new Head();
        Leg leftLeg = new Leg();
        Leg rightLeg = new Leg();
        Hand leftHand = new Hand();
        Hand rightHand = new Hand();

        Human human = new Human(head, leftLeg, rightLeg, leftHand, rightHand);

        human.walk();
        human.clap();
        human.talk("Привет, мир!");
    }
}