# Java Collections API

* Набор встроенных классов, абстрактных классов и интерфейсов для работы с контейнерами данными.

* Контейнер (коллекция) - хранилище объектов.

* Важный момент - иерархия Java Collections API не идеальна, поскольку Java всегда за совместимость версий.

* Два интерфейса, которые находятся на вершине иерархии коллекций: Iterable<T>, Map<K,V>.

Рассмотрим ветку Iterable

- Iterable<T> - интерфейс, описывающий поведение объектов, которые могут быть проитерированы.

```JAVA
Iterator<T> iterator(); - метод, который возвращает объект Итератор
```

- Iterator<E> - интерфейс, который описывает поведение объектов, которые "гуляют"" по коллекции.

```JAVA
boolean hasNext(); - проверяет, есть ли следующий элемент

E next(); - возвращает следующий элемент
```

- Collection<E> extends Iterable<E> - описывает поведение коллекции

```JAVA
int size(); - получить размер
boolean isEmpty(); - проверить на пустоту
boolean contains(Object o); - проверить наличие
boolean add(E e); - добавить элемент
boolean remove(Object o); - удалить элемент
void clear(); - очистить коллекцию
``` 

- List<E> extends Collection<E> - интерфейс, описывающий поведение списка. В чем отличие между списком и коллекцией? Список подразумевает порядок (индексацию) элементов.

```JAVA
Object[] toArray();
<T> T[] toArray(T[] a);
E get(int index); - получает элемент по индексу
```

- LinkedList<E> implements List<E> - список на основе двусвязного списка.

```JAVA
Node<E> first; - указатель на первый элемент
Node<E> last; - указатель на последний элемент

private static class Node<E> {
        E item; - содержимое узла
        Node<E> next; - указатель на следующий элемент
        Node<E> prev; - указатель на предыдущий элемент

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

public boolean add(E e) {
        linkLast(e);
        return true;
}

void linkLast(E e) {
		// берем последний элемент
        final Node<E> l = last;
        // создаем новый узел, который ссылается на последний
        final Node<E> newNode = new Node<>(l, e, null);
        // теперь новый узел - последний
        last = newNode;
        // если в списке ничего не было
        if (l == null)
            first = newNode; // новый узел становится первым
        else
            l.next = newNode; // последний узел ссылается на новый
        size++; // увеличиваем размер
        modCount++;
    }
```

- ArrayList<E> implements List<E> - список на основе массива.

```JAVA
private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8; // максимальный размер массива

private static final int DEFAULT_CAPACITY = 10; // размер массива по умолчанию

Object[] elementData; // массив, непосредственно хранящий значения

public boolean add(E e) {
		// гарантируем адекватную размерность массива для 
		// текущего количества элементов + 1
        ensureCapacityInternal(size + 1);
        elementData[size++] = e;
        return true;
    }

// если подадим 7 -> 10
// 15 -> 15
private void ensureCapacityInternal(int minCapacity) {
		// если массив пустой
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
        	// то минимальным размерном является
        	// максимум между размером по умолчанию и запрашиваемым размером
            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        }
        // обепечиваем данную емкость
        ensureExplicitCapacity(minCapacity);
    }

private void ensureExplicitCapacity(int minCapacity) {
        modCount++;

        // если запрашиваемый размер больше текущего
        if (minCapacity - elementData.length > 0)
        	// увеличиваем размер массива
            grow(minCapacity);
    }

private void grow(int minCapacity) {
        // запоминаем старый размер
        int oldCapacity = elementData.length;
        // объявляем новый размер -> старый + половина_старого (в полтора раза)
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        // если новый размер оказался меньше требуемого
        if (newCapacity - minCapacity < 0)
        	// новый размер <- требуемый
            newCapacity = minCapacity;
        // если новый размер оказался больше, чем максимально возможное значение для массива
        if (newCapacity - MAX_ARRAY_SIZE > 0)
        	// новый размер вычисляется как максимальное значение INT либо OutOfMemory
            newCapacity = hugeCapacity(minCapacity);
        // создание нового массива с новой размерностью
        elementData = Arrays.copyOf(elementData, newCapacity); // базируется на System.arraycopy(original, 0, copy, 0,
                         Math.min(original.length, newLength));
    }

    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) // overflow
            throw new OutOfMemoryError();
        return (minCapacity > MAX_ARRAY_SIZE) ?
            Integer.MAX_VALUE :
            MAX_ARRAY_SIZE;
    }
