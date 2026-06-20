
import java.time.LocalDateTime;
public class manager {
    public static void main(String[] arr){
        if(arr.length==0){
            System.out.println("no command given");
            return;
        }
        if ((arr[0].equals("add") || arr[0].equals("update")) && arr.length < 2){
            System.out.println("command given with no data");
        }
        else{
            String command= arr[0];
            if(command.equals("add")){
                String name= arr[1];
                String price =arr[2];
                String time=LocalDateTime.now().toString();
                System.out.println("added "+name+" with price "+price+" at time "+time);
                task t= new task(name, price, time);
                try{
                    java.io.FileWriter writer = new java.io.FileWriter("data.json", true);
                    writer.write(t.toString());
                    writer.close();
                }
                catch(Exception e){
                    System.out.println("error writing to file");
                }


            }
            if (command.equals("update")) {
                String name = arr[1];
                String price = arr[2];
                String time = LocalDateTime.now().toString();

                task t = new task(name, price, time);
                t.update(name, price, time);

                System.out.println("updated " + name + " with price " + price + " at time " + time);
                try {
                    java.io.FileWriter writer = new java.io.FileWriter("data.json", true);
                    writer.write(t.toString());
                    writer.close();
                } catch (Exception e) {
                    System.out.println("error writing to file");
                }
            }


            

        }
    
        
        
    }
    
}
