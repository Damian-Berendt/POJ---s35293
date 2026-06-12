public class DemoTurners2 {
    public static void main(String[] args) {
        Turner leaf = new Leaf();
        Turner page = new Page();
        Turner pancake = new Pancake();
        Turner human = new Human();
        Turner light = new Light();

        leaf.turn();
        page.turn();
        pancake.turn();
        human.turn();
        light.turn();
    }
}
