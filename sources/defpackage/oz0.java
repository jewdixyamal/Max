package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;

/* renamed from: oz0  reason: default package */
public final /* synthetic */ class oz0 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oz0(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object apply(Object obj) {
        Object value;
        oa oaVar;
        xs xsVar;
        switch (this.a) {
            case 0:
                WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate = (WaitingRoomParticipantsUpdate) this.b;
                yz0 yz0 = (yz0) this.c;
                xs xsVar2 = (xs) obj;
                List<ParticipantId> list = waitingRoomParticipantsUpdate.participantsIds;
                xs xsVar3 = new xs(0);
                for (ParticipantId b2 : list) {
                    xsVar3.add(mqa.b(b2));
                }
                if (waitingRoomParticipantsUpdate.hasAdded) {
                    ir6 ir6 = hm9.m;
                    if (ir6 != null && ir6.c()) {
                        us7 us7 = us7.X;
                        ir6.d(us7, "CallAdminSettingsController", "Waiting room added new users=" + xsVar3, (Throwable) null);
                    }
                    q0e q0e = yz0.s0;
                    do {
                        value = q0e.getValue();
                        oaVar = (oa) value;
                        xsVar = new xs(0);
                        qs qsVar = new qs(xsVar3);
                        while (qsVar.hasNext()) {
                            Object next = qsVar.next();
                            if (!xsVar2.contains(Long.valueOf(((gg1) next).a))) {
                                xsVar.add(next);
                            }
                        }
                    } while (!q0e.c(value, oa.a(oaVar, (LinkedHashMap) null, xsVar, System.currentTimeMillis(), 1)));
                } else if (waitingRoomParticipantsUpdate.hasRemoved) {
                    ir6 ir62 = hm9.m;
                    if (ir62 != null && ir62.c()) {
                        us7 us72 = us7.X;
                        ir62.d(us72, "CallAdminSettingsController", "Waiting room remove users=" + xsVar3, (Throwable) null);
                    }
                } else {
                    ir6 ir63 = hm9.m;
                    if (ir63 != null && ir63.c()) {
                        us7 us73 = us7.X;
                        ir63.d(us73, "CallAdminSettingsController", "Waiting room update users=" + xsVar3, (Throwable) null);
                    }
                }
                xs xsVar4 = new xs(0);
                qs qsVar2 = new qs(xsVar3);
                while (qsVar2.hasNext()) {
                    xsVar4.add(Long.valueOf(((gg1) qsVar2.next()).a));
                }
                return xsVar4;
            case 1:
                Set set = (Set) obj;
                qk5 Z = l6d.Z(new at(2, (List) this.b), new jy2(17, (yw5) this.c));
                uw5 uw5 = uw5.a;
                Iterator it = Z.iterator();
                if (!it.hasNext()) {
                    return wz4.a;
                }
                Object invoke = uw5.invoke(it.next());
                if (!it.hasNext()) {
                    return Collections.singleton(invoke);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(invoke);
                while (it.hasNext()) {
                    linkedHashSet.add(uw5.invoke(it.next()));
                }
                return linkedHashSet;
            case 2:
                y79 y79 = (y79) obj;
                x79 x79 = (x79) this.b;
                boolean z = x79.b;
                return new y79(z ? 1 : 4, !z, true, z && ((e52) this.c).b.m <= 0, 0, x79.a, 16);
            case 3:
                Set set2 = (Set) obj;
                Iterator it2 = ((Set) ((x3c) this.b).c).iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    Set set3 = (Set) this.c;
                    if (!hasNext) {
                        return set3;
                    }
                    set3.add(new gza(((Number) it2.next()).longValue(), fza.a));
                }
            default:
                List list2 = (List) obj;
                List<d2e> list3 = (List) this.b;
                ArrayList arrayList = new ArrayList(z53.S(list3, 10));
                for (d2e q : list3) {
                    arrayList.add(q5e.q((q5e) this.c, q));
                }
                return arrayList;
        }
    }
}
