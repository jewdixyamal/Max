package defpackage;

import android.os.CancellationSignal;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: wh  reason: default package */
public final class wh {
    public final ilc a;
    public final sh b;
    public final th c;

    public wh(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 0);
        this.c = new th(oneMeRoomDatabase, 0);
    }

    public final Object a(Collection collection, Continuation continuation) {
        StringBuilder l = au1.l("SELECT * FROM animoji WHERE id IN (");
        int size = collection.size();
        a14.c(l, size);
        l.append(")");
        xlc a2 = xlc.a(size, l.toString());
        Iterator it = collection.iterator();
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
        return ote.i(this.a, new CancellationSignal(), new vh(this, a2, 1), continuation);
    }
}
