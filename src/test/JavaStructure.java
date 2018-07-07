package test;

public class JavaStructure {
    public static void main(String[] args) {
   //计算10人的阶乘
    int number = 10;

    //0和1的阶乘都为1;
        if (number == 0 || number == 1) {
            System.out.println(1);
        }else {
            //循环累乘 10
            int count = 1;
            for (int i = number;i >1;i--){
                //count *=i;
                count = count * i;
            }
            System.out.print(count);
        }





    }


}
