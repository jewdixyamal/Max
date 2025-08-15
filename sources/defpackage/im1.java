package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: im1  reason: default package */
public final /* synthetic */ class im1 implements m56 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ im1(kw9 kw9, qv9 qv9) {
        this.c = kw9;
        this.o = qv9;
        this.b = false;
    }

    /* JADX INFO: finally extract failed */
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Boolean) obj).getClass();
                mm1.y(this.b, (mm1) this.c, (List) this.o);
                return e5f.a;
            default:
                Continuation continuation = (Continuation) obj;
                kw9 kw9 = (kw9) this.c;
                kw9.getClass();
                qv9 qv9 = (qv9) this.o;
                long j = qv9.a;
                xlc a2 = xlc.a(1, "SELECT * FROM notifications_read_marks WHERE chat_id = ?");
                a2.j(1, j);
                ilc ilc = kw9.a;
                ilc.b();
                qv9 qv92 = null;
                Cursor o2 = ilc.o(a2, (CancellationSignal) null);
                try {
                    int n = tfg.n(o2, "chat_id");
                    int n2 = tfg.n(o2, "mark");
                    if (o2.moveToFirst()) {
                        qv92 = new qv9(o2.getLong(n), o2.getLong(n2));
                    }
                    if (qv92 != null) {
                        int i = (qv92.b > qv9.b ? 1 : (qv92.b == qv9.b ? 0 : -1));
                        if (i == 0) {
                            return Boolean.FALSE;
                        }
                        if (i > 0 && !this.b) {
                            return Boolean.FALSE;
                        }
                    }
                    ilc.b();
                    ilc.c();
                    try {
                        kw9.b.C(qv9);
                        ilc.r();
                        ilc.l();
                        return Boolean.TRUE;
                    } catch (Throwable th) {
                        ilc.l();
                        throw th;
                    }
                } finally {
                    o2.close();
                    a2.n();
                }
        }
    }

    public /* synthetic */ im1(boolean z, mm1 mm1, List list) {
        this.b = z;
        this.c = mm1;
        this.o = list;
    }
}
