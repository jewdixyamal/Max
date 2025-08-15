package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.io.Closeable;
import java.net.HttpURLConnection;

/* renamed from: k36  reason: default package */
public final class k36 implements Closeable {
    public static final String[] c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] o = new String[0];
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ k36(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void S() {
        ((SQLiteDatabase) this.b).endTransaction();
    }

    public void U(String str) {
        ((SQLiteDatabase) this.b).execSQL(str);
    }

    public final void close() {
        switch (this.a) {
            case 0:
                ((SQLiteDatabase) this.b).close();
                return;
            case 1:
                ((Cursor) this.b).close();
                return;
            default:
                ((HttpURLConnection) this.b).disconnect();
                return;
        }
    }

    public void e0(String str, Object[] objArr) {
        ((SQLiteDatabase) this.b).execSQL(str, objArr);
    }

    public boolean isOpen() {
        return ((SQLiteDatabase) this.b).isOpen();
    }

    public void m() {
        ((SQLiteDatabase) this.b).beginTransaction();
    }

    public boolean m0() {
        return ((SQLiteDatabase) this.b).inTransaction();
    }

    public void n() {
        ((SQLiteDatabase) this.b).beginTransactionNonExclusive();
    }

    public boolean n0() {
        return ((SQLiteDatabase) this.b).isWriteAheadLoggingEnabled();
    }

    public q36 o(String str) {
        return new q36(((SQLiteDatabase) this.b).compileStatement(str));
    }

    public Cursor o0(zde zde) {
        return ((SQLiteDatabase) this.b).rawQueryWithFactory(new i36(1, new j36(zde)), zde.m(), o, (String) null);
    }

    public Cursor p0(zde zde, CancellationSignal cancellationSignal) {
        String m = zde.m();
        String[] strArr = o;
        return ((SQLiteDatabase) this.b).rawQueryWithFactory(new i36(0, zde), m, strArr, (String) null, cancellationSignal);
    }

    public Cursor q0(String str) {
        return o0(new sy4(28, (Object) str));
    }

    public void r0() {
        ((SQLiteDatabase) this.b).setTransactionSuccessful();
    }

    public int s0(ContentValues contentValues, Object[] objArr) {
        if (contentValues.size() != 0) {
            int size = contentValues.size();
            int length = objArr.length + size;
            Object[] objArr2 = new Object[length];
            StringBuilder sb = new StringBuilder("UPDATE ");
            sb.append(c[3]);
            sb.append("WorkSpec SET ");
            int i = 0;
            for (String next : contentValues.keySet()) {
                sb.append(i > 0 ? "," : "");
                sb.append(next);
                objArr2[i] = contentValues.get(next);
                sb.append("=?");
                i++;
            }
            for (int i2 = size; i2 < length; i2++) {
                objArr2[i2] = objArr[i2 - size];
            }
            if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
            }
            q36 o2 = o(sb.toString());
            br7.g(o2, objArr2);
            return o2.b.executeUpdateDelete();
        }
        throw new IllegalArgumentException("Empty values".toString());
    }
}
