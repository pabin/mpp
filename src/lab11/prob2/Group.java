package lab11.prob2;

import java.util.List;

public class Group<T> {
    private T specialElement;
    private List<T> elements;

    public Group(T specialElement, List<T> elements) {
        this.specialElement = specialElement;
        this.elements = elements;
    }

    public T getSpecialElement() {
        return this.specialElement;
    }

    public List<T> getElements() {
        return this.elements;
    }

    public static <T> Group<T> copy(Group<T> group) {
        List<T> elements = group.getElements();
        Group<T> grp = new Group<>(group.getSpecialElement(), elements);
        return grp;
    }

    @Override
    public String toString() {
        return "special: " + this.specialElement + ", elems: " + elements.toString();
    }
}
