package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.profile.screens.members.ChatMembersScreen;

/* renamed from: zp1  reason: default package */
public final class zp1 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zp1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        int i = 2;
        boolean z = false;
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                bc7[] bc7Arr = CallWaitingRoomEventsWidget.v0;
                ((yz0) ((ez0) ((wp1) ((CallWaitingRoomEventsWidget) this.b).b.getValue()).b.getValue())).c(((tp1) ((up1) this.c)).a, !booleanValue);
                return e5f.a;
            case 1:
                if (((Number) obj).intValue() == 10101 && (!((Set) this.b).isEmpty())) {
                    bc7[] bc7Arr2 = ChatMembersScreen.u0;
                    ChatMembersScreen chatMembersScreen = (ChatMembersScreen) this.c;
                    Set set = (Set) chatMembersScreen.o0().s0.a.getValue();
                    if (set == null) {
                        set = wz4.a;
                    }
                    bl2 n0 = chatMembersScreen.n0();
                    pnf.n(n0, ((w9a) ((kke) n0.Y.getValue())).b(), (vx3) null, new yk2(set, n0, (Continuation) null), 2);
                }
                return e5f.a;
            case 2:
                nn3 nn3 = (nn3) obj;
                if (!((nx2) this.b).Q0.d(nn3.a) && !nn3.v0) {
                    List list = nn3.o;
                    if (list != null) {
                        Long l = (Long) this.c;
                        if (!list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    long longValue = ((Number) it.next()).longValue();
                                    if (l != null && longValue == l.longValue()) {
                                    }
                                }
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = true;
                return Boolean.valueOf(z);
            case 3:
                Throwable th = (Throwable) obj;
                ((gh3) this.b).e((fr1) this.c);
                return e5f.a;
            case 4:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                ((AtomicBoolean) this.b).set(booleanValue2);
                ((p7b) ((m7b) ((je7) this.c).getValue())).a.j("app.debug.fresco", booleanValue2);
                if (!booleanValue2) {
                    i = 6;
                }
                ta5.a.j(i);
                return e5f.a;
            default:
                nn3 nn32 = (nn3) obj;
                if (!((eya) this.b).E0.d(nn32.a) && !nn32.v0) {
                    List list2 = nn32.o;
                    if (list2 != null) {
                        Long l2 = (Long) this.c;
                        if (!list2.isEmpty()) {
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    long longValue2 = ((Number) it2.next()).longValue();
                                    if (l2 != null && longValue2 == l2.longValue()) {
                                    }
                                }
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = true;
                return Boolean.valueOf(z);
        }
    }
}
