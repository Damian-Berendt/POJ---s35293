public class DemoRunners {
    public static void main(String[] args) {

        Runner machine1 = new Machine();
        Runner athlete1 = new Athlete();
        Runner politician1 = new PoliticalCandidate();

        machine1.run();
        athlete1.run();
        politician1.run();
    }
}