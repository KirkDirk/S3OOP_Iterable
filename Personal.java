import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Personal implements Iterable<User> {

    private List<User> users = new ArrayList<>();

    public Personal addUser(User user){
        users.add(user);
        return this;
    }

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            int index =0;
            @Override
            public boolean hasNext() {
                return index<users.size();
            }

            @Override
            public User next() {
                return users.get(index++);
            }
            
        };
    }
    
}
