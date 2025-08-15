package defpackage;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: vd  reason: default package */
public final class vd extends Handler {
    public static final vd a = new Handler();

    public final void close() {
    }

    public final void flush() {
    }

    public final void publish(LogRecord logRecord) {
        int min;
        CopyOnWriteArraySet copyOnWriteArraySet = ud.a;
        String loggerName = logRecord.getLoggerName();
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        Throwable thrown = logRecord.getThrown();
        String str = (String) ud.b.get(loggerName);
        if (str == null) {
            str = w9e.Y0(23, loggerName);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                StringBuilder o = rh4.o(message, "\n");
                o.append(Log.getStackTraceString(thrown));
                message = o.toString();
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int z0 = w9e.z0(message, 10, i2, false, 4);
                if (z0 == -1) {
                    z0 = length;
                }
                while (true) {
                    min = Math.min(z0, i2 + 4000);
                    message.substring(i2, min);
                    if (min >= z0) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }
}
