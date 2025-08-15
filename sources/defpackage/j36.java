package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: j36  reason: default package */
public final class j36 extends rd7 implements e66 {
    public final /* synthetic */ zde a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j36(zde zde) {
        super(4);
        this.a = zde;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        this.a.S(new p36(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
