package defpackage;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: g23  reason: default package */
public final class g23 implements o99 {
    public static final Logger a = Logger.getLogger(g23.class.getName());

    public final InputStream a(String str) {
        InputStream resourceAsStream = g23.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            Level level = Level.WARNING;
            a.log(level, "File " + str + " not found");
        }
        return resourceAsStream;
    }
}
