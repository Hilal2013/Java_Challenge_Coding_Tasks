package tasks.numbers_tasks;

public class Practice_Byte {
    public static void main(String[] args) {
//byte=>(between -128 and 127) 1 byte 8 bit 2^8=256
        byte x=127;
        x+=1;
        System.out.println(x);//-128

        byte num1=2;
        byte num2=4;
        byte result= (byte) (num1+num2);//when you add mmay be result will be greater than 127//out of range
        //you need to explicitly tell the compiler //cast the result byte
        System.out.println(result);//6
        byte y=127;
        byte z=1;
        byte result1=(byte)(y+z);
        System.out.println(result1);//-128//128-256=-128




    }
}
