public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++){
            Person p = new Person();
            System.out.println(p.localCount + " " + p.instanceCount);
            System.out.println(p.localCount + " " + Person.instanceCount);
        }
    }
}
