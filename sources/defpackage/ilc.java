package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: ilc  reason: default package */
public abstract class ilc {
    public volatile k36 a;
    public Executor b;
    public qm c;
    public xde d;
    public final v47 e = e();
    public boolean f;
    public List g;
    public final LinkedHashMap h = new LinkedHashMap();
    public final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
    public final ThreadLocal j = new ThreadLocal();
    public final Map k = Collections.synchronizedMap(new LinkedHashMap());
    public final LinkedHashMap l = new LinkedHashMap();

    public static Object s(Class cls, xde xde) {
        if (cls.isInstance(xde)) {
            return xde;
        }
        if (xde instanceof ug4) {
            return s(cls, ((ug4) xde).getDelegate());
        }
        return null;
    }

    public void a() {
        if (!this.f) {
            if (!(!(Looper.getMainLooper().getThread() == Thread.currentThread()))) {
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
            }
        }
    }

    public final void b() {
        if (!k() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public final void c() {
        a();
        a();
        k36 writableDatabase = h().getWritableDatabase();
        this.e.f(writableDatabase);
        if (writableDatabase.n0()) {
            writableDatabase.n();
        } else {
            writableDatabase.m();
        }
    }

    public final q36 d(String str) {
        a();
        b();
        return h().getWritableDatabase().o(str);
    }

    public abstract v47 e();

    public abstract xde f(d34 d34);

    public List g() {
        return nz4.a;
    }

    public final xde h() {
        xde xde = this.d;
        if (xde == null) {
            return null;
        }
        return xde;
    }

    public Set i() {
        return wz4.a;
    }

    public Map j() {
        return oz4.a;
    }

    public final boolean k() {
        return h().getWritableDatabase().m0();
    }

    public final void l() {
        h().getWritableDatabase().S();
        if (!k()) {
            v47 v47 = this.e;
            if (v47.f.compareAndSet(false, true)) {
                Executor executor = v47.a.b;
                if (executor == null) {
                    executor = null;
                }
                executor.execute(v47.n);
            }
        }
    }

    public final void m(k36 k36) {
        v47 v47 = this.e;
        synchronized (v47.m) {
            if (!v47.g) {
                k36.U("PRAGMA temp_store = MEMORY;");
                k36.U("PRAGMA recursive_triggers='ON';");
                k36.U("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                v47.f(k36);
                v47.h = k36.o("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                v47.g = true;
            }
        }
    }

    public final boolean n() {
        k36 k36 = this.a;
        return k36 != null && k36.isOpen();
    }

    public final Cursor o(zde zde, CancellationSignal cancellationSignal) {
        a();
        b();
        return cancellationSignal != null ? h().getWritableDatabase().p0(zde, cancellationSignal) : h().getWritableDatabase().o0(zde);
    }

    public final Object p(Callable callable) {
        c();
        try {
            Object call = callable.call();
            r();
            return call;
        } finally {
            l();
        }
    }

    public final void q(Runnable runnable) {
        c();
        try {
            runnable.run();
            r();
        } finally {
            l();
        }
    }

    public final void r() {
        h().getWritableDatabase().r0();
    }
}
