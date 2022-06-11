import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> needToDo = new ArrayList<String>();

        needToDo.add("洗濯");
        needToDo.add("前髪を切る");
        needToDo.add("部屋の片付け");

        System.out.println(needToDo.size());
        System.out.println(needToDo.get(0));
        System.out.println(needToDo.get(1));
        System.out.println(needToDo.get(2));

        for (String list : needToDo) {
            System.out.println(list);
        }

        String[] hobbies = {"ドラマ", "音楽", "マンガ"};
        int index = 4;
        try {
            System.out.println(hobbies[index]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("配列の範囲を超えています");
        }

        int age = -20;
        try {
            if (age < 0){
                throw new IllegalArgumentException();
            }
            System.out.println("あなたの年齢：" + age + "歳");
        } catch (IllegalArgumentException e){
            System.out.println("年齢が不正な数値です。");
        }
    }
}
