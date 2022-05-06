import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        /*var input = new Scanner(System.in).nextInt();
        Skill leapYear = (number) -> {
            if ((number % 4 == 0) && (number % 100 != 0) || (number % 400 == 0)) {
                return true;
            }
            return false;
        };

        if (leapYear.isLeapYear(input)) {
            System.out.println("是闰年");
        } else {
            System.out.println("不是闰年");
        }

         */

//        var input = new Scanner(System.in).nextLine();
//        StringToDay obj = (day) -> {
//            if(!day.contains("/")){
//                return "请输入正确的年月日格式 Year/Moth/Day";
//            }
//            var slashIndex1 = day.lastIndexOf("/");
//            var result = day.substring(0, slashIndex1);
//
//            var slashIndex2 = result.lastIndexOf("/");
//            var charArray = result.toCharArray();
//
//            var list = new ArrayList<Character>();
//            for (int j = 0; j < result.length(); j++) {
//                list.add(charArray[j]);
//            }
//            if (list.get(slashIndex2 + 1) != '0') {
//                list.add(slashIndex2 + 1, '0');
//            }
//
//            var result2 = list.toString().replaceAll("(?:\\[|null|\\]|)", "").replaceAll(",", "").replaceAll(" ", "");
//            return result2;
//        };
//        System.out.println(obj.stringToDay(input));

        var input = new Scanner(System.in).nextLine();
        StringToDay obj = (day) ->{
            DateFormat dt = new SimpleDateFormat("yyyy/MM/dd");
            dt.setLenient(false);
            Date temp = null;
            try{
                temp = dt.parse(day);
            }catch (Exception e){
                System.out.println("输入格式不正确");
            }
            DateFormat newFormat = new SimpleDateFormat("yyyy/MM");
            return newFormat.format(temp);
        };
        System.out.println(obj.stringToDay(input));
    }
}
