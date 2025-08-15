package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: jlc  reason: default package */
public abstract class jlc implements Closeable {
    public final Object[] X;
    public final khe Y;
    public final Context a;
    public final Class b = OneMeRoomDatabase.class;
    public final String c = "cache.db";
    public final iba o;

    public jlc(Context context, iba iba, Object[] objArr) {
        this.a = context;
        this.o = iba;
        this.X = objArr;
        this.Y = new khe(new lwa(15, this));
    }

    public final void close() {
        if (this.Y.a()) {
            ilc ilc = (ilc) this.Y.getValue();
            k36 k36 = ilc.a;
            Boolean bool = null;
            if (k36 != null) {
                bool = Boolean.valueOf(k36.isOpen());
            }
            if (tpa.f(bool, Boolean.TRUE)) {
                ReentrantReadWriteLock.WriteLock writeLock = ilc.i.writeLock();
                writeLock.lock();
                try {
                    v47 v47 = ilc.e;
                    v47.getClass();
                    v47.getClass();
                    ilc.h().close();
                } finally {
                    writeLock.unlock();
                }
            }
        }
    }

    public final ilc m() {
        return (ilc) this.Y.getValue();
    }

    public final q1a n() {
        return new q1a(2, new l5(13, this));
    }
}
