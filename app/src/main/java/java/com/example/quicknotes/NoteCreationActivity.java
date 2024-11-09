package java.com.example.quicknotes;

public class NoteCreationActivity extends AppCompatActivity {
    private EditText titleEditText, contentEditText;
    private Spinner categorySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_creation);

        titleEditText = findViewById(R.id.note_title);
        contentEditText = findViewById(R.id.note_content);
        categorySpinner = findViewById(R.id.note_category);

        Button saveButton = findViewById(R.id.save_note_button);
        saveButton.setOnClickListener(v -> saveNoteToDatabase());
    }

    private void saveNoteToDatabase() {
    }
}
