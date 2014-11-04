package boletin71;

public class numero {
    private float num1;
    
    public numero(){
        
    }
    
    public void setNumero(float valor1){
        setNum1(valor1);
    }
    
    public float getNumero(){
        return getNum1();
    }
    
    public void Condicion(){
        if (getNum1()>0){
            System.out.println(getNum1() +" é positivo");
        }
    }

    /**
     * @return the num1
     */
    public float getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(float num1) {
        this.num1 = num1;
    }

}
