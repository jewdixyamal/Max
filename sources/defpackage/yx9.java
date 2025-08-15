package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: yx9  reason: default package */
public final class yx9 implements qu7 {
    public final ilc a;
    public final sh b;
    public final p19 c;
    public final p19 o;

    public yx9(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 14);
        this.c = new p19(oneMeRoomDatabase, 17);
        this.o = new p19(oneMeRoomDatabase, 18);
    }

    public final void a() {
        Object unused = j47.f0(hz4.a, new wx9(this, (Continuation) null));
    }

    public final Object b(long j, long j2, jx9 jx9) {
        xlc a2 = xlc.a(2, "SELECT * FROM notifications_tracker_messages WHERE chat_id=? AND message_id=?");
        a2.j(1, j);
        a2.j(2, j2);
        return ote.i(this.a, new CancellationSignal(), new uh(this, 17, a2), jx9);
    }
}
