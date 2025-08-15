package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: u47  reason: default package */
public final class u47 extends s47 {
    public final v47 b;
    public final WeakReference c;

    public u47(v47 v47, s47 s47) {
        super(s47.a);
        this.b = v47;
        this.c = new WeakReference(s47);
    }

    public final void a(Set set) {
        s47 s47 = (s47) this.c.get();
        if (s47 == null) {
            this.b.c(this);
        } else {
            s47.a(set);
        }
    }
}
