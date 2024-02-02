public class ArrayResult {
    public static void main(String[] args) {
        CustomArrayList<String> customList = new CustomArrayList<>();
        customList.add ("1");
        customList.add ("2");
        customList.add ("3");

        System.out.println("Размер :" + customList.size());
        System.out.println("Пусто :" + customList.isEmpty());
        System.out.println("Содержит '2' :" + customList.contains("2"));

        System.out.println("Элемент с индексом 1 :" + customList.get(0));

        customList.remove(0);
        System.out.println("После удаления элемента с индексом 0 :" + customList);

        customList.clear();
        System.out.println("После очистки списка :" + customList);
    }
}
