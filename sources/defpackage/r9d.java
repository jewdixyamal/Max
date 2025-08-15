package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import ru.ok.tamtam.util.HandledException;

/* renamed from: r9d  reason: default package */
public final class r9d extends d8d {
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final s8g s0;

    public r9d(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, s8g s8g) {
        this.b = je7;
        this.c = je72;
        this.o = je73;
        this.X = je74;
        this.Y = je75;
        this.Z = je76;
        this.s0 = s8g;
    }

    public static void y(s8g s8g) {
        s8g.a(new r9d(s8g.a, s8g.d, s8g.b, s8g.e, s8g.f, s8g.g, s8g));
    }

    public final void x() {
        ArrayList arrayList;
        HashSet hashSet;
        Iterator it;
        boolean z;
        int i;
        boolean z2;
        je7 je7 = this.o;
        je7 je72 = this.b;
        try {
            if (!((gh3) this.X.getValue()).f()) {
                hm9.m("r9d", "Can't process transmit task because not connected to network", new Object[0]);
                return;
            }
            hm9.m("r9d", "Start process transmit task", new Object[0]);
            boolean z3 = true;
            try {
                arrayList = ((eoe) je72.getValue()).l();
            } catch (Exception e) {
                int k = ((eoe) je72.getValue()).k();
                hm9.m("r9d", "process: selectWaitingAndFailedTaskCount count=%d", Integer.valueOf(k));
                ((cba) ((o45) je7.getValue())).c(new Exception("Exception during selectWaitingAndFailedTasks. Count=" + k + "; Exception: " + e.getMessage()), true);
                arrayList = ((k24) ((c34) ((eoe) je72.getValue()).a.get())).f.b().b(500, y53.M(goe.WAITING, goe.FAILED));
            }
            int size = arrayList.size();
            hm9.m("r9d", "selected taskIds count = " + size, new Object[0]);
            boolean z4 = false;
            if (size > 2000) {
                StringBuilder sb = new StringBuilder();
                Iterator it2 = ((eoe) je72.getValue()).m().iterator();
                while (it2.hasNext()) {
                    tne tne = (tne) it2.next();
                    sb.append("t=");
                    sb.append(tne.a);
                    sb.append(", c=");
                    sb.append(tne.b);
                    sb.append("; ");
                }
                String sb2 = sb.toString();
                hx9 hx9 = iua.b;
                ((eoe) je72.getValue()).f();
                ArrayList l = ((eoe) je72.getValue()).l();
                ((cba) ((o45) je7.getValue())).c(new HandledException("Too much tasks, count=%d. Count by type: %s", Integer.valueOf(size), sb2), false);
                arrayList = l;
            }
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator it3 = arrayList.iterator();
            boolean z5 = false;
            while (it3.hasNext()) {
                une j = ((eoe) je72.getValue()).j(((Long) it3.next()).longValue());
                if (j != null) {
                    hm9.m("r9d", "process task: %s", j.f.getClass().getName());
                    hua hua = j.f;
                    if (hua instanceof d8d) {
                        ((d8d) hua).a = (e8d) this.Y.getValue();
                    } else if (hua instanceof ol) {
                        ((ol) hua).c = (pl) this.Z.getValue();
                    } else {
                        throw new IllegalStateException("unknown task! " + j.f.getClass());
                    }
                    if (j.b != goe.FAILED || j.c < j.f.h()) {
                        if (j.e != 0) {
                            long j2 = j.d;
                            if (!(j2 == 0 || ((eoe) je72.getValue()).j(j2) == null || j.e != z3)) {
                            }
                        }
                        boolean z6 = j.f.getType() == iua.TYPE_SYNC_CHAT_HISTORY ? z3 : z4;
                        if (z6) {
                            q9d q9d = (q9d) j.f;
                            mg4 mg4 = q9d.X;
                            hashSet = hashSet3;
                            long j3 = q9d.c;
                            HashSet hashSet4 = mg4 == mg4.REGULAR ? hashSet2 : hashSet;
                            if (hashSet4.contains(Long.valueOf(j3))) {
                                hm9.m("r9d", "task <%s> already in list, delete it!", q9d.Y);
                                arrayList2.add(j);
                            } else {
                                hashSet4.add(Long.valueOf(j3));
                            }
                            if (z5) {
                                it = it3;
                                z = true;
                                z3 = z;
                                it3 = it;
                                hashSet3 = hashSet;
                                z4 = false;
                            }
                        } else {
                            hashSet = hashSet3;
                        }
                        try {
                            i = j.f.c();
                            it = it3;
                            z = true;
                        } catch (Throwable th) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("failed to execute onPreExecute method for task ");
                            it = it3;
                            sb3.append(j.f.getId());
                            sb3.append(" type ");
                            sb3.append(j.f.getType());
                            String sb4 = sb3.toString();
                            hm9.p("r9d", sb4, th);
                            z(j.f);
                            Exception exc = new Exception(sb4, th);
                            z = true;
                            ((cba) ((o45) je7.getValue())).c(exc, true);
                            i = 3;
                        }
                        if (i == 2) {
                            ((eoe) je72.getValue()).n(j.a, goe.WAITING);
                            if (z6) {
                                z3 = z;
                                z5 = z3;
                                it3 = it;
                                hashSet3 = hashSet;
                                z4 = false;
                            } else {
                                hm9.m("r9d", "task " + j + " skip", new Object[0]);
                            }
                        } else if (i == 3) {
                            hm9.m("r9d", "task " + j + " will be removed, reason: onPreExecute returned REMOVE", new Object[0]);
                            arrayList2.add(j);
                        } else {
                            ((eoe) je72.getValue()).n(j.a, goe.PROCESSING);
                            if (z6) {
                                z5 = z;
                            }
                            if (j.c > 0) {
                                hm9.m("r9d", "task " + j + " retry", new Object[0]);
                                z2 = z;
                            } else {
                                z2 = false;
                            }
                            hua hua2 = j.f;
                            if (hua2 instanceof ol) {
                                ol olVar = (ol) hua2;
                                ((tle) ((mle) this.c.getValue())).b(olVar, (lme) olVar, z2);
                            } else {
                                this.s0.a((d8d) hua2);
                            }
                        }
                        z3 = z;
                        it3 = it;
                        hashSet3 = hashSet;
                        z4 = false;
                    } else {
                        arrayList2.add(j);
                        hm9.m("r9d", "task " + j + " will be removed, reason: max fails count limit is reached", new Object[0]);
                    }
                }
                z = z3;
                hashSet = hashSet3;
                it = it3;
                z3 = z;
                it3 = it;
                hashSet3 = hashSet;
                z4 = false;
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                une une = (une) it4.next();
                hua hua3 = une.f;
                if (une.c >= hua3.h()) {
                    z(hua3);
                }
                ((eoe) je72.getValue()).d(une.a);
                hm9.m("r9d", "task " + une + " deleted", new Object[0]);
            }
        } catch (Exception e2) {
            hm9.p("r9d", "process: failed", e2);
        }
    }

    public final void z(hua hua) {
        try {
            hua.d();
        } catch (Throwable th) {
            ((cba) ((o45) this.o.getValue())).c(new Exception("failed to execute onMaxFailCount method for task " + hua.getId() + " type " + hua.getType(), th), true);
        }
    }
}
