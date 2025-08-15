package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: ew9  reason: default package */
public final class ew9 implements qu7 {
    public final ilc a;
    public final sh b;
    public final p19 c;
    public final p19 o;

    public ew9(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 12);
        new p19(oneMeRoomDatabase, 12);
        new p19(oneMeRoomDatabase, 13);
        this.c = new p19(oneMeRoomDatabase, 14);
        this.o = new p19(oneMeRoomDatabase, 15);
    }

    public final void a() {
        Object unused = j47.f0(hz4.a, new dw9(this, (Continuation) null));
    }

    public final Object b(long j, Continuation continuation) {
        xlc a2 = xlc.a(1, "SELECT * FROM fcm_notifications where time > ? ORDER BY time ASC");
        a2.j(1, j);
        return ote.i(this.a, new CancellationSignal(), new uh(this, 14, a2), continuation);
    }
}
