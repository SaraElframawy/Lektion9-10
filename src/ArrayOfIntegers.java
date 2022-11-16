import java.util.*;

/**
 * This is lektion9 assignment from 1 to 8
 * @author Sara Elframawy
 * @version 1.0
 *
 */



public class ArrayOfIntegers {
    /**
     *
     * @param newArray as parameter will be used to generate en int array
     * @return newArray
     */
    public static int[] generateRandom(int [] newArray){
        Random random= new Random();
        for (int i=0;i<10;i++){
            newArray[i] =random.nextInt(20);

        }
        return newArray;

    }

    /**
     *  Beskrivning av metod main
     * @param args beskrivning av parameter
     */
    public static void main(String[] args) {
        /**
         * Här har jag skapat på int som innehåller
         */
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        generateRandom(array1);
        Random random = new Random();
        for(int i =0;i<10;i++){
            int randomNumber = random.nextInt(20);
            array1[i] = randomNumber;
            array2[i]= randomNumber;
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        //uppgift3

        ArrayList<Integer> integerArrayList= new ArrayList<>();

        for(int i=0;i<15;i++){
            int randomArrayList= random.nextInt(10);
            integerArrayList.add(randomArrayList);
        }
        System.out.println(integerArrayList);
       System.out.println(integerArrayList.contains(1));
       System.out.println(integerArrayList.contains(2));


       if(integerArrayList.indexOf(1)<integerArrayList.indexOf(2)){
           System.out.println("there is one before two");
       }  if(!integerArrayList.contains(1))  {
           System.out.println("there is no one  ");
       }
       if(!integerArrayList.contains(2)){
           System.out.println("there is no two");

        }
       if(integerArrayList.indexOf(2)<integerArrayList.indexOf(1)) {
           System.out.println("two is before one");
       }
       //shortcut to uppgift 4
       System.out.println(Collections.frequency(integerArrayList,2));


       //uppgift 5
        ArrayList<Integer> uppgift5 = new ArrayList<>();
        ArrayList<Integer> assignment5 = new ArrayList<>();
        ArrayList<Integer> assignments5 = new ArrayList<>();

        for (int i=0; i<10;i++){
            int slump5= random.nextInt(1,20);
            int random5 = random.nextInt(21,40);
            uppgift5.add(random5);
            assignment5.add(slump5);

        }
        for(int z=0 ; z< 10;z++){
            assignments5.add(assignment5.get(z));
            assignments5.add(uppgift5.get(z));
        }
        System.out.println(assignments5);


      //  uppgift5.addAll(assignment5);
      //  System.out.println(uppgift5);

        //uppgift 6
        String loremIpsum= "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Tenent mordicus. Plane idem, inquit,\n" +
                "        et maxima quidem, qua fieri nulla maior potest. Hoc est non dividere, sed frangere. Duo Reges:\n" +
                "        constructio  interrete.  Propter  nos  enim  illam,  non  propter  eam  nosmet  ipsos  diligimus.\n" +
                "                Conferam tecum, quam cuique verso rem subicias; Naturales divitias dixit parabiles esse, quod\n" +
                "        parvo esset natura contenta. Nulla erit controversia.";
        loremIpsum =loremIpsum.toLowerCase();
        String vowel = "aeiou";
        int counts =0;

      //  ArrayList<Character> vowels= new ArrayList<>();
        ArrayList<Character> text = new ArrayList<>();
        for(int i=0;i<vowel.length();i++){
            //vowels.add(vowel.charAt(i)); // we are going to compare string vowels with what the string contain
        }
        for (int i=0; i<loremIpsum.length();i++){
            text.add(loremIpsum.charAt(i));
            if( (text.get(i).equals('e')) || text.get(i).equals('a') || text.get(i).equals('i') || text.get(i).equals('u') || text.get(i).equals('o') )
         //   if(vowels.contains(loremIpsum.charAt(i)))
                counts++;


        }
        System.out.println("the number of vowels are"+counts);


        // uppgift 7
        ArrayList<Integer> guessGame = new ArrayList<>(10);
        for(int i =0; i<10;i++){
            guessGame.add(i);
        }
        var scan = new Scanner(System.in);
        Collections.shuffle(guessGame);
        boolean game = true;
        for(int i=0; i<3; i++) {
            System.out.println("guess where if number 5 from 0 to 9");
            int guessing = scan.nextInt();
            if (guessGame.indexOf(5) == guessing&& game) {
                System.out.println("You got the prize");
                game = false;
                break;

            }

            if(guessGame.indexOf(5)!= guessing) {
                System.out.println("you lost");
                game = false;

            }


        }
       System.out.println(guessGame);
        //Uppgift8
        ArrayList<Integer> integers8= new ArrayList<>();
        int amount=0;

        for(int i=0;i<50;i++){
            int uppgift8 = random.nextInt(3);
            integers8.add(uppgift8);


        }
        System.out.println(integers8);

        System.out.println("Guess number between 0,2");
        int guessing8 = scan.nextInt();
        int frec0= Collections.frequency(integers8,0);
        int frac1 = Collections.frequency(integers8,1);
        int frac2 = Collections.frequency(integers8,2);
        System.out.println(frec0+frac1+frac2);
     /*  if(Collections.frequency(integers8,guessing8)>integers8.size()/3)

        {
            System.out.println("you win the prize");
        } else if (Collections.frequency(integers8,guessing8)<integers8.size()/3){
            System.out.println("you didn't win the prize");

        }*/
        switch (guessing8){
            case 0:
                if(frec0>frac1&& frec0>frac2){
                    System.out.println("user wins the prize ");
                } else {
                    System.out.println("user doesn't win the prize");
                }
                break;
            case 1:
                if(frac1>frec0&&frac1>frac2){
                    System.out.println("user wins the prize");
                }else{
                    System.out.println("user doesn't win the prize");
                }
                break;
            case 2:
                if(frac2>frac1&&frac2>frec0){
                    System.out.println("user  win the prize");


                }else {
                    System.out.println("user doesn't win the prize");
                }
                break;
            default:
                System.out.println("you should only 1,2,0");

        }
        ArrayList <Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.forEach((n)-> System.out.println(n)); //lambda










    }


}
