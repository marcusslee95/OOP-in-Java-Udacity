public class Person {
    static int instanceCount;
    int localCount;
    Person(){
        instanceCount++;
        localCount++;
    }
}
