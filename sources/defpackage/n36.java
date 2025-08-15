package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.UUID;

/* renamed from: n36  reason: default package */
public final class n36 extends SQLiteOpenHelper {
    public static final /* synthetic */ int s0 = 0;
    public boolean X;
    public final r9b Y;
    public boolean Z;
    public final Context a;
    public final y8 b;
    public final l0f c;
    public final boolean o;

    public n36(Context context, String str, y8 y8Var, l0f l0f, boolean z) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, l0f.b, new l36(l0f, y8Var));
        this.a = context;
        this.b = y8Var;
        this.c = l0f;
        this.o = z;
        this.Y = new r9b(str == null ? UUID.randomUUID().toString() : str, context.getCacheDir(), false);
    }

    public final k36 a(boolean z) {
        r9b r9b = this.Y;
        try {
            r9b.a(!this.Z && getDatabaseName() != null);
            this.X = false;
            SQLiteDatabase g = g(z);
            if (this.X) {
                close();
                k36 a2 = a(z);
                r9b.b();
                return a2;
            }
            k36 d = d(g);
            r9b.b();
            return d;
        } catch (Throwable th) {
            r9b.b();
            throw th;
        }
    }

    public final void close() {
        r9b r9b = this.Y;
        try {
            r9b.a(r9b.a);
            super.close();
            this.b.a = null;
            this.Z = false;
        } finally {
            r9b.b();
        }
    }

    public final k36 d(SQLiteDatabase sQLiteDatabase) {
        y8 y8Var = this.b;
        k36 k36 = (k36) y8Var.a;
        if (k36 != null && tpa.f((SQLiteDatabase) k36.b, sQLiteDatabase)) {
            return k36;
        }
        k36 k362 = new k36(0, sQLiteDatabase);
        y8Var.a = k362;
        return k362;
    }

    public final SQLiteDatabase g(boolean z) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.Z;
        Context context = this.a;
        if (!(databaseName == null || z2 || (parentFile = context.getDatabasePath(databaseName).getParentFile()) == null)) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                parentFile.toString();
            }
        }
        if (!z) {
            return getReadableDatabase();
        }
        try {
            return getWritableDatabase();
        } catch (Throwable th) {
            super.close();
            if (th instanceof m36) {
                m36 m36 = th;
                int s = au1.s(m36.a);
                Throwable th2 = m36.b;
                if (s == 0 || s == 1 || s == 2 || s == 3) {
                    throw th2;
                } else if (!(th2 instanceof SQLiteException)) {
                    throw th2;
                }
            } else if (!(th instanceof SQLiteException)) {
                throw th;
            } else if (databaseName == null || !this.o) {
                throw th;
            }
            context.deleteDatabase(databaseName);
            if (!z) {
                return getReadableDatabase();
            }
            try {
                return getWritableDatabase();
            } catch (m36 e) {
                throw e.b;
            }
        }
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        boolean z = this.X;
        l0f l0f = this.c;
        if (!z && l0f.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            d(sQLiteDatabase);
            l0f.getClass();
        } catch (Throwable th) {
            throw new m36(th, 1);
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.c.J(d(sQLiteDatabase));
        } catch (Throwable th) {
            throw new m36(th, 2);
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.X = true;
        try {
            this.c.K(d(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new m36(th, 4);
        }
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.X) {
            try {
                this.c.L(d(sQLiteDatabase));
            } catch (Throwable th) {
                throw new m36(th, 5);
            }
        }
        this.Z = true;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.X = true;
        try {
            this.c.M(d(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new m36(th, 3);
        }
    }
}
