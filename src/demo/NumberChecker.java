package demo;


public class NumberChecker {

    public boolean isNumber(String line){
        if(line.matches("\\d+")){
            return true;
        }
        if(line.endsWith("-")||line.endsWith(".")||line.endsWith("e")){
            return false;
        }
        String numbers = "";
        String dataPoints = "";
        boolean validData = false;
        for(int i = 0; i < line.length(); i++){
            if(line.substring(i,(i+1)).matches("\\d+")){
                numbers += line.substring(i,(i+1));
            } else {
                dataPoints += line.substring(i,(i+1));
            }
        }
        if(dataPoints.equals("-.")||dataPoints.equals("-e")||dataPoints.equals("-")||dataPoints.equals("e")||dataPoints.equals(".")){
            validData = true;
        }
        if(validData){
            if(numbers.matches("\\d+")){
                return true;
            }
        }
        return false;
    }
}
