import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.fife.ui.autocomplete.AutoCompletion;
import org.fife.ui.autocomplete.BasicCompletion;
import org.fife.ui.autocomplete.BasicWithWordRelatedCompletion;
import org.fife.ui.autocomplete.CompletionProvider;
import org.fife.ui.autocomplete.DefaultCompletionProvider;
import org.fife.ui.autocomplete.ShorthandCompletion;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;

/**
 * An example showing a simple usage of the AutoComplete package to add support
 * for auto-completion of keywords and other things.<p>
 *
 * This example uses RSyntaxTextArea 2.0.1.<p>
 *
 * Project Home: http://fifesoft.com/rsyntaxtextarea<br>
 * Downloads:    https://sourceforge.net/projects/rsyntaxtextarea
 */
public class AutoCompleteDemo extends JFrame {

   private static final long serialVersionUID = 1L;

   public AutoCompleteDemo() {

      JPanel contentPane = new JPanel(new BorderLayout());
      RSyntaxTextArea textArea = new RSyntaxTextArea(20, 60);
      textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
      textArea.setCodeFoldingEnabled(true);
      textArea.setAntiAliasingEnabled(true);
      contentPane.add(new RTextScrollPane(textArea));

      // A CompletionProvider is what knows of all possible completions, and
      // analyzes the contents of the text area at the caret position to
      // determine what completion choices should be presented. Most
      // instances of CompletionProvider (such as DefaultCompletionProvider)
      // are designed so that they can be shared among multiple text
      // components.
      CompletionProvider provider = createCompletionProvider();

      // An AutoCompletion acts as a "middle-man" between a text component
      // and a CompletionProvider. It manages any options associated with
      // the auto-completion (the popup trigger key, whether to display a
      // documentation window along with completion choices, etc.). Unlike
      // CompletionProviders, instances of AutoCompletion cannot be shared
      // among multiple text components.
      AutoCompletion ac = new AutoCompletion(provider);
      ac.install(textArea);

      setContentPane(contentPane);
      setTitle("AutoComplete Demo");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      pack();
      setLocationRelativeTo(null);

   }

   /**
    * Create a simple provider that adds some Java-related completions.
    * 
    * @return The completion provider.
    */
   private CompletionProvider createCompletionProvider() {

      // A DefaultCompletionProvider is the simplest concrete implementation
      // of CompletionProvider. This provider has no understanding of
      // language semantics. It simply checks the text entered up to the
      // caret position for a match against known completions. This is all
      // that is needed in the majority of cases.
      DefaultCompletionProvider provider = new DefaultCompletionProvider();

      // Add completions for all Java keywords. A BasicCompletion is just
      // a straightforward word completion.
      provider.addCompletion(new BasicCompletion(provider, "Cliete"));
      provider.addCompletion(new BasicCompletion(provider, "nome"));
      provider.addCompletion(new BasicCompletion(provider, "idade"));
      provider.addCompletion(new BasicCompletion(provider, "cpf"));
      provider.addCompletion(new BasicCompletion(provider, "Carro"));
      provider.addCompletion(new BasicCompletion(provider, "chassi"));
      provider.addCompletion(new BasicCompletion(provider, "placa"));
      provider.addCompletion(new BasicCompletion(provider, "Alugel"));
      provider.addCompletion(new BasicCompletion(provider, "dtIinici"));
      provider.addCompletion(new BasicCompletion(provider, "dtFim"));
      provider.addCompletion(new BasicCompletion(provider, "valor"));
      provider.addCompletion(new BasicCompletion(provider, "criar"));
      
      provider.addCompletion(new ShorthandCompletion(provider, "criar",
	            "<idObj>:criar(<classe>);", "<idObj>:criar(<nome_classe>)entre(<idObj>,<idObjj>);"));
	 provider.addCompletion(new ShorthandCompletion(provider, "destroir",
	            "<idObj>:destoir;", "<idObj>:destoir;"));
	 provider.addCompletion(new ShorthandCompletion(provider, "atribuir",
	            "<idObj>:atribuir(<attibuto>,<valor>);", "<idObj>:atribuir(<attibuto>,<valor>);"));
	 provider.addCompletion(new ShorthandCompletion(provider, "atribuir_aleatorio",
	            "<idObj>:atribuir_aleatorio(<nome_classe>);",  "<idObj>:atribuir_aleatorio(<nome_classe>);"));
	 provider.addCompletion(new ShorthandCompletion(provider, "associar",
	            "<idObj>:associar(<idObj>,<idObj>);",  "<idObj>:associar(<idObj>,<idObj>);"));
	 provider.addCompletion(new ShorthandCompletion(provider, "desassociar",
	            "<idObj>:desassociar(<idObj>,<idObj>);",  "<idObj>:desassociar(<idObj>,<idObj>);"));
//      provider.addCompletion(new BasicCompletion(provider, "enum"));
//      provider.addCompletion(new BasicCompletion(provider, "extends"));
//      provider.addCompletion(new BasicCompletion(provider, "final"));
//      provider.addCompletion(new BasicCompletion(provider, "finally"));
//      provider.addCompletion(new BasicCompletion(provider, "for"));
//      provider.addCompletion(new BasicCompletion(provider, "goto"));
//      provider.addCompletion(new BasicCompletion(provider, "if"));
//      provider.addCompletion(new BasicCompletion(provider, "implements"));
//      provider.addCompletion(new BasicCompletion(provider, "import"));
//      provider.addCompletion(new BasicCompletion(provider, "instanceof"));
//      provider.addCompletion(new BasicCompletion(provider, "interface"));
//      provider.addCompletion(new BasicCompletion(provider, "native"));
//      provider.addCompletion(new BasicCompletion(provider, "new"));
//      provider.addCompletion(new BasicCompletion(provider, "package"));
//      provider.addCompletion(new BasicCompletion(provider, "private"));
//      provider.addCompletion(new BasicCompletion(provider, "protected"));
//      provider.addCompletion(new BasicCompletion(provider, "public"));
//      provider.addCompletion(new BasicCompletion(provider, "return"));
//      provider.addCompletion(new BasicCompletion(provider, "static"));
//      provider.addCompletion(new BasicCompletion(provider, "strictfp"));
//      provider.addCompletion(new BasicCompletion(provider, "super"));
//      provider.addCompletion(new BasicCompletion(provider, "switch"));
//      provider.addCompletion(new BasicCompletion(provider, "synchronized"));
//      provider.addCompletion(new BasicCompletion(provider, "this"));
//      provider.addCompletion(new BasicCompletion(provider, "throw"));
//      provider.addCompletion(new BasicCompletion(provider, "throws"));
//      provider.addCompletion(new BasicCompletion(provider, "transient"));
//      provider.addCompletion(new BasicCompletion(provider, "try"));
//      provider.addCompletion(new BasicCompletion(provider, "void"));
//      provider.addCompletion(new BasicCompletion(provider, "volatile"));
//      provider.addCompletion(new BasicCompletion(provider, "while"));

      // Add a couple of "shorthand" completions. These completions don't
      // require the input text to be the same thing as the replacement text.
//      provider.addCompletion(new ShorthandCompletion(provider, "sysout",
//            "System.out.println(", "System.out.println("));
//      provider.addCompletion(new ShorthandCompletion(provider, "syserr",
//            "System.err.println(", "System.err.println("));
//      List<String> list = new ArrayList<String>();
//      list.add("Nome");
//      list.add("idade");
//      provider.addCompletion(new BasicWithWordRelatedCompletion(provider, "Cliente", list));
      

      return provider;

   }

   public static void main(String[] args) {
      // Instantiate GUI on the EDT.
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            try {
               String laf = UIManager.getSystemLookAndFeelClassName();
               UIManager.setLookAndFeel(laf);
            } catch (Exception e) {
            }
            new AutoCompleteDemo().setVisible(true);
         }
      });
   }

}