package defpackage;

import android.view.Surface;
import java.util.Objects;
import java.util.concurrent.Executor;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;

/* renamed from: tef  reason: default package */
public final /* synthetic */ class tef implements grd, l05 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ tef(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public void a(Surface surface) {
        Executor executor;
        zm4 zm4 = (zm4) this.b;
        int s = au1.s(zm4.b);
        lq1 lq1 = (lq1) this.c;
        if (s != 0) {
            if (s == 1) {
                see see = (see) this.o;
                if (see.a()) {
                    Objects.toString(see, "EMPTY");
                    lq1.b((Object) null);
                    zm4.e();
                    return;
                }
                zm4.g = surface;
                Objects.toString(surface);
                see.b(surface, (Executor) zm4.d, new cy1(10, zm4));
                zm4.b = 4;
                lq1.b((d15) zm4.f);
                return;
            } else if (s != 2) {
                if (s == 3) {
                    if (!(((l05) zm4.j) == null || (executor = (Executor) zm4.i) == null)) {
                        executor.execute(new fre(zm4, 6, surface));
                    }
                    Objects.toString(surface);
                    return;
                } else if (s != 4) {
                    throw new IllegalStateException("State " + h4f.v(zm4.b) + " is not handled");
                }
            }
        }
        lq1.b((Object) null);
    }

    public void j(nqd nqd) {
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.o;
        switch (this.a) {
            case 0:
                wef wef = (wef) obj2;
                wef.getClass();
                kef kef = (kef) obj;
                hm9.m("wef", "copyFromUri: started for uri = %s", kef.a.a);
                lef lef = kef.a;
                String a2 = ((cj0) wef.a).a(lef.a, ((it3) obj3).c);
                if (kj6.h(a2)) {
                    hm9.m("wef", "copyFromUri: finished for uri = %s", lef.a);
                    if (!nqd.h()) {
                        w36 a3 = kef.a();
                        a3.c = a2;
                        nqd.a(new kef(a3));
                        return;
                    }
                    return;
                } else if (!nqd.h()) {
                    nqd.onError(new RuntimeException("failed to copy file"));
                    return;
                } else {
                    return;
                }
            default:
                WaitingRoomParticipants.loadWaitingParticipantIdsPageSingle$lambda$6((py0) obj2, (lp1) obj, (WaitingRoomParticipants) obj3, nqd);
                return;
        }
    }
}
