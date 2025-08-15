package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.inject.Provider;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: gqc  reason: default package */
public final class gqc implements h45, fhe, l33 {
    public static final i15 Y = new i15("proto");
    public final Provider X;
    public final puc a;
    public final d9f b;
    public final d9f c;
    public final ka0 o;

    public gqc(d9f d9f, d9f d9f2, ka0 ka0, puc puc, Provider provider) {
        this.a = puc;
        this.b = d9f;
        this.c = d9f2;
        this.o = ka0;
        this.X = provider;
    }

    public static String m0(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((fb0) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Long n(SQLiteDatabase sQLiteDatabase, hc0 hc0) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{hc0.a, String.valueOf(d9b.a(hc0.c))}));
        byte[] bArr = hc0.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public static Object n0(Cursor cursor, eqc eqc) {
        try {
            return eqc.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final ArrayList S(SQLiteDatabase sQLiteDatabase, hc0 hc0, int i) {
        ArrayList arrayList = new ArrayList();
        Long n = n(sQLiteDatabase, hc0);
        if (n == null) {
            return arrayList;
        }
        n0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", ApiProtocol.PARAM_PAYLOAD, "code", "inline"}, "context_id = ?", new String[]{n.toString()}, (String) null, (String) null, (String) null, String.valueOf(i)), new u00((Object) this, (Object) arrayList, (Object) hc0, 25));
        return arrayList;
    }

    public final void U(long j, rs7 rs7, String str) {
        o(new x72((Object) str, (Object) rs7, j, 10));
    }

    public final void close() {
        this.a.close();
    }

    public final Object e0(ehe ehe) {
        SQLiteDatabase m = m();
        d9f d9f = this.c;
        long a2 = d9f.a();
        while (true) {
            try {
                m.beginTransaction();
                try {
                    Object a3 = ehe.a();
                    m.setTransactionSuccessful();
                    return a3;
                } finally {
                    m.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (d9f.a() < ((long) this.o.c) + a2) {
                    SystemClock.sleep(50);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e);
                }
            }
        }
    }

    public final SQLiteDatabase m() {
        puc puc = this.a;
        Objects.requireNonNull(puc);
        d9f d9f = this.c;
        long a2 = d9f.a();
        while (true) {
            try {
                return puc.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (d9f.a() < ((long) this.o.c) + a2) {
                    SystemClock.sleep(50);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e);
                }
            }
        }
    }

    public final Object o(eqc eqc) {
        SQLiteDatabase m = m();
        m.beginTransaction();
        try {
            Object apply = eqc.apply(m);
            m.setTransactionSuccessful();
            return apply;
        } finally {
            m.endTransaction();
        }
    }
}
