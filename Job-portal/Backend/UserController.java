import java.util.List;
public class UserController {
    private final UserRepository repo;
    public UserController(UserRepository repo) {
        this.repo = repo;
    }
    public List<User> getUsers() {
        return repo.findAll(repo);
    }
public User createUser(String user) {
return repo.save(user);
}
}