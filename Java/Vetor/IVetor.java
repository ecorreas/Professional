public interface IVetor {
    public boolean add(int item);
    public boolean contains(int item);
    public int get(int indice);
    public int indexOf(int item);
    public boolean isEmpty();
    public boolean isFull();
    public boolean remove(int item);
    public boolean set(int indice, int novoItem);
    public int size();
    public String toString();
    public int[] sort(int[] vet);
}
