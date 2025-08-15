package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: xx9  reason: default package */
public final class xx9 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ yx9 c;

    public /* synthetic */ xx9(yx9 yx9, ArrayList arrayList, int i) {
        this.a = i;
        this.c = yx9;
        this.b = arrayList;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        switch (this.a) {
            case 0:
                yx9 yx9 = this.c;
                ilc ilc = yx9.a;
                ilc.c();
                try {
                    yx9.b.B(this.b);
                    ilc.r();
                    ilc.l();
                    return e5f.a;
                } catch (Throwable th) {
                    ilc.l();
                    throw th;
                }
            default:
                StringBuilder l = au1.l("DELETE FROM notifications_tracker_messages WHERE chat_id||'_'||message_id in (");
                List<String> list = this.b;
                a14.c(l, list.size());
                l.append(")");
                String sb = l.toString();
                yx9 yx92 = this.c;
                q36 d = yx92.a.d(sb);
                int i = 1;
                for (String str : list) {
                    if (str == null) {
                        d.W(i);
                    } else {
                        d.f(i, str);
                    }
                    i++;
                }
                ilc ilc2 = yx92.a;
                ilc2.c();
                try {
                    Integer valueOf = Integer.valueOf(d.n());
                    ilc2.r();
                    return valueOf;
                } finally {
                    ilc2.l();
                }
        }
    }
}
