
public class PA{
     
	static double t1;
	static double t2;
	static double t3;
	static double razao;
	
	public static double isPA(String termo1, String termo2, String termo3){
               try{
                        double doubletermo1 = Double.parseDouble(termo1);
                        double doubletermo2 = Double.parseDouble(termo2);
                        double  doubletermo3 = Double.parseDouble(termo3);


                    if((doubletermo2 - doubletermo1) == (doubletermo3 - doubletermo2)){	
                            t1 = doubletermo1;
                            t2 = doubletermo2;
                            t3 = doubletermo3;
                            razao = doubletermo2 - doubletermo1;
                            return 1;
                    }else{
                            return 0;
                    }
                 }catch(NumberFormatException e){
                   ResultBox.display("Erro", "Insira Um número");
                   PAInterface.termo1.setText(" ");
                   PAInterface.termo2.setText(" ");
                   PAInterface.termo3.setText(" ");
                   return -1;
               }
            
	}
	
	public static double getRazao(){
		return razao;
	}
	
	public static double getTermo(String Ntermo){
            try{
		return (t1  + (Double.parseDouble(Ntermo) -1) *razao);
                   
            }catch(NumberFormatException e){
                   ResultBox.display("Erro", "Insira Um número");
                   PAInterface.fieldTermo.setText(" ");
                   return -1;
                  
            }
    
        }		
	
	public static double getSoma(String termoF){
            try{
               return (t1 + Double.parseDouble(termoF) * (((Double.parseDouble(termoF) - t1)/razao) + 1));
            }catch(NumberFormatException e){
                   ResultBox.display("Erro", "Insira Um número");
                   PAInterface.fieldSoma.setText(" ");
                   return -1;
                  
            }
        }
	
	public static double getTermoCentral(String termoN){
            try{
		return (PA.getTermo(termoN) + t1);
            }catch(NumberFormatException e){
                   ResultBox.display("Erro", "Insira Um número");
                   PAInterface.fieldTermoCentral.setText(" ");
                   return -1;
                  
            }
	}
}

