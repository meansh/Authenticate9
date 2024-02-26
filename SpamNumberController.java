@RestController
@RequestMapping("/api/spam")
public class SpamNumberController {
    @Autowired
    private SpamNumberService spamNumberService;
    
    @GetMapping
    public ResponseEntity<List<SpamNumber>> getSpamNumbers() {
        List<SpamNumber> spamNumbers = spamNumberService.getSpamNumbers();
        return new ResponseEntity<>(spamNumbers, HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<?> markNumberAsSpam(@RequestBody SpamNumber spamNumber) {
        spamNumberService.markNumberAsSpam(spamNumber);
        return ResponseEntity.ok().build();
    }

}
