package defpackage;

import java.util.List;

/* renamed from: h9b  reason: default package */
public final class h9b extends oi0 {
    public static final pke X = new pke("privacy.restricted", (String) null, (String) null);
    public final long c;
    public final List o;

    public h9b(long j, List list) {
        super(X);
        this.c = j;
        this.o = list;
    }

    public final String toString() {
        return "PrivacyRestrictedError{chatId=" + this.c + ", contactIds=" + this.o + '}';
    }
}
