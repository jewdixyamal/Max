package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.concurrent.Callable;

/* renamed from: dc5  reason: default package */
public final /* synthetic */ class dc5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ od5 b;

    public /* synthetic */ dc5(od5 od5, int i) {
        this.a = i;
        this.b = od5;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        int i = this.a;
        od5 od5 = this.b;
        switch (i) {
            case 0:
                od5.getClass();
                xlc a2 = xlc.a(0, "SELECT COUNT(*) FROM favorite_stickers");
                ilc ilc = od5.a;
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
                return od5.c();
        }
    }
}
