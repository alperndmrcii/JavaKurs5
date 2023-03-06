package Gun31._01_Enum;

public class Ornek1 {
    public static void main(String[] args) {
        // verilen bir ay no ya göre ayın gün sayısını veren programı yazınız.

        int ayNo=5;
        switch (ayNo)
        {
            case 1: System.out.println(30);break;
            case 2: System.out.println(28);break;
            case 3: System.out.println(31);break;
            case 4: System.out.println(30);break;
            case 5: System.out.println(30);break;
            case 6: System.out.println(31);break;
            case 7: System.out.println(31);break;
            case 8: System.out.println(30);break;
            case 9: System.out.println(31);break;
            case 10: System.out.println(31);break;
            case 11: System.out.println(30);break;
            case 12: System.out.println(30);break;
            // okunabilirlik ve kontrollü yazılım yok, tanımlama yetersiz
            // numaradan gitmeye çalıştık, zorluklarla karşılaştık
            // bunun yerine isimden gitmeye çalışalım
        }
        String ayAd="Mayıs";
        switch (ayAd)
        {
            case "subat": System.out.println(28);break;
            case "mart": System.out.println(30);break;
            case "nisan": System.out.println(31);break;
            case "mayıs": System.out.println(30);break;
            // kontrol zor hataya açık
        }

    }
}
