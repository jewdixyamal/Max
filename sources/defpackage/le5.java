package defpackage;

import android.os.CancellationSignal;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: le5  reason: default package */
public final class le5 implements qu7 {
    public final ilc a;
    public final sh b;
    public final th c;

    public le5(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 10);
        this.c = new th(oneMeRoomDatabase, 23);
    }

    public final void a() {
        Object unused = j47.f0(hz4.a, new ke5(this, (Continuation) null));
    }

    public final Object b(List list, Continuation continuation) {
        StringBuilder l = au1.l("SELECT * FROM fcm_notifications_history WHERE chat_id IN (");
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
        return ote.i(this.a, new CancellationSignal(), new uh(this, 11, a2), continuation);
    }
}
