package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;

/* renamed from: zf7  reason: default package */
public final class zf7 extends ffe implements a66 {
    public final /* synthetic */ bg7 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zf7(bg7 bg7, Continuation continuation) {
        super(2, continuation);
        this.X = bg7;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((zf7) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zf7(this.X, continuation);
    }

    /* JADX INFO: finally extract failed */
    public final Object o(Object obj) {
        od2.a0(obj);
        el3 el3 = (el3) ((je7) this.X.j).getValue();
        ir3 h = ((k24) ((c34) el3.f.get())).d.h();
        h.getClass();
        int i = 0;
        xlc a = xlc.a(0, "SELECT COUNT(*) FROM contact_title");
        ilc ilc = h.a;
        ilc.b();
        Cursor o = ilc.o(a, (CancellationSignal) null);
        try {
            if (o.moveToFirst()) {
                i = o.getInt(0);
            }
            o.close();
            a.n();
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                us7 us7 = us7.X;
                ir6.d(us7, "ContactController", "ContactController contacts.size=" + el3.a.size() + " titlesCount=" + i, (Throwable) null);
            }
            if (i < el3.a.size()) {
                try {
                    ((k24) ((c34) el3.f.get())).a();
                    el3.a.forEach(new s33(1, el3));
                    ((k24) ((c34) el3.f.get())).c();
                } finally {
                    ((k24) ((c34) el3.f.get())).b();
                }
            }
            return e5f.a;
        } catch (Throwable th) {
            o.close();
            a.n();
            throw th;
        }
    }
}
