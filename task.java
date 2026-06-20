
public class task {
        String name;
        String price;
        String time;
        String updatedTime;
    
        public task(String name, String price, String time){
            this.name=name;
            this.price=price;
            this.time=time;
            this.updatedTime=null;
        }
        
        public void update(String newName, String newPrice, String updatedTime) {
            this.name = newName;
            this.price = newPrice;
            this.updatedTime = updatedTime;
        }
        
    
    @Override
    public String toString() {
        return "{\"name\":\"" + name +
               "\",\"price\":\"" + price +
               "\",\"time\":\"" + time +
               "\"}";
    }
}
