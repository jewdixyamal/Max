package defpackage;

import android.os.CancellationSignal;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: kw9  reason: default package */
public final class kw9 implements qu7 {
    public final ilc a;
    public final sh b;
    public final p19 c;

    public kw9(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 13);
        this.c = new p19(oneMeRoomDatabase, 16);
    }

    public final void a() {
        Object unused = j47.f0(hz4.a, new jw9(this, (Continuation) null));
    }

    public final Object b(List list, Continuation continuation) {
        StringBuilder l = au1.l("SELECT * FROM notifications_read_marks WHERE chat_id IN (");
        int size = list.size();
        a14.c(l, size);
        l.append(")");
        xlc a2 = xlc.a(size, l.toString());
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            Long l2 = (Long) it.next();
            if (l2 == null) {
                a2.W(i);
            } else {
                a2.j(i, l2.longValue());
            }
            i++;
        }
        return ote.i(this.a, new CancellationSignal(), new uh(this, 16, a2), continuation);
    }
}
