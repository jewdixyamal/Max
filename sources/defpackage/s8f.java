package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: s8f  reason: default package */
public final /* synthetic */ class s8f implements ehe {
    public final /* synthetic */ int a;
    public final /* synthetic */ t8f b;
    public final /* synthetic */ hc0 c;

    public /* synthetic */ s8f(t8f t8f, hc0 hc0, int i) {
        this.a = i;
        this.b = t8f;
        this.c = hc0;
    }

    public final Object a() {
        Boolean bool;
        Cursor rawQuery;
        switch (this.a) {
            case 0:
                hc0 hc0 = this.c;
                gqc gqc = (gqc) this.b.c;
                SQLiteDatabase m = gqc.m();
                m.beginTransaction();
                try {
                    Long n = gqc.n(m, hc0);
                    if (n == null) {
                        bool = Boolean.FALSE;
                    } else {
                        rawQuery = gqc.m().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{n.toString()});
                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                        rawQuery.close();
                        bool = valueOf;
                    }
                    m.setTransactionSuccessful();
                    m.endTransaction();
                    return bool;
                } catch (Throwable th) {
                    m.endTransaction();
                    throw th;
                }
            default:
                gqc gqc2 = (gqc) this.b.c;
                gqc2.getClass();
                return (Iterable) gqc2.o(new ypc(gqc2, 1, this.c));
        }
    }
}
