package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: q94  reason: default package */
public final class q94 implements d9g {
    public static final String d = g(3, 4);
    public static final String[] e = {"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    public final e34 a;
    public final Object b = new Object();
    public boolean c;

    public q94(e34 e34) {
        this.a = e34;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        int i = oaf.a;
        for (String split : str.split(",", -1)) {
            String[] split2 = split.split("\\.", -1);
            fm9.k(split2.length == 3);
            arrayList.add(new x8e(Integer.parseInt(split2[0]), Integer.parseInt(split2[1]), Integer.parseInt(split2[2])));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [java.lang.Object, uo4] */
    public static dn4 e(Cursor cursor) {
        Cursor cursor2 = cursor;
        byte[] blob = cursor2.getBlob(14);
        int i = 0;
        String string = cursor2.getString(0);
        string.getClass();
        String string2 = cursor2.getString(2);
        string2.getClass();
        Uri parse = Uri.parse(string2);
        String l = ia9.l(cursor2.getString(1));
        ArrayList a2 = a(cursor2.getString(3));
        if (blob.length <= 0) {
            blob = null;
        }
        vo4 vo4 = new vo4(string, parse, l, a2, blob, cursor2.getString(4), cursor2.getBlob(5));
        ? obj = new Object();
        obj.a = cursor2.getLong(13);
        obj.b = cursor2.getFloat(12);
        int i2 = cursor2.getInt(6);
        if (i2 == 4) {
            i = cursor2.getInt(11);
        }
        return new dn4(vo4, i2, cursor2.getLong(7), cursor2.getLong(8), cursor2.getLong(9), cursor2.getInt(10), i, obj);
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [java.lang.Object, uo4] */
    public static dn4 f(Cursor cursor) {
        Cursor cursor2 = cursor;
        int i = 0;
        String string = cursor2.getString(0);
        string.getClass();
        String string2 = cursor2.getString(2);
        string2.getClass();
        Uri parse = Uri.parse(string2);
        String string3 = cursor2.getString(1);
        vo4 vo4 = new vo4(string, parse, ia9.l("dash".equals(string3) ? "application/dash+xml" : "hls".equals(string3) ? "application/x-mpegURL" : "ss".equals(string3) ? "application/vnd.ms-sstr+xml" : "video/x-unknown"), a(cursor2.getString(3)), (byte[]) null, cursor2.getString(4), cursor2.getBlob(5));
        ? obj = new Object();
        obj.a = cursor2.getLong(13);
        obj.b = cursor2.getFloat(12);
        int i2 = cursor2.getInt(6);
        if (i2 == 4) {
            i = cursor2.getInt(11);
        }
        return new dn4(vo4, i2, cursor2.getLong(7), cursor2.getLong(8), cursor2.getLong(9), cursor2.getInt(10), i, obj);
    }

    public static String g(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb = new StringBuilder("state IN (");
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(iArr[i]);
        }
        sb.append(')');
        return sb.toString();
    }

    public static ArrayList h(SQLiteDatabase sQLiteDatabase) {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        if (!oaf.f0(sQLiteDatabase, "ExoPlayerDownloads")) {
            return arrayList;
        }
        Cursor query = sQLiteDatabase.query("ExoPlayerDownloads", new String[]{"id", "title", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                arrayList.add(f(query));
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        query.close();
        return arrayList;
        throw th;
    }

    public final void b() {
        SQLiteDatabase writableDatabase;
        synchronized (this.b) {
            if (!this.c) {
                try {
                    int a2 = hcf.a(this.a.getReadableDatabase(), 0, "");
                    if (a2 != 3) {
                        writableDatabase = this.a.getWritableDatabase();
                        writableDatabase.beginTransactionNonExclusive();
                        hcf.b(writableDatabase, 0, "", 3);
                        ArrayList<dn4> h = a2 == 2 ? h(writableDatabase) : new ArrayList<>();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ExoPlayerDownloads");
                        writableDatabase.execSQL("CREATE TABLE ExoPlayerDownloads (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        for (dn4 j : h) {
                            j(j, writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    }
                    this.c = true;
                } catch (SQLException e2) {
                    throw new IOException(e2);
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        }
    }

    public final Cursor c(String str, String[] strArr) {
        try {
            return this.a.getReadableDatabase().query("ExoPlayerDownloads", e, str, strArr, (String) null, (String) null, "start_time_ms ASC");
        } catch (SQLiteException e2) {
            throw new IOException(e2);
        }
    }

    public final dn4 d(String str) {
        Cursor c2;
        b();
        try {
            c2 = c("id = ?", new String[]{str});
            if (c2.getCount() == 0) {
                c2.close();
                return null;
            }
            c2.moveToNext();
            dn4 e2 = e(c2);
            c2.close();
            return e2;
        } catch (SQLiteException e3) {
            throw new IOException(e3);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final void i(dn4 dn4) {
        b();
        try {
            j(dn4, this.a.getWritableDatabase());
        } catch (SQLiteException e2) {
            throw new IOException(e2);
        }
    }

    public final void j(dn4 dn4, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = dn4.a.X;
        if (bArr == null) {
            bArr = oaf.f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", dn4.a.a);
        contentValues.put("mime_type", dn4.a.c);
        contentValues.put("uri", dn4.a.b.toString());
        List list = dn4.a.o;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            x8e x8e = (x8e) list.get(i);
            sb.append(x8e.a);
            sb.append('.');
            sb.append(x8e.b);
            sb.append('.');
            sb.append(x8e.c);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", dn4.a.Y);
        contentValues.put("data", dn4.a.Z);
        contentValues.put("state", Integer.valueOf(dn4.b));
        contentValues.put("start_time_ms", Long.valueOf(dn4.c));
        contentValues.put("update_time_ms", Long.valueOf(dn4.d));
        contentValues.put("content_length", Long.valueOf(dn4.e));
        contentValues.put("stop_reason", Integer.valueOf(dn4.f));
        contentValues.put("failure_reason", Integer.valueOf(dn4.g));
        contentValues.put("percent_downloaded", Float.valueOf(dn4.h.b));
        contentValues.put("bytes_downloaded", Long.valueOf(dn4.h.a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow("ExoPlayerDownloads", (String) null, contentValues);
    }

    public final void k() {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", 0);
            this.a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, "state = 2", (String[]) null);
        } catch (SQLException e2) {
            throw new IOException(e2);
        }
    }

    public final void l() {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", 5);
            contentValues.put("failure_reason", 0);
            this.a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, (String) null, (String[]) null);
        } catch (SQLException e2) {
            throw new IOException(e2);
        }
    }

    public final void m(int i, String str) {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            writableDatabase.update("ExoPlayerDownloads", contentValues, d + " AND id = ?", new String[]{str});
        } catch (SQLException e2) {
            throw new IOException(e2);
        }
    }
}
