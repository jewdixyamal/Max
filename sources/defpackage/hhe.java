package defpackage;

import java.util.LinkedHashSet;
import java.util.Objects;

/* renamed from: hhe  reason: default package */
public final /* synthetic */ class hhe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ihe b;
    public final /* synthetic */ ihe c;

    public /* synthetic */ hhe(ihe ihe, ihe ihe2, int i) {
        this.a = i;
        this.b = ihe;
        this.c = ihe2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ihe ihe = this.b;
                Objects.requireNonNull(ihe.e);
                ihe.e.g(this.c);
                return;
            default:
                ihe ihe2 = this.b;
                ihe ihe3 = this.c;
                q40 q40 = ihe2.b;
                synchronized (q40.b) {
                    ((LinkedHashSet) q40.c).remove(ihe2);
                    ((LinkedHashSet) q40.o).remove(ihe2);
                }
                ihe2.g(ihe3);
                if (ihe2.f != null) {
                    Objects.requireNonNull(ihe2.e);
                    ihe2.e.c(ihe3);
                    return;
                }
                ihe2.toString();
                return;
        }
    }
}
