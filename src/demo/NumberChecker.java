package demo;


public class NumberChecker {

    public boolean isNumber(String line){
        if(line.matches("\\d+")){
            return true;
        }


        return false;
    }
}
