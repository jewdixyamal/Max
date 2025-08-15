package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: od5  reason: default package */
public final class od5 {
    public final ilc a;
    public final sh b;
    public final th c;

    public od5(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 8);
        this.c = new th(oneMeRoomDatabase, 19);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [ac5, java.lang.Object] */
    public static ArrayList b(int i, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            ? obj = new Object();
            obj.a = ((Long) list.get(i2)).longValue();
            obj.b = (long) (i + i2);
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final void a(List list) {
        ilc ilc = this.a;
        ilc.c();
        try {
            new qa3(new sa3(2, new ia4(3, this)), 0, new sa3(2, new nd5(this, b(0, list), 0))).a();
            ilc.r();
        } finally {
            ilc.l();
        }
    }

    public final ArrayList c() {
        xlc a2 = xlc.a(0, "SELECT id FROM favorite_stickers ORDER BY `index` ASC");
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
