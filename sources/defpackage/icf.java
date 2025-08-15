package defpackage;

import java.util.regex.Pattern;

/* renamed from: icf  reason: default package */
public abstract class icf {
    static {
        Pattern.compile("[-_./;:]");
    }

    public static final void a() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }
}
