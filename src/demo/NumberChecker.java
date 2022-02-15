package demo;


public class NumberChecker {

    public boolean isNumber(String line){
        if(line.matches("\\d+")){
            return true;
        }

        String dataPoints = "";
        boolean numbers = false;
        for(int i = 0; i < line.length(); i++){
            if(!line.substring(i,(i+1)).matches("\\d+")){
                dataPoints += line.substring(i,(i+1));
            } else if(!numbers){
                numbers = true;
            }
        }

        switch(dataPoints){
            case "-":
                if(line.startsWith("-")){
                    return true;
                }
                break;
            case ".":
            case "e":
                if(!line.startsWith(dataPoints)&&!line.endsWith(dataPoints)){
                    return true;
                }
                break;
            case "-e":
            case "-.":
                if(line.startsWith("-")){
                    if(!line.endsWith(dataPoints.substring(1,2))){
                        return true;
                    }
                }
                break;
        }
        return false;
    }
}
