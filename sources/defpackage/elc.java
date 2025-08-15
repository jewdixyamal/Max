package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: elc  reason: default package */
public final class elc {
    public static final ye4 g = new ye4(16);
    public final jlc a;
    public final khe b = new khe(new blc(this, 0));
    public final khe c = new khe(new blc(this, 1));
    public final khe d = new khe(new blc(this, 2));
    public final je7 e;
    public final khe f;

    public elc(jlc jlc, je7 je7) {
        this.a = jlc;
        this.e = je7;
        this.f = new khe(bv3.v0);
    }

    public final l92 a(la2 la2) {
        ConcurrentHashMap concurrentHashMap = ((d56) this.f.getValue()).a;
        long j = la2.a;
        k92 k92 = la2.c;
        String str = k92.g;
        if (str != null) {
            concurrentHashMap.put(Long.valueOf(j), str);
        }
        return new l92(la2.a, k92);
    }

    /* JADX INFO: finally extract failed */
    public final void b() {
        dt2 c2 = c();
        ilc ilc = c2.a;
        ilc.c();
        try {
            dt2.b(c2);
            ilc.r();
            ilc.l();
            ((d56) this.f.getValue()).a.clear();
            xrc d2 = d();
            ilc ilc2 = d2.a;
            ilc2.b();
            zkc zkc = d2.d;
            q36 f2 = zkc.f();
            try {
                ilc2.c();
                f2.n();
                ilc2.r();
                ilc2.l();
                zkc.t(f2);
            } catch (Throwable th) {
                zkc.t(f2);
                throw th;
            }
        } catch (Throwable th2) {
            ilc.l();
            throw th2;
        }
    }

    public final dt2 c() {
        return (dt2) this.b.getValue();
    }

    public final xrc d() {
        return (xrc) this.c.getValue();
    }

    public final long e(k92 k92) {
        return ((Number) ((OneMeRoomDatabase) this.a.m()).p(new dlc(0, new zja(this, 12, k92)))).longValue();
    }

    public final l92 f(long j) {
        la2 la2;
        dt2 c2 = c();
        c2.getClass();
        xlc a2 = xlc.a(1, "SELECT * FROM chats WHERE server_id = ?");
        a2.j(1, j);
        ilc ilc = c2.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "server_id");
            int n3 = tfg.n(o, "data");
            int n4 = tfg.n(o, "favourite_index");
            int n5 = tfg.n(o, "sort_time");
            int n6 = tfg.n(o, "cid");
            if (o.moveToFirst()) {
                la2 = new la2(o.getLong(n), o.getLong(n2), c2.a().a(o.isNull(n3) ? null : o.getBlob(n3)), o.getLong(n4), o.getLong(n5), o.getLong(n6));
            } else {
                la2 = null;
            }
            if (la2 != null) {
                return a(la2);
            }
            return null;
        } finally {
            o.close();
            a2.n();
        }
    }

    /* JADX INFO: finally extract failed */
    public final l92 g(long j) {
        Object obj;
        dt2 c2 = c();
        c2.getClass();
        xlc a2 = xlc.a(1, "SELECT * FROM chats WHERE cid = ?");
        a2.j(1, j);
        ilc ilc = c2.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "server_id");
            int n3 = tfg.n(o, "data");
            int n4 = tfg.n(o, "favourite_index");
            int n5 = tfg.n(o, "sort_time");
            int n6 = tfg.n(o, "cid");
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(new la2(o.getLong(n), o.getLong(n2), c2.a().a(o.isNull(n3) ? null : o.getBlob(n3)), o.getLong(n4), o.getLong(n5), o.getLong(n6)));
            }
            o.close();
            a2.n();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((la2) obj).c.b == j92.a) {
                    break;
                }
            }
            la2 la2 = (la2) obj;
            if (la2 != null) {
                return a(la2);
            }
            return null;
        } catch (Throwable th) {
            o.close();
            a2.n();
            throw th;
        }
    }

    public final void h(long j, k92 k92) {
        k92 k922 = k92;
        long d2 = c().d(new la2(j, k922.a, k92, k92.a().e, lz7.k(((t19) this.d.getValue()).k(k922.j), k922), k922.l), ((d56) this.f.getValue()).a);
        je7 je7 = this.e;
        if (k922.f(((wxc) je7.getValue()).a())) {
            d().b(((wxc) je7.getValue()).a(), d2);
        }
    }
}
