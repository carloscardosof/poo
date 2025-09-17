import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//Java SE - Standard Edition
// Java EE - Enterpise
// Java ME - Micro


public class Aula02 {

    public static void main(String[] args) {

        //Números inteiros
        byte byte_min = -128; // 8bit
        byte byte_max = 127;

        short short_min = -32768; //16 bit
        short short_max = 32767;

        int int_min = -2147483648; //32 bit
        int int_max = 2147483647;

        long long_min = -9223372036854775808L; //64 bit
        long long_max = 9223372036854775807L;

        //Números decimais
        float float_min = -1.4E-45f; //32bit
        float float_max = 3.4028235E38f;

        double double_min = -4.9E-324; //64bit
        double double_max = 1.7976931348623157E308;

        //Variáveis lógicas
        boolean verdadeiro = true; //1bit
        boolean falso = false;

        //Variáveis de texto
        char letra = 'a'; //16 bits

        String literal = "palavra";

        int[] arrayInt = {1,2,3,4};
        int x = arrayInt[2];
        arrayInt[3] = 4;
        //arrayInt[4] = 0;
        int[] ar = new int[7];

        ArrayList<String> al = new ArrayList<String>();
        al.add("oi!");
        al.add("tchau!");
        al.get(0);
        al.remove("oi!");

        HashMap<String,String> dict = new HashMap<>();
        dict.put("nome","carlos");
        dict.get("nome");

        //Para executar uma função, use Aula02.nomeFuncao
        //Ex.: Aula02.hello();
        //Aula02.cond();


    }

    //01_hello.py
    static void hello(){

    }

    //02_cond.py
    static void cond(){

    }

    //03_loop.py
    static void loop(){

    }

    //04_entrada.py
    static void entrada(){

    }

    //05_array.py
    static void array(){

    }

    //06_list.py
    static void list(){

    }

    //07_senha.py
    static void senha(){

    }

    //08_dict.py
    static void dict(){

    }



}
