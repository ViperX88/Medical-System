import java.util.LinkedList;
import java.util.Scanner;
public class patient {
    private String name;
    private int age;
    private String address;
    private String number;
    private String id;
    private String company;

    Scanner sc = new Scanner(System.in);

    public patient(String name,int age, String address, String number, String id, String company){
        this.name = name;
        this.age = age;
        this.address = address;
        this.number = number;
        this.id = id;
        this.company = company;
    }

    public void operate(){
        while(true){
            System.out.println("Please select an operation:");
            System.out.println("1) Krankschreibung");
            System.out.println("2) Rezept");
            System.out.println("3) Attest"); 
            System.out.println("4) Termin vergeben");
            System.out.println("5) Check up");
            System.out.println("6) Abbrechen");

            String input = sc.nextLine();
            switch(input){
                case "1":
                    this.krankschreibung();
                case "2":
                    this.rezept();
                case "3":
                    this.attest();
                case "4":
                    this.termin();
                case "5":
                    this.check();
                case "6":
                    break;
                default:
                System.out.println("Please try again!");
            }
        }
    }

    public void krankschreibung(){
        System.out.println("Startdatum?");
        String startD = sc.nextLine();
        System.out.println("Enddatum?");
        String endD = sc.nextLine();
        System.out.println("Anamnese?");
        String anamnese = sc.nextLine();
        System.out.println("Krankschreibung für " + this.name + " vom " + startD + "bis einsschließlich" + endD " wegen " + anamnese);
    }

    public void rezept(){
        LinkedList l = new LinkedList<String>();
        do{
            System.out.println("Geben Sie ein Medikament an");
            l.add(sc.nextLine());
            System.out.println("Wollen Sie ein weiteres Medikament hinzufügen, dann schrieben Sie ja, ansonsten nein");
        } while(!medikament.equals("nein"));
        for(String elem : l){
            System.out.println( elem );
        }
    }

    public void attest(){
        System.out.println("Startdatum?");
        String startD = sc.nextLine();
        System.out.println("Enddatum?");
        String endD = sc.nextLine();
        System.out.println("Anamnese?");
        String anamnese = sc.nextLine();
        System.out.println("Attest für " + this.name + " vom " + startD + "bis einsschließlich" + endD " wegen " + anamnese); 
    }

    public void termin(){
        System.out.println("Geben Sie das gewünschte Datum ein:");
        String dat = sc.nextLine();
        System.out.println("Geben Sie den gewünschten Zeitpunk ein:");
        String zeit = sc.nextLine();
        System.out.println(this.name + " hat einen Termin am " + dat + " um " + zeit);
    }

    public void check(){
        System.out.println("Ist der Patient gesund?");
        String gesund = sc.nextLine();
        if(gesund.equals("ja")){
            System.out.println("Check up beendet");
            return;
        } 
        System.out.println("Bitte stellen Sie ein Rezept und eine Krankschreibung aus");
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getAddress(){
        return this.address;
    }

    public String getNumber(){
        return this.number;
    }

    public String getId(){
        return this.id;
    }

    public String getCompany(){
        return this.company;
    }
}
