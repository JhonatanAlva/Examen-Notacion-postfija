package gt.edu.umg.progra3.parcial1.pilas;

import java.util.ArrayList;
import java.util.List;

public class PilaNodo implements Pila{

    private List<String> cima = new ArrayList<>();

    @Override
    public void push(String item) {
        cima.add(item);
    }

    @Override
    public String pop() {
        return cima.remove(cima.size()-1);
    }

    @Override
    public String peek() {
        return cima.remove(cima.size()-1);
    }

    @Override
    public int size() {
        return cima.size();
    }

    @Override
    public boolean isEmpty() {
        return cima.isEmpty();
    }
}
