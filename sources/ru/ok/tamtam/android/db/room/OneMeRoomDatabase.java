package ru.ok.tamtam.android.db.room;

import android.os.Looper;
import androidx.work.impl.model.WorkersQueueDao;
import kotlin.Metadata;
import one.me.android.OneMeApplication;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/tamtam/android/db/room/OneMeRoomDatabase;", "Lilc;", "<init>", "()V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public abstract class OneMeRoomDatabase extends ilc {
    public static volatile jj9 m;

    public abstract fd5 A();

    public abstract od5 B();

    public abstract ud5 C();

    public abstract le5 D();

    public abstract oy8 E();

    public abstract t19 F();

    public abstract ew9 G();

    public abstract kw9 H();

    public abstract yx9 I();

    public abstract rva J();

    public abstract adb K();

    public abstract a7c L();

    public abstract d9c M();

    public abstract alc N();

    public abstract xrc O();

    public abstract w4d P();

    public abstract s1e Q();

    public abstract b4e R();

    public abstract n4e S();

    public abstract hoe T();

    public abstract w8f U();

    public abstract qef V();

    public abstract mtf W();

    public abstract WorkersQueueDao X();

    public final void a() {
        if (m != null && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            boolean k = k();
            boolean n = n();
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            String valueOf = (name == null || name.length() == 0) ? String.valueOf(currentThread.getId()) : currentThread.getName();
            StringBuilder sb = new StringBuilder("NotMainThreadException(isOpenInternal=");
            sb.append(n);
            sb.append(", isInTransaction=");
            sb.append(k);
            sb.append(", curThread=");
            IllegalStateException illegalStateException = new IllegalStateException(zr6.l(sb, valueOf, ")"));
            int i = OneMeApplication.s0;
            bcf.a.c().a("ONEME-8045", illegalStateException);
        }
    }

    public abstract wh t();

    public abstract oj u();

    public abstract ed1 v();

    public abstract dt2 w();

    public abstract ir3 x();

    public abstract ja4 y();

    public abstract tp4 z();
}
