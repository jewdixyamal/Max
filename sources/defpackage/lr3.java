package defpackage;

import android.os.Bundle;

/* renamed from: lr3  reason: default package */
public final class lr3 implements b64 {
    public final /* synthetic */ int a;
    public final je7 b;

    public /* synthetic */ lr3(int i, je7 je7) {
        this.a = i;
        this.b = je7;
    }

    public final i64 a() {
        switch (this.a) {
            case 0:
                return mr3.b;
            default:
                return (ex7) this.b.getValue();
        }
    }

    public final l64 b(String str, e64 e64, Bundle bundle) {
        i iVar;
        switch (this.a) {
            case 0:
                if (!mr3.b.a.contains(e64)) {
                    return null;
                }
                if (e64.equals(mr3.c)) {
                    iVar = new i(8);
                } else if (e64.equals(mr3.d)) {
                    iVar = new lq(1, this);
                } else if (e64.equals(mr3.e)) {
                    return new l64(str, e64, bundle, 0, (j64) null, new i(9), 24);
                } else {
                    throw new IllegalStateException(au1.f("unknown route ", e64));
                }
                return new l64(str, e64, bundle, 3, (j64) null, iVar, 16);
            default:
                if (!((ex7) this.b.getValue()).a.contains(e64)) {
                    return null;
                }
                ex7.b.getClass();
                if (e64.equals(ex7.c) || e64.equals(ex7.d) || e64.equals(ex7.e) || e64.equals(ex7.f)) {
                    return new l64(str, e64, bundle, 0, (j64) null, new dx7(e64, bundle), 24);
                }
                throw new IllegalStateException(au1.f("unknown route ", e64));
        }
    }
}
