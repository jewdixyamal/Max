package defpackage;

import java.io.Closeable;
import javax.inject.Provider;

/* renamed from: e14  reason: default package */
public final class e14 implements Closeable {
    public Provider X;
    public Provider Y;
    public Provider Z;
    public Provider a;
    public sy4 b;
    public Provider c;
    public nw4 o;

    public final void close() {
        ((gqc) ((h45) this.Y.get())).close();
    }
}
