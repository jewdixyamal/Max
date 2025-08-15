package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: rva  reason: default package */
public final class rva {
    public final ilc a;
    public final sh b;
    public final ha4 c;
    public final p19 d;
    public final p19 e;
    public final p19 f;

    public rva(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 15);
        this.c = new ha4(oneMeRoomDatabase, 3);
        this.d = new p19(oneMeRoomDatabase, 19);
        this.e = new p19(oneMeRoomDatabase, 20);
        this.f = new p19(oneMeRoomDatabase, 21);
    }

    public static void a(rva rva, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            ilc ilc = rva.a;
            ilc.b();
            p19 p19 = rva.f;
            q36 f2 = p19.f();
            f2.j(1, longValue);
            try {
                ilc.c();
                f2.n();
                ilc.r();
                ilc.l();
                p19.t(f2);
            } catch (Throwable th) {
                p19.t(f2);
                throw th;
            }
        }
    }
}
