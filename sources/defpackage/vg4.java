package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: vg4  reason: default package */
public final /* synthetic */ class vg4 implements bh4, mq1, b7b, ehe {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object o;

    public /* synthetic */ vg4(oq1 oq1, ScheduledExecutorService scheduledExecutorService, long j) {
        this.a = 2;
        this.b = oq1;
        this.X = scheduledExecutorService;
        this.o = null;
        this.c = j;
    }

    public Object a() {
        Cursor rawQuery;
        t8f t8f = (t8f) this.b;
        gqc gqc = (gqc) t8f.c;
        gqc.getClass();
        Iterable iterable = (Iterable) this.X;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + gqc.m0(iterable);
            SQLiteDatabase m = gqc.m();
            m.beginTransaction();
            try {
                m.compileStatement(str).execute();
                rawQuery = m.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", (String[]) null);
                while (rawQuery.moveToNext()) {
                    gqc.U((long) rawQuery.getInt(0), rs7.MAX_RETRIES_REACHED, rawQuery.getString(1));
                }
                rawQuery.close();
                m.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                m.setTransactionSuccessful();
                m.endTransaction();
            } catch (Throwable th) {
                m.endTransaction();
                throw th;
            }
        }
        gqc.o(new lt1(t8f.g.a() + this.c, (Object) (hc0) this.o, 9));
        return null;
    }

    public ScheduledFuture b(bkg bkg) {
        switch (this.a) {
            case 0:
                ah4 ah4 = (ah4) this.b;
                ah4.getClass();
                return ah4.b.schedule(new yg4(ah4, (Runnable) this.X, bkg, 1), this.c, (TimeUnit) this.o);
            default:
                ah4 ah42 = (ah4) this.b;
                ah42.getClass();
                return ah42.b.schedule(new cu0(ah42, (Callable) this.X, bkg, 1), this.c, (TimeUnit) this.o);
        }
    }

    public String q(lq1 lq1) {
        bm7 bm7 = (bm7) this.b;
        kq0.y(bm7, lq1);
        if (!bm7.isDone()) {
            bm7.d(new e76(((ScheduledExecutorService) this.X).schedule(new ii5(lq1, (oq1) bm7), this.c, TimeUnit.MILLISECONDS), 1), ju0.k());
        }
        return "TimeoutFuture[" + bm7 + "]";
    }

    public boolean test(Object obj) {
        b7b b7b;
        AtomicLong atomicLong = (AtomicLong) this.b;
        long j = atomicLong.get();
        long nanoTime = System.nanoTime();
        if (j != 0 && Math.abs(nanoTime - j) <= ((TimeUnit) this.o).toNanos(this.c) && ((b7b = (b7b) this.X) == null || !b7b.test(obj))) {
            return false;
        }
        atomicLong.set(nanoTime);
        return true;
    }

    public /* synthetic */ vg4(ah4 ah4, Object obj, long j, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = ah4;
        this.X = obj;
        this.c = j;
        this.o = timeUnit;
    }

    public /* synthetic */ vg4(t8f t8f, Iterable iterable, hc0 hc0, long j) {
        this.a = 4;
        this.b = t8f;
        this.X = iterable;
        this.o = hc0;
        this.c = j;
    }

    public /* synthetic */ vg4(AtomicLong atomicLong, TimeUnit timeUnit, long j, b7b b7b) {
        this.a = 3;
        this.b = atomicLong;
        this.o = timeUnit;
        this.c = j;
        this.X = b7b;
    }
}
