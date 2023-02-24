import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> arr=new ArrayList<>();
        
       

        System.out.println("enter number of teams");
        int team_num=sc.nextInt();
        int s=0;
        while(s<team_num){
            arr.add(sc.next());
            s++;
        }
        ArrayList<String> matches=new ArrayList<>();
         for(int i=0;i<team_num;i++){
            for(int j=i+1;j<team_num;j++){
                matches.add(arr.get(i)+"vs"+arr.get(j));
                
            }
         }
         System.out.println(matches);
         
         System.out.println("Day1");
         for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(i==0&&j==8){
                    System.out.println(matches.get(i));
                    System.out.println(matches.get(j));
                }
            }
        }System.out.println("Day2");
        for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    if(i==5&&j==1){
                        System.out.println(matches.get(i));
                        System.out.println(matches.get(j));
                        
                    }
            }
        }System.out.println("Day3");
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(i==9&&j==4){
                    System.out.println(matches.get(i));
                    System.out.println(matches.get(j));
                    
                }
        }
    }System.out.println("Day4");
    for(int i=0;i<10;i++){
        for(int j=0;j<10;j++){
            if(i==2&&j==6){
                System.out.println(matches.get(i));
                System.out.println(matches.get(j));
               
            }
    }
}System.out.println("Day5");
for(int i=0;i<10;i++){
    for(int j=0;j<10;j++){
        if(i==7&&j==3){
            System.out.println(matches.get(i));
            System.out.println(matches.get(j));
           
        }
}
}

            
 }
