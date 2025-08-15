package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* renamed from: puc  reason: default package */
public final class puc extends SQLiteOpenHelper {
    public static final List X = Arrays.asList(new ouc[]{new ouc(0), new ouc(1), new ouc(2), new ouc(3), new ouc(4)});
    public static final String c = ("INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")");
    public static final int o = 5;
    public final int a;
    public boolean b = false;

    public puc(int i, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.a = i;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List list = X;
        if (i2 <= list.size()) {
            while (i < i2) {
                ((ouc) list.get(i)).a(sQLiteDatabase);
                i++;
            }
            return;
        }
        StringBuilder j = wg0.j("Migration from ", i, " to ", i2, " was requested, but cannot be performed. Only ");
        j.append(list.size());
        j.append(" migrations are provided");
        throw new IllegalArgumentException(j.toString());
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, this.a);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i2);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.b) {
            onConfigure(sQLiteDatabase);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, i, i2);
    }
}
