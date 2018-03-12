package test;
interface first {
    default void print(){
        System.out.println("default");
    }
        }
interface second extends first {
    void input();

}
public class Main implements second {
    @Override
    public void input() {

    }

}
