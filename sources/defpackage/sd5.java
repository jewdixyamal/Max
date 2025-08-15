package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: sd5  reason: default package */
public final /* synthetic */ class sd5 implements m56 {
    public final /* synthetic */ ud5 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ sd5(ud5 ud5, long j, long j2) {
        this.a = ud5;
        this.b = j;
        this.c = j2;
    }

    /* JADX INFO: finally extract failed */
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        ud5 ud5 = this.a;
        ud5.getClass();
        xlc a2 = xlc.a(3, "SELECT chat_id, msg_id FROM fcm_notifications_analytics WHERE analytics_status=? AND chat_id=? AND time<=?");
        a2.j(1, (long) au1.s(3));
        long j = this.b;
        a2.j(2, j);
        long j2 = this.c;
        a2.j(3, j2);
        ilc ilc = ud5.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(new wd5(o.getLong(0), o.getLong(1)));
            }
            o.close();
            a2.n();
            ilc.b();
            th thVar = ud5.o;
            q36 f = thVar.f();
            f.j(1, (long) au1.s(3));
            f.j(2, j);
            f.j(3, j2);
            try {
                ilc.c();
                f.n();
                ilc.r();
                ilc.l();
                thVar.t(f);
                return arrayList;
            } catch (Throwable th) {
                thVar.t(f);
                throw th;
            }
        } catch (Throwable th2) {
            o.close();
            a2.n();
            throw th2;
        }
    }
}
