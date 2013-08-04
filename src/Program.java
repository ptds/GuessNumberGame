import java.io.IOException;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Домашний
 * Date: 29.07.13
 * Time: 11:12
 * To change this template use File | Settings | File Templates.
 */
public class Program {
    public static void main(String[] args){
        System.out.print("Давай поиграем в игру!\n");   // Пишем строчки
        System.out.print("Загадай число от 0 до 9.\n"); // Пишем строчки
        Random random = new Random();                   // Создаём случайность
        do {                                            // Начало цикла
            int a = random.nextInt(10);                 // Берём случайное число
            System.out.print("Ты загадал число " + a + "?\n"); // Выводим число с вопросом
            int enYes = 121;
            int ruYes = 397;
            int ruNo = 339;
            int enNo = 110;

            int answer = readCode();                     // Читает ответ

            //System.out.print("вы ввели "+answer+"?\n");

            if(answer == enYes ||answer == ruYes){  // Если ответ "да"
                System.out.print("Ура!!!\n");
                break;  // Прекращаем цикл

            }
            else if(answer == enNo || answer == ruNo ) { // Если ответ "нет"
               continue;            // Продолжаем задавать вопросы
            }
            else {  // Если ответ ни  "да", ни "нет"
                System.out.print("?_?\n");
            }
        }
        while(true);                                    // Конец цикла

        System.out.print("Игра закончена.");
    }

    public static int readCode(){
        try {
            int code1 = System.in.read();
            int code2 = 0;

            if(code1 == 208 || code1 == 209)
            {
                code2 = System.in.read();
            }

            System.in.read();

            int result = code1 + code2;
            return  result;

        }
        catch (IOException e) { e.printStackTrace(); }
        return 0;
    }

}
