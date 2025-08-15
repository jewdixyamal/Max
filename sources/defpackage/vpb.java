package defpackage;

import java.io.Serializable;
import java.util.List;

/* renamed from: vpb  reason: default package */
public final class vpb implements Serializable {
    public final f52 a;
    public final List b;
    public final kq3 c;

    public vpb(f52 f52, wz wzVar, kq3 kq3) {
        this.a = f52;
        this.b = wzVar;
        this.c = kq3;
    }

    public final String toString() {
        int o = s5c.o(this.b);
        return "{chat=" + this.a + ", highlights=" + o + ", contactSearchResult=" + this.c + "}";
    }
}
