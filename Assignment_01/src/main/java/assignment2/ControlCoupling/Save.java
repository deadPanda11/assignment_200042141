package assignment2.ControlCoupling;

public class Save {
    String data;

    private String saveToDatabase(){
        return "Saved to database";
    }

    private String saveToFile(){
        return "Saved to file";
    }

    public void saveData(int flag){
        if(flag == 1){
            System.out.println(saveToDatabase());
        }
        else {
            System.out.println(saveToFile());
        }
    }

    public static void main(String[] args) {
        Save save = new Save();
        save.saveData(1);
        save.saveData(0);
    }
}

//Control coupling occurs between modules when data are passed that influence the internal
//logic of a module (e.g., flags and switches).
//Here, flag is used to decide where the data needs to be saved
//when flag == 1, data will be saved to database
//when flag == 0, data will be saved to file
//This type of coupling is known as Control Coupling



