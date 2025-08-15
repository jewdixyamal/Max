package defpackage;

import java.util.LinkedHashSet;

/* renamed from: mk6  reason: default package */
public final class mk6 implements lk6 {
    public final je7 a;
    public final LinkedHashSet b = new LinkedHashSet();
    public boolean c;
    public jk6 d;

    public mk6(je7 je7) {
        this.a = je7;
    }

    public final void a(jk6 jk6) {
        this.d = jk6;
        boolean z = false;
        boolean z2 = false;
        for (kk6 kk6 : this.b) {
            boolean P = ((ht8) kk6).P(jk6, new vw(2, this, mk6.class, "processText", "processText(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", 0, 23));
            if (!z2) {
                z2 = P;
            }
        }
        if (jk6 != null && !z2) {
            z = true;
        }
        this.c = z;
    }
}
