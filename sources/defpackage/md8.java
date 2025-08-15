package defpackage;

import android.os.Bundle;

/* renamed from: md8  reason: default package */
public final /* synthetic */ class md8 implements Runnable {
    public final /* synthetic */ Bundle X;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ue b;
    public final /* synthetic */ a98 c;
    public final /* synthetic */ String o;

    public /* synthetic */ md8(ue ueVar, a98 a98, String str, Bundle bundle) {
        this.b = ueVar;
        this.c = a98;
        this.o = str;
        this.X = bundle;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, cy4] */
    public final void run() {
        String str;
        y9d y9d;
        switch (this.a) {
            case 0:
                ue ueVar = this.b;
                ((ld8) ueVar.d).getClass();
                ((a84) ueVar.g).execute(new md8(ueVar, this.c, this.o, this.X));
                return;
            default:
                this.b.getClass();
                a98 a98 = this.c;
                a98.K();
                z88 z88 = a98.c;
                m5f g = (!z88.isConnected() ? z9d.b : z88.Q0()).a.iterator();
                while (true) {
                    boolean hasNext = g.hasNext();
                    str = this.o;
                    if (hasNext) {
                        y9d = (y9d) g.next();
                        if (y9d.a != 0 || !y9d.b.equals(str)) {
                        }
                    } else {
                        y9d = null;
                    }
                }
                if (y9d != null) {
                    a98.K();
                    z9d Q0 = !z88.isConnected() ? z9d.b : z88.Q0();
                    Q0.getClass();
                    if (Q0.a.contains(y9d)) {
                        y9d y9d2 = new y9d(str, this.X);
                        Bundle bundle = Bundle.EMPTY;
                        a98.K();
                        bm7 S0 = z88.isConnected() ? z88.S0(y9d2, bundle) : fm9.F(new sad(-100));
                        ? obj = new Object();
                        obj.a = str;
                        S0.d(new h76(S0, 0, obj), nk4.a);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ md8(ue ueVar, qh8 qh8, String str, Bundle bundle, a98 a98) {
        this.b = ueVar;
        this.o = str;
        this.X = bundle;
        this.c = a98;
    }
}
