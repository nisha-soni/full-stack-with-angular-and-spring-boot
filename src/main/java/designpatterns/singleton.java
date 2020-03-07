package designpatterns;

public class singleton {
	 private static singleton s;
     private singleton(){}
     public static singleton getInstance(){
       if(s==null){
    	   synchronized(singleton.class) {
    	         s= new singleton();
    	   }
       }
       return s;
     }
}
