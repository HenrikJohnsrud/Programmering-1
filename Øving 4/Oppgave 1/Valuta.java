import java.util.Currency;

public class Valuta{

    private double valueCurrency;
    private double input;


    public Valuta(double valueCurrency, double input){
        this.valueCurrency = valueCurrency;
        this.input = input;
    }

    public double currency_to_nok (){
        return input / valueCurrency;
    }

    public double nok_to_currency (){
        return valueCurrency * input;
    }

    public double getInput(){//eksempel på en getmetode
        return input;
    }

    public void setInput(double valueCurrency){ //dette er en setmetode, eksempel
        input = valueCurrency;
    }
}
