package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: eoe  reason: default package */
public final class eoe {
    public static final List d = Arrays.asList(new goe[]{goe.PROCESSING, goe.WAITING});
    public final rm4 a;
    public final o45 b;
    public final xpb c = new xpb();

    public eoe(rm4 rm4, o45 o45) {
        this.a = rm4;
        this.b = o45;
    }

    public final db3 a(List list) {
        hm9.m("eoe", "awaitNoTasksByTypes: types=%s", list);
        return new qa3(new rqd(new q1a(2, new u24(this, 7, list)), new z72(28, list), 2).h(new hme(5)), 2, new doe(this, list)).f(new ic5(7, list));
    }

    public final long b(List list) {
        hoe b2 = ((k24) ((c34) this.a.get())).f.b();
        b2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT COUNT(*) FROM tasks where type in (");
        int size = list.size();
        a14.c(sb, size);
        sb.append(")");
        xlc a2 = xlc.a(size, sb.toString());
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            b2.c.getClass();
            a2.j(i, (long) ((iua) it.next()).a);
            i++;
        }
        ilc ilc = b2.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            return o.moveToFirst() ? o.getLong(0) : 0;
        } finally {
            o.close();
            a2.n();
        }
    }

    public final void c(long j) {
        hoe b2 = ((k24) ((c34) this.a.get())).f.b();
        ilc ilc = b2.a;
        ilc.c();
        try {
            hoe.a(b2, j);
            ilc.r();
        } finally {
            ilc.l();
        }
    }

    public final void d(long j) {
        hm9.m("eoe", "remove task = " + j, new Object[0]);
        ((k24) ((c34) this.a.get())).f.a(j);
        this.c.e(Boolean.TRUE);
    }

    /* JADX INFO: finally extract failed */
    public final void e(AbstractCollection abstractCollection) {
        hm9.m("eoe", "remove tasks %d", Integer.valueOf(abstractCollection.size()));
        if (!nd7.D(abstractCollection)) {
            ilc ilc = ((k24) ((c34) this.a.get())).f.b().a;
            ilc.b();
            StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM tasks WHERE id in (");
            a14.c(sb, abstractCollection.size());
            sb.append(")");
            q36 d2 = ilc.d(sb.toString());
            Iterator it = abstractCollection.iterator();
            int i = 1;
            while (it.hasNext()) {
                Long l = (Long) it.next();
                if (l == null) {
                    d2.W(i);
                } else {
                    d2.j(i, l.longValue());
                }
                i++;
            }
            ilc.c();
            try {
                d2.n();
                ilc.r();
                ilc.l();
                this.c.e(Boolean.TRUE);
            } catch (Throwable th) {
                ilc.l();
                throw th;
            }
        }
    }

    public final void f() {
        hm9.m("eoe", "remove tasks by type = %d", iua.TYPE_SYNC_CHAT_HISTORY);
        hoe b2 = ((k24) ((c34) this.a.get())).f.b();
        ilc ilc = b2.a;
        ilc.b();
        zkc zkc = b2.i;
        q36 f = zkc.f();
        b2.c.getClass();
        f.j(1, (long) 12);
        try {
            ilc.c();
            f.n();
            ilc.r();
            ilc.l();
            zkc.t(f);
            this.c.e(Boolean.TRUE);
        } catch (Throwable th) {
            zkc.t(f);
            throw th;
        }
    }

    public final void g(hua hua, long j, int i) {
        StringBuilder sb = new StringBuilder("save task = ");
        hua hua2 = hua;
        sb.append(hua);
        hm9.m("eoe", sb.toString(), new Object[0]);
        hoe b2 = ((k24) ((c34) this.a.get())).f.b();
        vne vne = new vne(hua.getId(), hua.getType(), goe.WAITING, 0, j, i, hua.f(), System.currentTimeMillis());
        ilc ilc = b2.a;
        ilc.b();
        ilc.c();
        try {
            b2.b.D(vne);
            ilc.r();
        } finally {
            ilc.l();
        }
    }

    /* JADX INFO: finally extract failed */
    public final List h(long j, iua iua) {
        jmc jmc = ((k24) ((c34) this.a.get())).f;
        hoe b2 = jmc.b();
        b2.getClass();
        xlc a2 = xlc.a(2, "SELECT * FROM tasks WHERE id > ? AND type = ?");
        a2.j(1, j);
        b2.c.getClass();
        a2.j(2, (long) iua.a);
        ilc ilc = b2.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "type");
            int n3 = tfg.n(o, "status");
            int n4 = tfg.n(o, "fails_count");
            int n5 = tfg.n(o, "depends_request_id");
            int n6 = tfg.n(o, "dependency_type");
            int n7 = tfg.n(o, "data");
            int n8 = tfg.n(o, "created_time");
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(new vne(o.getLong(n), b46.t(o.getInt(n2)), b46.r(o.getInt(n3)), o.getInt(n4), o.getLong(n5), o.getInt(n6), o.isNull(n7) ? null : o.getBlob(n7), o.getLong(n8)));
            }
            o.close();
            a2.n();
            return jmc.c(arrayList);
        } catch (Throwable th) {
            o.close();
            a2.n();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final List i(Collection collection) {
        b46 b46;
        jmc jmc = ((k24) ((c34) this.a.get())).f;
        hoe b2 = jmc.b();
        b2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM tasks WHERE type in (");
        int size = collection.size();
        a14.c(sb, size);
        sb.append(") AND status in (");
        List<goe> list = d;
        int size2 = list.size();
        a14.c(sb, size2);
        sb.append(")");
        xlc a2 = xlc.a(size2 + size, sb.toString());
        Iterator it = collection.iterator();
        int i = 1;
        while (true) {
            boolean hasNext = it.hasNext();
            b46 = b2.c;
            if (!hasNext) {
                break;
            }
            b46.getClass();
            a2.j(i, (long) ((iua) it.next()).a);
            i++;
        }
        int i2 = size + 1;
        for (goe goe : list) {
            b46.getClass();
            a2.j(i2, (long) goe.a);
            i2++;
        }
        ilc ilc = b2.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "type");
            int n3 = tfg.n(o, "status");
            int n4 = tfg.n(o, "fails_count");
            int n5 = tfg.n(o, "depends_request_id");
            int n6 = tfg.n(o, "dependency_type");
            int n7 = tfg.n(o, "data");
            int n8 = tfg.n(o, "created_time");
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                long j = o.getLong(n);
                int i3 = o.getInt(n2);
                b46.getClass();
                arrayList.add(new vne(j, b46.t(i3), b46.r(o.getInt(n3)), o.getInt(n4), o.getLong(n5), o.getInt(n6), o.isNull(n7) ? null : o.getBlob(n7), o.getLong(n8)));
            }
            o.close();
            a2.n();
            return jmc.c(arrayList);
        } catch (Throwable th) {
            o.close();
            a2.n();
            throw th;
        }
    }

    public final une j(long j) {
        xlc a2;
        Cursor o;
        iua iua;
        rm4 rm4 = this.a;
        try {
            return ((k24) ((c34) rm4.get())).f.e(j);
        } catch (Exception e) {
            hoe b2 = ((k24) ((c34) rm4.get())).f.b();
            b2.getClass();
            a2 = xlc.a(1, "SELECT type FROM tasks WHERE id = ?");
            a2.j(1, j);
            ilc ilc = b2.a;
            ilc.b();
            o = ilc.o(a2, (CancellationSignal) null);
            if (o.moveToFirst()) {
                int i = o.getInt(0);
                b2.c.getClass();
                iua = b46.t(i);
            } else {
                iua = null;
            }
            o.close();
            a2.n();
            hm9.k0("eoe", (Exception) null, "selectTask: id=%d; type=%d; exception=%s", Arrays.copyOf(new Object[]{Long.valueOf(j), iua, e.getMessage()}, 3));
            ((cba) this.b).c(new Exception("Can't select task with type=" + iua + "; exception= " + e.getMessage()), true);
            return null;
        } catch (Throwable th) {
            o.close();
            a2.n();
            throw th;
        }
    }

    public final int k() {
        hoe b2 = ((k24) ((c34) this.a.get())).f.b();
        List<goe> M = y53.M(goe.WAITING, goe.FAILED);
        b2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT COUNT(*) FROM tasks WHERE status in (");
        int size = M.size();
        a14.c(sb, size);
        sb.append(")");
        xlc a2 = xlc.a(size, sb.toString());
        int i = 1;
        for (goe goe : M) {
            b2.c.getClass();
            a2.j(i, (long) goe.a);
            i++;
        }
        ilc ilc = b2.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            int i2 = 0;
            if (o.moveToFirst()) {
                i2 = o.getInt(0);
            }
            return i2;
        } finally {
            o.close();
            a2.n();
        }
    }

    public final ArrayList l() {
        return ((k24) ((c34) this.a.get())).f.b().b(Integer.MAX_VALUE, y53.M(goe.WAITING, goe.FAILED));
    }

    public final ArrayList m() {
        b46 b46;
        hoe b2 = ((k24) ((c34) this.a.get())).f.b();
        List M = y53.M(goe.WAITING, goe.FAILED);
        b2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT type, COUNT(*) as count FROM tasks WHERE status in (");
        int size = M.size();
        a14.c(sb, size);
        sb.append(") GROUP BY type");
        xlc a2 = xlc.a(size, sb.toString());
        Iterator it = M.iterator();
        int i = 1;
        while (true) {
            boolean hasNext = it.hasNext();
            b46 = b2.c;
            if (!hasNext) {
                break;
            }
            b46.getClass();
            a2.j(i, (long) ((goe) it.next()).a);
            i++;
        }
        ilc ilc = b2.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                int i2 = o.getInt(0);
                b46.getClass();
                arrayList.add(new tne(b46.t(i2), o.getInt(1)));
            }
            return arrayList;
        } finally {
            o.close();
            a2.n();
        }
    }

    public final void n(long j, goe goe) {
        ((k24) ((c34) this.a.get())).f.b().c(j, goe);
    }
}
