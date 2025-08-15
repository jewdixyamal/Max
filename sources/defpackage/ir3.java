package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: ir3  reason: default package */
public final class ir3 {
    public final ilc a;
    public final sh b;
    public final th c;
    public final th d;
    public final th e;
    public final th f;
    public final th g;
    public final th h;

    public ir3(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 3);
        this.c = new th(oneMeRoomDatabase, 9);
        this.d = new th(oneMeRoomDatabase, 10);
        this.e = new th(oneMeRoomDatabase, 11);
        this.f = new th(oneMeRoomDatabase, 12);
        this.g = new th(oneMeRoomDatabase, 13);
        this.h = new th(oneMeRoomDatabase, 14);
    }

    public static void a(ir3 ir3) {
        ilc ilc = ir3.a;
        ilc.b();
        th thVar = ir3.e;
        q36 f2 = thVar.f();
        try {
            ilc.c();
            f2.n();
            ilc.r();
            ilc.l();
            thVar.t(f2);
            ilc.b();
            th thVar2 = ir3.h;
            q36 f3 = thVar2.f();
            try {
                ilc.c();
                f3.n();
                ilc.r();
                ilc.l();
                thVar2.t(f3);
            } catch (Throwable th) {
                thVar2.t(f3);
                throw th;
            }
        } catch (Throwable th2) {
            thVar.t(f2);
            throw th2;
        }
    }

    public final void b(String str, String str2, String str3, String str4, String str5, long j) {
        ilc ilc = this.a;
        ilc.b();
        th thVar = this.f;
        q36 f2 = thVar.f();
        f2.j(1, j);
        if (str == null) {
            f2.W(2);
        } else {
            f2.f(2, str);
        }
        if (str2 == null) {
            f2.W(3);
        } else {
            f2.f(3, str2);
        }
        if (str3 == null) {
            f2.W(4);
        } else {
            f2.f(4, str3);
        }
        if (str4 == null) {
            f2.W(5);
        } else {
            f2.f(5, str4);
        }
        if (str5 == null) {
            f2.W(6);
        } else {
            f2.f(6, str5);
        }
        try {
            ilc.c();
            f2.m();
            ilc.r();
            ilc.l();
            thVar.t(f2);
        } catch (Throwable th) {
            thVar.t(f2);
            throw th;
        }
    }

    public final void c(pl3 pl3, ConcurrentHashMap concurrentHashMap) {
        long j = pl3.a;
        if (pl3.j != 0) {
            ilc ilc = this.a;
            ilc.b();
            th thVar = this.g;
            q36 f2 = thVar.f();
            f2.j(1, j);
            try {
                ilc.c();
                f2.n();
                ilc.r();
                ilc.l();
                thVar.t(f2);
            } catch (Throwable th) {
                thVar.t(f2);
                throw th;
            }
        } else {
            Object obj = concurrentHashMap.get(Long.valueOf(j));
            List list = pl3.f;
            if (!(obj == null ? false : obj.equals(Integer.valueOf(list.hashCode())))) {
                concurrentHashMap.remove(Long.valueOf(j));
                qec qec = g56.a;
                e56 b2 = g56.b(list);
                if (b2 != null) {
                    String c2 = bre.c(pl3.p);
                    if (oag.t(c2)) {
                        c2 = "";
                    }
                    String k = b0d.k(c2);
                    String str = null;
                    e56 e56 = b2.c;
                    String str2 = e56 != null ? e56.a : null;
                    if (e56 != null) {
                        str = e56.b;
                    }
                    b(k, b2.a, b2.b, str2, str, j);
                    concurrentHashMap.put(Long.valueOf(j), Integer.valueOf(list.hashCode()));
                }
            }
        }
    }
}
