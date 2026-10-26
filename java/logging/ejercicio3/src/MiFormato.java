import java.text.SimpleDateFormat;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MiFormato extends Formatter {


    @Override
    public String format(LogRecord record) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") + " [" + record.getLevel() + "] " + record.getMessage() + "\n";
    }

}
