@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
    
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User registeredUser = userService.registerUser(user);
        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
    }
    
    @PostMapping("/login")
    public ResponseEntity<User> loginUser(@RequestParam String phoneNumber, @RequestParam String password) {
        User loggedInUser = userService.loginUser(phoneNumber, password);
        return new ResponseEntity<>(loggedInUser, HttpStatus.OK);
    }
    

}
