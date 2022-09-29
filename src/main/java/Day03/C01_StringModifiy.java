package Day03;

public class C01_StringModifiy {

    //task : verilen kelimenin ilk iki harfinde A varsa silinsin.
    //       kelime içindeki harflerin hepsi büyük olacak
    //AABC ise ---> BC olcak
    public static void main(String[] args) {


    }

    public String deleteAIfITIsInFirstIntoPosition(String str){
        if (str.length()<=2){
            return str.replace("A","");
        }
        String firstTwoChars = str.substring(0,2);
        String afterFirstTwoChars = str.substring(2);
        return  firstTwoChars.replaceAll("A","")+afterFirstTwoChars;

    }
}
