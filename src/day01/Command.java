package day01;

/**
 * Created by Administrator on 2015-9-22.
 * �����в���
 * �����������洢��args�����в�����
 */
public class Command {
    public static void main(String[] args){
        if ( args[0].equals("-h") ){
            System.out.println("Hello world!");
        }
        else if ( args[0].equals("-g") ){
            System.out.println("Good bye!");
        }


        for (int i=1;i<args.length;i++){
            System.out.println(" "+args[i]);
        }
    }
}
