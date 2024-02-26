@RestController
@RequestMapping("/api/contacts")
public class ContactController {
    @Autowired
    private ContactService contactService;
    
    @GetMapping("/{userId}")
    public ResponseEntity<List<Contact>> getUserContacts(@PathVariable Long userId) {
        List<Contact> contacts = contactService.getUserContacts(userId);
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<Contact> addContact(@RequestBody Contact contact) {
        Contact addedContact = contactService.addContact(contact);
        return new ResponseEntity<>(addedContact, HttpStatus.CREATED);
    }

}
