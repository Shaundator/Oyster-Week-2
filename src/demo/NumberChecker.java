package demo;


public class NumberChecker {

    public boolean isNumber(String line){
        if(line.matches("\\d+")){
            return true;
        }
        String[] data = line.split("\\d+");
        String dataString = "";
        for(int i = 0; i < data.length; i++){
            System.out.println("data " + (i+1) + " " + data[i]);
            dataString += data[i];
        }
        System.out.println("data string : " + dataString);



        switch(data.length){
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            default:
                System.out.println("case >2");
        }
        return false;
    }
}
