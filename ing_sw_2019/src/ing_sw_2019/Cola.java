/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ing_sw_2019;

/**
 *
 * @author JuanCamilo
 */
public class Cola {
     private Nodo Cab,Col;
    
    public Cola()
    {
        this.Cab=null;
        this.Col=null;
    }
     
     private boolean isEmpty()
    {
        return(this.Cab==null);
    }
     public String enqueve(int Dato){
     Nodo n=new Nodo(Dato);
     if(isEmpty()){
          this.Cab=n;
          this.Col=this.Cab;
     }else{
          this.Col.setSig(n);
          this.Col=n;
     }
     return("Se ingreso el Elemento"+ this.Col.getInf());
     }
     
     public String dequeve(){
          if(isEmpty())
               return("--cola vacia--");
          String x =("Se Retiro el Elemento"+this.Cab.getInf());
          this.Cab=this.Cab.getSig();
          return(x);        
     }
     public int size(){
          int x=1;
          Nodo P;
          P=this.Cab;
          while(P.getSig()!=null){
               x++;
               P=P.getSig();
          }
          return(x);
     }
     //    public int size2(){
     //        int x =0;
     //        Nodo P=this.Cab;
     //        while(P!=null){
     //            x=x+1;
     //            P=P.getSig();
     //        }
     //        return( x);
     //    }
     public String view (){
          String S="  ";
          Nodo P;
          P=this.Cab;
          while(P!=null){
               S=S+" "+(P.getInf());     
               P=P.getSig();
          }
          return(S);
     }
}

