package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: fd5  reason: default package */
public final class fd5 {
    public final ilc a;
    public final sh b;
    public final th c;

    public fd5(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 7);
        this.c = new th(oneMeRoomDatabase, 18);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [tc5, java.lang.Object] */
    public static ArrayList b(long j, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ? obj = new Object();
            obj.a = ((Long) list.get(i)).longValue();
            obj.b = ((long) i) + j;
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final void a(List list) {
        ilc ilc = this.a;
        ilc.c();
        try {
            new qa3(new sa3(2, new ia4(2, this)), 0, new sa3(2, new ed5(this, b(0, list), 0))).a();
            ilc.r();
        } finally {
            ilc.l();
        }
    }

    public final ArrayList c() {
        xlc a2 = xlc.a(0, "SELECT id FROM favorite_sticker_sets ORDER BY `index` ASC");
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
}
