
class adress{
    String location;
    adress(String location)
    {
        this.location=location;
    }
}
class person{
    String name;
    int age;
    adress adrs;
    public person(String name,int age,adress adrs){
        this.name = name;
        this.age = age;
        this.adrs=adrs;
    }
}

public class user {

    public static void main(String[] args){


        adress adrs=new adress("los angelos");//@1334

        person p1=new person("kumar",23,new adress(adrs.location));//@5434
        p1.adrs.location="chennai";

        person p2=new person(p1.name,p1.age,new adress(p1.adrs.location));//877631
p2.name="ganesh";
p2.age=34;
p2.adrs.location="mudaurai";
        System.out.println(p1.age+" "+p1.name+" "+p1.adrs.location);
        System.out.println(p2.age+" "+p2.name+" "+p2.adrs.location);


        System.out.println(adrs.location);

    }
}
