package defpackage;

import java.io.Closeable;
import java.util.regex.Pattern;

/* renamed from: v2a  reason: default package */
public final class v2a implements Closeable {
    public static final Pattern b = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"", 2);
    public final yic a;

    public v2a(yic yic) {
        this.a = yic;
    }

    public final void close() {
        this.a.close();
    }
}
