public class Variable {
    public static void main(String[] args) {
        //Объявление переменных
        byte numberOfCores = 2;
        short memorySyze = 4048;
        int batteryCapacity = 5200;
        long videoMemorySyze = 128;
        float diagonalSyze = 14.4f;
        double weight = 2.5;
        char modification = 'T';
        boolean isQuick = false;

        //Вывод в консоль информации, хранящейся в переменных
        System.out.println("Характеристики Lenovo THINKPAD T60");
        System.out.println("Процессор: " + numberOfCores + " ядра (ядер)");
        System.out.println("Оперативная память: "+ memorySyze + " Мб");
        System.out.println("Емкость батареи: " + batteryCapacity + " мАч");
        System.out.println("Объем памяти видеокарты: " + videoMemorySyze+ " Мб");
        System.out.println("Диагональ экрана: " + diagonalSyze + " дюймов(а)");
        System.out.println("Масса (кг): " + weight);
        System.out.println("Модель : " + modification);
        System.out.println("Быстрый? " + isQuick);
    }
}