import java.util.ArrayList;
import java.util.List;

public class OperationQueue<T> {
    private List<T> list = new ArrayList<>();
    private Class<T> type;

    public OperationQueue(Class<T> type){
        this.type = type;
    }

    public List<T> getList(){
        return list;
    }
    public void addOperation(Object obj)throws InvalidOperationException {
        try {
            if (!type.isInstance(obj)) {
                throw new InvalidOperationException("This is invalid operation");
            } else {
                list.add((T) obj);
            }
        }catch (InvalidOperationException e){
            System.out.println(e.getMessage());
        }
    }

    public void executeAll(){
        if(type == Integer.class){
            Integer sum = 0;
            for (T element : list) {
                sum += (Integer) element;
            }
            System.out.println(sum);
        }else if(list.getClass().getSimpleName().equals("String")){
            String sum = "";
            for (T element : list){
                sum += (String) element;
            }
            System.out.println(sum);
        }else{
            System.out.println("Invalid Operation");
        }
    }
    public void test(){
        System.out.println(list.getClass().getSimpleName());
    }

}
