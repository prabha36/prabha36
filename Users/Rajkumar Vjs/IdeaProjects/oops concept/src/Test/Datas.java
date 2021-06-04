package Test;

import java.util.*;
/*String,String,String*/

public class Datas {
    private String name;
    private String district;
    private String area;

    public Datas(String name, String district, String area) {
        this.name=name;
        this.district=district;
        this.area=area;

       // System.out.println(name+" "+district+" "+area);
    }

    public static void main(String[] args) {
        int chennaiCount = 0;
        int bangaloreCount = 0;
        int keralaCount = 0;
        int adayarCount = 0;
        int polurCount = 0;
        int annanagarCount = 0;
        int velacherry = 0;
        int nungambakkamCount = 0;
        int whitefieldsCount = 0;
        int trichurCount = 0;
        /*HashMap<String,List<String>> employee= new HashMap<String,List<String>>();

        List<String> Ram = new ArrayList<String>();
        Ram.add("Chennai");
        Ram.add("Adayar");

       *//* if(Ram.contains("Chennai")) {
            chennaiCount ++;
        }*//*

        List<String> Kumar = new ArrayList<String>();
        Kumar.add("Chennai");
        Kumar.add("Adayar");

        List<String> Raj = new ArrayList<String>();
        Raj.add("Chennai");
        Raj.add("Polur");

        List<String> Swami = new ArrayList<String>();
        Swami.add("Chennai");
        Swami.add("Annanagar");

        List<String> Karthik = new ArrayList<String>();
        Karthik.add("Chennai");
        Karthik.add("Velacherry");

        List<String> Geetha = new ArrayList<String>();
        Geetha.add("Chennai");
        Geetha.add("Nungambakkam");

        List<String> Rob = new ArrayList<String>();
        Rob.add("Bangalore");
        Rob.add("Whitefields");

        List<String> Krishna = new ArrayList<String>();
        Krishna.add("Kerala");
        Krishna.add("Trichur");
        Krishna.add("Ram,Chennai,Adyar");

        employee.put("Ram",Ram);
        employee.put("Kumar", Kumar);
        employee.put("Raj", Raj);
        employee.put("Swami", Swami);
        employee.put("Karthik", Karthik);
        employee.put("Geetha", Geetha);
        employee.put("Rob", Rob);
        employee.put("Krishna", Krishna);*/

        /*System.out.println(employee);
        if (employee.containsValue("Chennai")) {
            chennaiCount ++;
        }*/
        ArrayList<Datas> dataList = new ArrayList<Datas>();
        Datas datas = new Datas("Ram", "Chennai","Adayar");
        Datas datas1 = new Datas("Kumar", "Chennai","Adayar");
        Datas datas2 = new Datas("Raj", "Chennai","Polur");
        Datas datas3 = new Datas("Swami", "Chennai","Annanagar");
        Datas datas4 = new Datas("Karthik", "Chennai","Velacherry");
        Datas datas5 = new Datas("Geetha", "Chennai", "Nungambakkam");
        Datas datas6 = new Datas("Rob", "Bangalore","Whitefields");
        Datas datas7 = new Datas("Krishna", "Kerala","Trichur");


        dataList.add(datas);
        dataList.add(datas1);
        dataList.add(datas2);
        dataList.add(datas3);
        dataList.add(datas4);
        dataList.add(datas5);
        dataList.add(datas6);
        dataList.add(datas7);

        for (Datas data : dataList){
            if(data.district == "Chennai") {
                chennaiCount ++;
                if(data.area == "Adayar") {
                    adayarCount ++;
                }
                if(data.area == "Polur") {
                    polurCount ++;
                }
                if(data.area == "Annanagar") {
                    annanagarCount ++;
                }
                if(data.area == "Velacherry") {
                    velacherry ++;
                }
                if(data.area == "Nungambakkam") {
                    nungambakkamCount ++;
                }
            }
            if(data.district == "Bangalore") {
                bangaloreCount ++;
                if(data.area == "Whitefields") {
                    whitefieldsCount ++;
                }
            }
            if(data.district == "Kerala"){
                keralaCount ++;
                if(data.area == "Trichur") {
                    trichurCount ++;
                }
            }

        }
        System.out.println("Chennai - "+chennaiCount + "\n"+"Bangalore - "+ bangaloreCount + "\n" + "Kerala - " + keralaCount+ "\n"+ "\n");
        System.out.println("Chennai");
        System.out.println("Adayar - "+ adayarCount + "\n" +"Polur - "+ polurCount + "\n" +"Annanagar - "+ annanagarCount + "\n" +"Velacherry - "+velacherry + "\n"+"Nungambakkam -  "+nungambakkamCount+ "\n"+ "\n");
        System.out.println("Bangalore");
        System.out.println("Whitefields - "+whitefieldsCount);
        System.out.println();
        System.out.println();
        System.out.println("Kerala");
        System.out.println("Trichur - "+trichurCount);

        /*Iterator<Datas> itr = dataList.iterator();
        while ((itr.hasNext())) {
            System.out.println(itr.next());
        }*/


        /*List<String> empList = new ArrayList<String>();
        empList.add("Ram, Chennai, Adayar");
        empList.add("Kumar, Chennai, Adayar");
        empList.add("Raj, Chennai, Polur");
        empList.add("Swami, Chennai, Annanagar");
        empList.add("Karthik, Chennai, Velacherry");
        empList.add("Geetha, Chennai, Nungambakkam");
        empList.add("Rob, Bangalore, Whi tefields");
        empList.add("Krishna, kerala, Trichur");*/

      /*  Iterator<String> itr = empList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        *//*List<String> ram = empList[1].split(",");*//*
        String num = "Ram, Chennai, Adayar";
        String str[] = num.split(",");
        List<String> al = new ArrayList<String>();
        al = Arrays.asList(str);

        for(String s: al) {
            System.out.println(s);
        }*/

        //System.out.println(empList);



       // System.out.println("Chennai "+ chennaiCount);

    }
}
