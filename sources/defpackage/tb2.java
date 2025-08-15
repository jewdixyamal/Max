package defpackage;

import com.my.tracker.obfuscated.t;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.tamtam.android.services.NotificationTamService;

/* renamed from: tb2  reason: default package */
public final /* synthetic */ class tb2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ tb2(Object obj, long j, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
        this.o = obj2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((zb2) this.c).k(this.b, (e52) this.o);
                return;
            case 1:
                ((jc2) this.c).b.c(this.b, (Collection) this.o);
                return;
            case 2:
                tq6 tq6 = (tq6) this.c;
                if (!tq6.s0.get()) {
                    long j = this.b;
                    Long valueOf = Long.valueOf(j);
                    String str = (String) this.o;
                    hm9.m("uq6", "onFileUploadCompleted: completed upload. response =%s, totalBytes=%d", str, valueOf);
                    sq6 sq6 = new sq6(true, str, 100.0f, j);
                    f2a f2a = tq6.Z;
                    f2a.e(sq6);
                    f2a.b();
                    tq6.a(false);
                    return;
                }
                return;
            case 3:
                NotificationTamService notificationTamService = (NotificationTamService) this.c;
                dt2 c2 = ((elc) notificationTamService.Y.getValue()).c();
                long j2 = this.b;
                NotificationTamService.a(j2, (CharSequence) this.o, notificationTamService, c2.f(j2));
                return;
            case 4:
                die die = (die) this.c;
                List<u41> list = (List) this.o;
                long j3 = this.b;
                synchronized (die) {
                    for (u41 u41 : list) {
                        fp1 fp1 = u41.a;
                        boolean z = fp1.a == olf.b;
                        LinkedHashMap linkedHashMap = (LinkedHashMap) die.c;
                        bg1 bg1 = fp1.b;
                        boolean containsKey = true ^ linkedHashMap.containsKey(bg1);
                        if (z && containsKey) {
                            linkedHashMap.put(bg1, Long.valueOf(j3));
                        }
                    }
                    die.m(list);
                }
                return;
            case 5:
                ((n61) ((m61) ((die) this.c).a)).c("screen_share_first_frame", EventItemValueKt.toEventItemValue(this.b), new EventItemsMap((Map) this.o));
                return;
            case 6:
                fd7 fd7 = ((qld) this.c).f;
                if (fd7 != null) {
                    ((CopyOnWriteArraySet) fd7.a).add(new tag(this.b, (z99) this.o));
                    return;
                }
                return;
            case 7:
                wva wva = (wva) this.c;
                wva.getClass();
                int i = maf.a;
                t75 t75 = ((n75) wva.c).a;
                h74 h74 = t75.C0;
                ed P = h74.P();
                Object obj = this.o;
                h74.Q(P, 26, new lt1(P, obj, this.b));
                if (t75.X0 == obj) {
                    t75.x0.i(26, new ta4(19));
                    return;
                }
                return;
            case 8:
                aab aab = (aab) this.c;
                aab.getClass();
                int i2 = oaf.a;
                u75 u75 = ((o75) aab.b).a;
                i74 i74 = u75.D0;
                fd F = i74.F();
                Object obj2 = this.o;
                i74.I(F, 26, new x72((Object) F, obj2, this.b, 4));
                if (u75.b1 == obj2) {
                    u75.x0.f(26, new ta4(20));
                    return;
                }
                return;
            default:
                ((t) this.c).a((String) this.o, this.b);
                return;
        }
    }

    public /* synthetic */ tb2(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = j;
    }
}
