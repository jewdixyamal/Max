package defpackage;

import com.my.tracker.obfuscated.t;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;
import ru.ok.android.externcalls.sdk.AudioSampleEnergyCalculator;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;

/* renamed from: r60  reason: default package */
public final /* synthetic */ class r60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r60(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final void run() {
        List list = null;
        long j = this.b;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                qz7 qz7 = (qz7) obj;
                qz7.getClass();
                int i = oaf.a;
                i74 i74 = ((o75) qz7.c).a.D0;
                fd F = i74.F();
                i74.I(F, 1010, new yv3(F, j));
                return;
            case 1:
                ph4 ph4 = (ph4) obj;
                ph4.getClass();
                int i2 = maf.a;
                h74 h74 = ((n75) ph4.b).a.C0;
                ed P = h74.P();
                h74.Q(P, 1010, new v64(P, j));
                return;
            case 2:
                ((AudioSampleEnergyCalculator) obj).lambda$onSample$0(j);
                return;
            case 3:
                p82 p82 = (p82) obj;
                l92 l92 = (l92) p82.d.remove(Long.valueOf(j));
                if (l92 != null) {
                    ConcurrentHashMap concurrentHashMap = p82.c;
                    k92 k92 = l92.c;
                    concurrentHashMap.remove(Long.valueOf(k92.l));
                    p82.b.remove(Long.valueOf(k92.l));
                    p82.e.remove(Long.valueOf(k92.a));
                }
                e52 e52 = (e52) p82.f.remove(Long.valueOf(j));
                if (e52 != null) {
                    ConcurrentHashMap concurrentHashMap2 = p82.g;
                    k92 k922 = e52.b;
                    concurrentHashMap2.remove(Long.valueOf(k922.a));
                    je7 je7 = p82.C;
                    if (je7.getValue() != null) {
                        zb2 zb2 = (zb2) ((ta2) je7.getValue());
                        zb2.getClass();
                        j47.T(zb2.Z, (lx3) null, (vx3) null, new mb2(zb2, k922.a, (Continuation) null), 3);
                    }
                }
                p82.h.remove(Long.valueOf(j));
                return;
            case 4:
                FeedbackListenerManagerImpl.scheduleRemoving$lambda$4((FeedbackListenerManagerImpl) obj, j);
                return;
            case 5:
                ((rk5) obj).k.F(j);
                return;
            case 6:
                mk6 mk6 = ((MessagesListWidget) obj).x0;
                jk6 jk6 = mk6.d;
                if (jk6 != null && jk6.a == j) {
                    list = jk6.b;
                }
                mk6.a(new jk6(j, list));
                return;
            case 7:
                ((ard) ((g03) obj).c).o.F(j);
                return;
            default:
                ((t) obj).a(j);
                return;
        }
    }
}
