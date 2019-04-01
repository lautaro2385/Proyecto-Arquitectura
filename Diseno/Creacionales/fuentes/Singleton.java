package edu.cascada.diseno;
public class Singleton{
private static Singleton instancia;
public static void main(String[] args){
	Singleton s1  =  new Singleton().getInstancia();
	Singleton s2  =  new Singleton().getInstancia();
}
private  Singleton(){}
public static Singleton getInstancia(){if(instancia == null){
   instancia = new Singleton();
}
return instancia;
}
}