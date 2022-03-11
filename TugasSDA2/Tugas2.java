package TugasSDA2;

import java.util.LinkedList;

public class Tugas2 {
    public static void main(String[] args) {
        LinkedList<String> saya= new LinkedList<String>();
        saya.add("M");
        saya.add("U");
        saya.add("H");
        saya.add("A");
        saya.add("M");
        saya.add("M");
        saya.add("A");
        saya.add("D");
        saya.add("");
        saya.add("I");
        saya.add("R");
        saya.add("S");
        saya.add("Y");
        saya.add("A");
        saya.add("D");
        saya.add("U");
        saya.add("L");
        saya.add("");
        saya.add("F");
        saya.add("I");
        saya.add("K");
        saya.add("R");
        saya.add("I");
        saya.add("");

        System.out.println("saya =" +saya);
        System.out.println("Size = "+saya.size());
      
        //Add LinkedList
        saya.addFirst("Prof.");
        saya.addFirst("H.");
        saya.addLast("S.Kom");
        
        System.out.println("\nFungsi Add = "+saya);
        System.out.println("Size = "+saya.size());
      
        //set linkedlist 
        saya.set(1,"B" );
        saya.set(3,"E" );
        saya.set(5,"T" );
        saya.set(12,"P" );
        saya.set(13,"S" );
        System.out.println("Fungsi Set = "+saya);
        System.out.println("Size = "+saya.size());
      
        //remove linkedlist
        saya.removeFirst();
        saya.removeLast();
        System.out.println("Fungsi Remove First & Last = "+saya);
        System.out.println("Size = "+saya.size());
      
        saya.remove(5);
        saya.remove(3);
        saya.remove(0);
    
        System.out.println("Fungsi Remove = "+saya);
        System.out.println("Size = "+saya.size());
      
        //pop and push
        saya.pop();
        System.out.println("Fungsi POP = "+saya);
        System.out.println("Size = "+saya.size());
      
        saya.push("M");
        System.out.println("Fungsi PUSH = "+saya);
        System.out.println("Size = "+saya.size());
    }
    
}
