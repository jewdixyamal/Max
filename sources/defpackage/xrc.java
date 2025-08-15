package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: xrc  reason: default package */
public final class xrc {
    public final ilc a;
    public final zkc b;
    public final zkc c;
    public final zkc d;

    public xrc(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new zkc(oneMeRoomDatabase, 6);
        this.c = new zkc(oneMeRoomDatabase, 7);
        this.d = new zkc(oneMeRoomDatabase, 8);
    }

    public final yrc a(long j) {
        xlc a2 = xlc.a(1, "SELECT * FROM saved_msg_chat WHERE user_id = ?");
        a2.j(1, j);
        ilc ilc = this.a;
        ilc.b();
        yrc yrc = null;
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "user_id");
            int n2 = tfg.n(o, "chat_id");
            if (o.moveToFirst()) {
                yrc = new yrc(o.getLong(n), o.getLong(n2));
            }
            return yrc;
        } finally {
            o.close();
            a2.n();
        }
    }

    public final void b(long j, long j2) {
        ilc ilc = this.a;
        ilc.b();
        zkc zkc = this.b;
        q36 f = zkc.f();
        f.j(1, j);
        f.j(2, j2);
        try {
            ilc.c();
            f.m();
            ilc.r();
            ilc.l();
            zkc.t(f);
        } catch (Throwable th) {
            zkc.t(f);
            throw th;
        }
    }
}
