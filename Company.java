import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<User>{
    private User user;

    public Company(User user) {
        this.user = user; 
    }

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            List<User> allPersList = deepTreeAllPersonal(user);
            Iterator<User> iter = allPersList.iterator();
            @Override
            public boolean hasNext() {
                return iter.hasNext();
            }

            @Override
            public User next() {
                return iter.next();
            }
            
        };
    }
    private List<User> deepTreeAllPersonal(User user){
        List<User> allPersonal = new ArrayList<>();
        allPersonal.add(user);
        if (user.getSubPersonal().size() == 0) {return allPersonal;}
        for (User item : user.getSubPersonal()) {
            allPersonal.addAll(deepTreeAllPersonal(item));
        }
        return allPersonal;
    }
    
}
