package defpackage;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.PowerManager;
import java.io.File;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* renamed from: z30  reason: default package */
public final /* synthetic */ class z30 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ je7 b;

    public /* synthetic */ z30(int i, je7 je7) {
        this.a = i;
        this.b = je7;
    }

    public final Object invoke() {
        Object obj;
        je7 je7 = this.b;
        switch (this.a) {
            case 0:
                return j1e.a(((w9a) ((kke) je7.getValue())).e());
            case 1:
                return ((w9a) ((kke) je7.getValue())).a().limitedParallelism(1, "call_chat_observing");
            case 2:
                return tpa.u((Context) je7.getValue());
            case 3:
                return ((bea) je7.getValue()).j(true);
            case 4:
                return ((Context) je7.getValue()).getString(d0c.call_notification_name_temp);
            case 5:
                return ((Context) je7.getValue()).getString(d0c.call_notification_incoming_call);
            case 6:
                return ((Context) je7.getValue()).getString(d0c.call_notification_incoming_video_call);
            case 7:
                return ((Context) je7.getValue()).getString(d0c.call_notification_active_call);
            case 8:
                return ((w9a) ((kke) je7.getValue())).b();
            case 9:
                return ((OneMeRoomDatabase) ((pfa) je7.getValue()).m()).N();
            case 10:
                return Boolean.valueOf(((ge2) je7.getValue()).d());
            case 11:
                return ((w9a) ((kke) je7.getValue())).b();
            case Protos.Attaches.Attach.PRESENT:
                return ((ct0) je7.getValue()).a(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            case 13:
                t2a a2 = ((u2a) je7.getValue()).a();
                a2.f = false;
                return new u2a(a2);
            case Protos.Attaches.Attach.LOCATION:
                ((y7d) je7.getValue()).getClass();
                return t5c.c;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                qyc qyc = (qyc) ((y7d) je7.getValue());
                qyc.getClass();
                int i = 40;
                int q = (int) qyc.q(PmsKey.f87msggetreactionspagesize, (long) 40);
                if (q > 0) {
                    i = q;
                }
                return Integer.valueOf(i);
            case 16:
                qyc qyc2 = (qyc) ((y7d) je7.getValue());
                qyc2.getClass();
                List<Integer> o = qyc2.o(PmsKey.f5analyticspermissions, Collections.emptyList());
                EnumSet<E> noneOf = EnumSet.noneOf(gs7.class);
                for (Integer intValue : o) {
                    pq9 pq9 = gs7.a;
                    int intValue2 = intValue.intValue();
                    pq9.getClass();
                    Iterator it = gs7.o.iterator();
                    while (true) {
                        u1 u1Var = (u1) it;
                        if (u1Var.hasNext()) {
                            obj = u1Var.next();
                            ((gs7) obj).getClass();
                            if (10 == intValue2) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    gs7 gs7 = (gs7) obj;
                    if (gs7 != null) {
                        noneOf.add(gs7);
                    }
                }
                return noneOf;
            case LangUtils.HASH_SEED:
                return ((iba) je7.getValue()).c();
            case 18:
                return new zy(new File(((kk5) ((zi5) je7.getValue())).c(), "chats_v2"), (q64) null);
            case 19:
                return new zy(new File(((kk5) ((zi5) je7.getValue())).c(), "folders_v1"), (q64) null);
            case 20:
                return (SensorManager) ((Context) je7.getValue()).getSystemService("sensor");
            case 21:
                return (PowerManager) ((Context) je7.getValue()).getSystemService("power");
            case 22:
                return ((jle) ((hle) je7.getValue())).a();
            case 23:
                return (ScheduledExecutorService) ((iba) je7.getValue()).l.getValue();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return (ScheduledExecutorService) ((iba) je7.getValue()).l.getValue();
            case 25:
                iba iba = (iba) je7.getValue();
                return iba.h(iba.f(1, "ONEME_FB_BLOCK", Runtime.getRuntime().availableProcessors(), 1), "ONEME_FB_BLOCK");
            case 26:
                return (ScheduledExecutorService) ((iba) je7.getValue()).n.getValue();
            case 27:
                return new mbd((yme) je7.getValue());
            case 28:
                return new f55((ScheduledExecutorService) ((iba) je7.getValue()).n.getValue(), true);
            default:
                iba iba2 = (iba) je7.getValue();
                iba2.getClass();
                bc7 bc7 = iba.p[3];
                ExecutorService e = iba2.e(iba2.i);
                trd trd = muc.a;
                return new f55(e, false);
        }
    }
}
