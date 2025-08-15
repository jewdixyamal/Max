package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* renamed from: ly1  reason: default package */
public final class ly1 extends ny1 {
    public final /* synthetic */ s7g c;
    public final /* synthetic */ UUID o;

    public ly1(s7g s7g, UUID uuid) {
        this.c = s7g;
        this.o = uuid;
    }

    /* JADX INFO: finally extract failed */
    public final void c() {
        s7g s7g = this.c;
        WorkDatabase workDatabase = s7g.c;
        workDatabase.c();
        try {
            ny1.b(s7g, this.o.toString());
            workDatabase.r();
            workDatabase.l();
            nuc.a(s7g.b, s7g.c, s7g.e);
        } catch (Throwable th) {
            workDatabase.l();
            throw th;
        }
    }
}
