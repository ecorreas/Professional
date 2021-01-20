public interface IVetor2<T> {
    public boolean add(T item);
    public boolean contains(T item);
    public T get(int indice);
    public int indexOf(T item);
    public boolean isEmpty();
    public boolean isFull();
    public boolean remove(T item);
    public boolean set(int indice, T novoItem);
    public int size();
    public String toString();
    public void sort();
    public void insertionSort();
    public void bubbleSort();
    public void selectionSort();
}