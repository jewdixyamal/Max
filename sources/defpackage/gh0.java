package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;

/* renamed from: gh0  reason: default package */
public final class gh0 extends ffe implements a66 {
    public final /* synthetic */ jh0 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gh0(jh0 jh0, Continuation continuation) {
        super(2, continuation);
        this.X = jh0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gh0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gh0(this.X, continuation);
    }

    /* JADX INFO: finally extract failed */
    public final Object o(Object obj) {
        od2.a0(obj);
        rva c = ((wlc) ((xc4) this.X.c.getValue()).a.getValue()).c();
        c.getClass();
        boolean z = false;
        xlc a = xlc.a(0, "SELECT COUNT(*) FROM phones");
        ilc ilc = c.a;
        ilc.b();
        Cursor o = ilc.o(a, (CancellationSignal) null);
        try {
            long j = o.moveToFirst() ? o.getLong(0) : 0;
            o.close();
            a.n();
            if (j == 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            o.close();
            a.n();
            throw th;
        }
    }
}
