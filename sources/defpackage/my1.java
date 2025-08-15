package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* renamed from: my1  reason: default package */
public final class my1 extends ny1 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ s7g c;
    public final /* synthetic */ String o;

    public my1(s7g s7g, String str, boolean z) {
        this.c = s7g;
        this.o = str;
        this.X = z;
    }

    public final void c() {
        s7g s7g = this.c;
        WorkDatabase workDatabase = s7g.c;
        workDatabase.c();
        try {
            Iterator it = workDatabase.y().k(this.o).iterator();
            while (it.hasNext()) {
                ny1.b(s7g, (String) it.next());
            }
            workDatabase.r();
            workDatabase.l();
            if (this.X) {
                nuc.a(s7g.b, s7g.c, s7g.e);
            }
        } catch (Throwable th) {
            workDatabase.l();
            throw th;
        }
    }
}
