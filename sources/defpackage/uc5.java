package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.concurrent.Callable;

/* renamed from: uc5  reason: default package */
public final /* synthetic */ class uc5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fd5 b;

    public /* synthetic */ uc5(fd5 fd5, int i) {
        this.a = i;
        this.b = fd5;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        int i = this.a;
        fd5 fd5 = this.b;
        switch (i) {
            case 0:
                fd5.getClass();
                xlc a2 = xlc.a(0, "SELECT COUNT(*) FROM favorite_sticker_sets");
                ilc ilc = fd5.a;
                ilc.b();
                Cursor o = ilc.o(a2, (CancellationSignal) null);
                try {
                    long j = o.moveToFirst() ? o.getLong(0) : 0;
                    o.close();
                    a2.n();
                    return Long.valueOf(j);
                } catch (Throwable th) {
                    o.close();
                    a2.n();
                    throw th;
                }
            default:
                return fd5.c();
        }
    }
}
