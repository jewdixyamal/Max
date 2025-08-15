package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: th0  reason: default package */
public abstract class th0 extends ol implements lme, hua {
    public final int o;

    public th0(long j, int i) {
        super(j);
        this.o = i;
    }

    /* JADX INFO: finally extract failed */
    public final int c() {
        b46 b46;
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        eoe e = plVar.e();
        List M = y53.M(iua.TYPE_ASSETS_ADD, iua.TYPE_ASSETS_REMOVE, iua.TYPE_ASSETS_MOVE, iua.TYPE_ASSETS_LIST_MODIFY);
        jmc jmc = ((k24) ((c34) e.a.get())).f;
        hoe b = jmc.b();
        b.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM tasks WHERE type in (");
        int size = M.size();
        a14.c(sb, size);
        sb.append(")");
        xlc a = xlc.a(size, sb.toString());
        Iterator it = M.iterator();
        int i = 1;
        while (true) {
            boolean hasNext = it.hasNext();
            b46 = b.c;
            if (!hasNext) {
                break;
            }
            b46.getClass();
            a.j(i, (long) ((iua) it.next()).a);
            i++;
        }
        ilc ilc = b.a;
        ilc.b();
        Cursor o2 = ilc.o(a, (CancellationSignal) null);
        try {
            int n = tfg.n(o2, "id");
            int n2 = tfg.n(o2, "type");
            int n3 = tfg.n(o2, "status");
            int n4 = tfg.n(o2, "fails_count");
            int n5 = tfg.n(o2, "depends_request_id");
            int n6 = tfg.n(o2, "dependency_type");
            int n7 = tfg.n(o2, "data");
            int n8 = tfg.n(o2, "created_time");
            ArrayList arrayList = new ArrayList(o2.getCount());
            while (o2.moveToNext()) {
                long j = o2.getLong(n);
                int i2 = o2.getInt(n2);
                b46.getClass();
                arrayList.add(new vne(j, b46.t(i2), b46.r(o2.getInt(n3)), o2.getInt(n4), o2.getLong(n5), o2.getInt(n6), o2.isNull(n7) ? null : o2.getBlob(n7), o2.getLong(n8)));
            }
            o2.close();
            a.n();
            List c = jmc.c(arrayList);
            Iterator it2 = c.iterator();
            while (true) {
                boolean hasNext2 = it2.hasNext();
                long j2 = this.a;
                if (!hasNext2) {
                    return ((une) c.get(0)).a != j2 ? 2 : 1;
                }
                une une = (une) it2.next();
                if (une.a == j2 && (une.f instanceof hu)) {
                    return 3;
                }
            }
        } catch (Throwable th) {
            o2.close();
            a.n();
            throw th;
        }
    }

    public final void d() {
        int i = this.o;
        int s = au1.s(i);
        pl plVar = null;
        if (s == 3) {
            pl plVar2 = this.c;
            if (plVar2 == null) {
                plVar2 = null;
            }
            ((md5) plVar2.p.getValue()).c();
        } else if (s != 4) {
            hm9.m0(getClass().getName(), "unsuspporeted type ".concat(au1.t(i)), new Object[0]);
        } else {
            pl plVar3 = this.c;
            if (plVar3 == null) {
                plVar3 = null;
            }
            ((sc5) plVar3.q.getValue()).f();
        }
        pl plVar4 = this.c;
        if (plVar4 != null) {
            plVar = plVar4;
        }
        plVar.e().d(this.a);
    }

    public final void e(gle gle) {
        pl plVar = this.c;
        pl plVar2 = null;
        if (plVar == null) {
            plVar = null;
        }
        if (plVar.e().b(y53.M(iua.TYPE_ASSETS_ADD, iua.TYPE_ASSETS_REMOVE, iua.TYPE_ASSETS_MOVE, iua.TYPE_ASSETS_LIST_MODIFY)) > 1) {
            pl plVar3 = this.c;
            if (plVar3 != null) {
                plVar2 = plVar3;
            }
            r9d.y((s8g) plVar2.g.getValue());
        }
        u(gle);
    }

    public final void g(pke pke) {
        if (!f46.U(pke.b)) {
            d();
            pl plVar = this.c;
            if (plVar == null) {
                plVar = null;
            }
            plVar.b().c(new oi0(this.a, pke));
        }
    }

    public final long getId() {
        return this.a;
    }

    public final int h() {
        return 10;
    }

    public abstract void u(gle gle);

    public final void v(long j) {
        pl plVar = null;
        int i = this.o;
        if (i == 4) {
            pl plVar2 = this.c;
            if (plVar2 != null) {
                plVar = plVar2;
            }
            ((md5) plVar.p.getValue()).f(j);
        } else if (i == 5) {
            pl plVar3 = this.c;
            if (plVar3 != null) {
                plVar = plVar3;
            }
            ((sc5) plVar.q.getValue()).g(j);
        }
    }
}
