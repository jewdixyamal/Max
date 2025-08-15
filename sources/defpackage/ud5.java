package defpackage;

import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: ud5  reason: default package */
public final class ud5 implements qu7 {
    public final th X;
    public final ilc a;
    public final sh b;
    public final th c;
    public final th o;

    public ud5(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 9);
        this.c = new th(oneMeRoomDatabase, 20);
        this.o = new th(oneMeRoomDatabase, 21);
        this.X = new th(oneMeRoomDatabase, 22);
    }

    public final void a() {
        Object unused = j47.f0(hz4.a, new rd5(this, (Continuation) null));
    }

    public final Object b(List list, ix9 ix9) {
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ux9 ux9 = (ux9) it.next();
            long j = ux9.a;
            arrayList.add(j + "_" + ux9.b);
        }
        StringBuilder l = au1.l("SELECT * FROM fcm_notifications_analytics WHERE chat_id||'_'||msg_id IN (");
        int size = arrayList.size();
        a14.c(l, size);
        l.append(") AND analytics_status = (");
        l.append("?");
        l.append(")");
        int i = 1;
        int i2 = size + 1;
        xlc a2 = xlc.a(i2, l.toString());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (str == null) {
                a2.W(i);
            } else {
                a2.f(i, str);
            }
            i++;
        }
        a2.j(i2, (long) au1.s(2));
        return ote.i(this.a, new CancellationSignal(), new uh(this, 9, a2), ix9);
    }
}
