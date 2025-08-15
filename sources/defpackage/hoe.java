package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: hoe  reason: default package */
public final class hoe {
    public final ilc a;
    public final ct2 b;
    public final b46 c = new Object();
    public final zkc d;
    public final zkc e;
    public final zkc f;
    public final zkc g;
    public final zkc h;
    public final zkc i;

    /* JADX WARNING: type inference failed for: r0v0, types: [b46, java.lang.Object] */
    public hoe(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ct2(this, oneMeRoomDatabase, 2);
        new s19(this, oneMeRoomDatabase, 4);
        this.d = new zkc(oneMeRoomDatabase, 14);
        new zkc(oneMeRoomDatabase, 15);
        this.e = new zkc(oneMeRoomDatabase, 16);
        this.f = new zkc(oneMeRoomDatabase, 17);
        this.g = new zkc(oneMeRoomDatabase, 18);
        this.h = new zkc(oneMeRoomDatabase, 19);
        this.i = new zkc(oneMeRoomDatabase, 20);
    }

    public static void a(hoe hoe, long j) {
        hoe.c(j, goe.FAILED);
        ilc ilc = hoe.a;
        ilc.b();
        zkc zkc = hoe.f;
        q36 f2 = zkc.f();
        f2.j(1, j);
        try {
            ilc.c();
            f2.n();
            ilc.r();
            ilc.l();
            zkc.t(f2);
        } catch (Throwable th) {
            zkc.t(f2);
            throw th;
        }
    }

    public final ArrayList b(int i2, List list) {
        StringBuilder l = au1.l("SELECT id FROM tasks WHERE status in (");
        int size = list.size();
        a14.c(l, size);
        l.append(") LIMIT ");
        l.append("?");
        int i3 = size + 1;
        xlc a2 = xlc.a(i3, l.toString());
        Iterator it = list.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            this.c.getClass();
            a2.j(i4, (long) ((goe) it.next()).a);
            i4++;
        }
        a2.j(i3, (long) i2);
        ilc ilc = this.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(o.isNull(0) ? null : Long.valueOf(o.getLong(0)));
            }
            return arrayList;
        } finally {
            o.close();
            a2.n();
        }
    }

    public final void c(long j, goe goe) {
        ilc ilc = this.a;
        ilc.b();
        zkc zkc = this.d;
        q36 f2 = zkc.f();
        this.c.getClass();
        f2.j(1, (long) goe.a);
        f2.j(2, j);
        try {
            ilc.c();
            f2.n();
            ilc.r();
            ilc.l();
            zkc.t(f2);
        } catch (Throwable th) {
            zkc.t(f2);
            throw th;
        }
    }
}
