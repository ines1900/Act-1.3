import java.util.Scanner;
public class Calcul {
public static void main(String[] args) {
 	System.out.println("Veuillez saisir le premier nombre :");
		Scanner sc1=new Scanner(System.in);
		int x=sc1.nextInt();
	System.out.println("Veuillez saisir le 2 ème nombre :");
		Scanner sc2=new Scanner(System.in);
		int y=sc2.nextInt();
                int j = x + y;
	System.out.println("la somme des deux nombres est"+j); 
     j = 1;
     int i;
     int f;
if (x>y) {
    for(i=1; i >= x; i++){ 
      j = j * i;}
System.out.println("Factorielle de "+x+" est:"+j);  
    }  
else {	 
    f = 1;
    for(i=1; i <= y; i++){ 
      f = f * i;}

 System.out.println("Factorielle de "+y+" est:"+f);  
    }
   }
 }