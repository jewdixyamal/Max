package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.List;

/* renamed from: vc5  reason: default package */
public final /* synthetic */ class vc5 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fd5 b;
    public final /* synthetic */ List c;

    public /* synthetic */ vc5(fd5 fd5, List list, int i) {
        this.a = i;
        this.b = fd5;
        this.c = list;
    }

    public final void run() {
        xlc a2;
        Cursor o;
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                return;
            default:
                List list = this.c;
                fd5 fd5 = this.b;
                ilc ilc = fd5.a;
                ilc.c();
                try {
                    fd5.getClass();
                    int i = 0;
                    a2 = xlc.a(0, "SELECT MAX(`index`) FROM favorite_sticker_sets");
                    ilc ilc2 = fd5.a;
                    ilc2.b();
                    o = ilc2.o(a2, (CancellationSignal) null);
                    if (o.moveToFirst()) {
                        i = o.getInt(0);
                    }
                    o.close();
                    a2.n();
                    fd5.b((long) (i + 1), list);
                    ilc.r();
                    ilc.l();
                    return;
                } catch (Throwable th) {
                    ilc.l();
                    throw th;
                }
        }
    }
}
