package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: e8c  reason: default package */
public final class e8c implements Closeable {
    public final fu0 a;
    public final eu0 b;
    public final /* synthetic */ od c;

    public e8c(od odVar, y7c y7c, x7c x7c) {
        this.c = odVar;
        this.a = y7c;
        this.b = x7c;
    }

    public final void close() {
        this.c.a(true, true, (IOException) null);
    }
}
