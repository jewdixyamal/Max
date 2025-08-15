package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: wlc  reason: default package */
public final class wlc {
    public final jlc a;
    public final khe b = new khe(new lwa(17, this));

    public wlc(jlc jlc) {
        this.a = jlc;
    }

    public static xua b(wlc wlc, wua wua) {
        wlc.getClass();
        return new xua(wua.b, wua.c, wua.o, wua.X, wua.Y, wua.Z, wua.s0, wua.t0, wua.u0, wua.v0);
    }

    public static wua d(xua xua) {
        long j = xua.a;
        int s = au1.s(xua.j);
        return new wua(j, xua.b, xua.c, xua.d, xua.e, xua.f, xua.g, xua.h, xua.i, s);
    }

    public final void a() {
        rva c = c();
        ilc ilc = c.a;
        ilc.b();
        p19 p19 = c.e;
        q36 f = p19.f();
        try {
            ilc.c();
            f.n();
            ilc.r();
            ilc.l();
            p19.t(f);
        } catch (Throwable th) {
            p19.t(f);
            throw th;
        }
    }

    public final rva c() {
        return (rva) this.b.getValue();
    }

    /* JADX INFO: finally extract failed */
    public final ArrayList e() {
        rva c = c();
        c.getClass();
        xlc a2 = xlc.a(0, "SELECT * FROM phones");
        ilc ilc = c.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "phonebook_id");
            int n3 = tfg.n(o, "contact_id");
            int n4 = tfg.n(o, "phone");
            int n5 = tfg.n(o, "server_phone");
            int n6 = tfg.n(o, "email");
            int n7 = tfg.n(o, "first_name");
            int n8 = tfg.n(o, "last_name");
            int n9 = tfg.n(o, "avatar_path");
            int n10 = tfg.n(o, "type");
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(new xua(o.getLong(n), o.getLong(n2), o.getInt(n3), o.isNull(n4) ? null : o.getString(n4), o.getLong(n5), o.isNull(n6) ? null : o.getString(n6), o.isNull(n7) ? null : o.getString(n7), o.isNull(n8) ? null : o.getString(n8), o.isNull(n9) ? null : o.getString(n9), ey8.b(o.getInt(n10))));
            }
            o.close();
            a2.n();
            ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(d((xua) it.next()));
            }
            return arrayList2;
        } catch (Throwable th) {
            o.close();
            a2.n();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final ArrayList f(List list) {
        rva c = c();
        c.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM phones WHERE server_phone in (");
        int size = list.size();
        a14.c(sb, size);
        sb.append(")");
        xlc a2 = xlc.a(size, sb.toString());
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            Long l = (Long) it.next();
            if (l == null) {
                a2.W(i);
            } else {
                a2.j(i, l.longValue());
            }
            i++;
        }
        ilc ilc = c.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "phonebook_id");
            int n3 = tfg.n(o, "contact_id");
            int n4 = tfg.n(o, "phone");
            int n5 = tfg.n(o, "server_phone");
            int n6 = tfg.n(o, "email");
            int n7 = tfg.n(o, "first_name");
            int n8 = tfg.n(o, "last_name");
            int n9 = tfg.n(o, "avatar_path");
            int n10 = tfg.n(o, "type");
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(new xua(o.getLong(n), o.getLong(n2), o.getInt(n3), o.isNull(n4) ? null : o.getString(n4), o.getLong(n5), o.isNull(n6) ? null : o.getString(n6), o.isNull(n7) ? null : o.getString(n7), o.isNull(n8) ? null : o.getString(n8), o.isNull(n9) ? null : o.getString(n9), ey8.b(o.getInt(n10))));
            }
            o.close();
            a2.n();
            ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(d((xua) it2.next()));
            }
            return arrayList2;
        } catch (Throwable th) {
            o.close();
            a2.n();
            throw th;
        }
    }
}
