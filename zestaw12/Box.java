
//zad1,2

package zestaw12;

public class Box<T> {

    private T objekt;



    public T getObjekt() {
        return objekt;
    }

    public void setObjekt(T objekt) {
        this.objekt = objekt;
    }

    public static <T> boolean isEqual(T obj1, T obj2){
        return obj1.equals(obj2);
    }


    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.setObjekt("Objekt 1");
        System.out.println(box1.getObjekt());

        Box<Integer> box2 = new Box<>();
        box2.setObjekt(2);
        System.out.println(box2.getObjekt());

        Box<Integer> box3 = new Box<>();
        box3.setObjekt(2);

        System.out.println(isEqual(box2.getObjekt(),box3.getObjekt()));


    }

}
