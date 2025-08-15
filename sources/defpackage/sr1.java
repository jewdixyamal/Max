package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationFactory;

/* renamed from: sr1  reason: default package */
public final class sr1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ yg1 Y;
    public final /* synthetic */ wr1 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sr1(yg1 yg1, wr1 wr1, Continuation continuation) {
        super(2, continuation);
        this.Y = yg1;
        this.Z = wr1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sr1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sr1 sr1 = new sr1(this.Y, this.Z, continuation);
        sr1.X = obj;
        return sr1;
    }

    /* JADX WARNING: type inference failed for: r3v13, types: [java.lang.Object, mec] */
    /* JADX WARNING: type inference failed for: r13v1, types: [java.lang.Object, lk] */
    public final Object o(Object obj) {
        boolean z;
        Long l;
        Conversation a;
        od2.a0(obj);
        sx3 sx3 = (sx3) this.X;
        yg1 yg1 = this.Y;
        int i = (yg1.b > 0 ? 1 : (yg1.b == 0 ? 0 : -1));
        e5f e5f = e5f.a;
        wr1 wr1 = this.Z;
        if (i == 0 || ((se5) ((qe5) wr1.u.getValue())).r()) {
            hm9.m("CallEngineTag", sx3 + " showIncomingCall " + yg1, new Object[0]);
            long j = yg1.a;
            if (((el3) wr1.A.getValue()).m(j)) {
                j47.T(sx3, ((w9a) ((kke) wr1.r.getValue())).a(), (vx3) null, new rr1(wr1, j, (Continuation) null), 2);
            }
            Conversation a2 = wr1.n().a();
            boolean z2 = false;
            boolean z3 = a2 == null || !a2.isDestroyed();
            Conversation a3 = wr1.n().a();
            if (a3 != null) {
                z2 = a3.isAnswered();
            }
            d04 j2 = wr1.j();
            String str = j2.c;
            j1e j1e = j2.a;
            zm1 zm1 = j1e instanceof zm1 ? (zm1) j1e : null;
            if (zm1 != null) {
                z = z2;
                l = new Long(zm1.d);
            } else {
                z = z2;
                l = null;
            }
            String str2 = yg1.c;
            String str3 = j2.c;
            if (str3 != null && !w9e.C0(str3)) {
                if (tpa.f(str, str2) && z3) {
                    hm9.m("CallEngineTag", sx3 + " ignore repetitive push " + str2 + " current id " + str, new Object[0]);
                    return e5f;
                } else if (z3 && l != null && j == l.longValue() && (a = wr1.n().a()) != null && a.isCaller()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(sx3);
                    sb.append(" same incoming call userId=");
                    sb.append(j);
                    sb.append(" answered=");
                    boolean z4 = z;
                    sb.append(z4);
                    hm9.m("CallEngineTag", sb.toString(), new Object[0]);
                    if (!z4) {
                        wr1.e();
                    }
                    return e5f;
                } else if (!tpa.f(str, str2)) {
                    hm9.m("CallEngineTag", sx3 + " ignore incoming conversation " + str2 + " we have an active one=" + str + " " + yg1, new Object[0]);
                    ds1.a(wr1.c).hangup(ji6.b, str2);
                    return e5f;
                }
            }
            hm9.m("CallEngineTag", sx3 + " create conversation for answer " + yg1, new Object[0]);
            wr1.i(yg1);
            ? obj2 = new Object();
            if (str2 == null) {
                str2 = null;
            }
            if (str2 != null) {
                long j3 = yg1.a;
                boolean z5 = yg1.f;
                String str4 = yg1.g;
                ? obj3 = new Object();
                obj3.a = j3;
                obj3.b = str2;
                obj3.c = str4;
                lr1 lr1 = new lr1(sx3, obj2, wr1, 1);
                f fVar = new f(1, this.Z, wr1.class, "handleCallCreateError", "handleCallCreateError(Ljava/lang/Throwable;)V", 0, 4);
                a41 a41 = wr1.b;
                long c = a41.c();
                ConversationFactory a4 = ds1.a(a41.a);
                y31 y31 = r12;
                y31 y312 = new y31(obj3, c, a41, lr1, fVar);
                z31 z31 = new z31(a4.answer(y31), new zm1(j3, z5), true, true);
                wr1.h(z31);
                obj2.a = z31;
                return e5f;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        hm9.m("CallEngineTag", "ignore group call push=" + yg1, new Object[0]);
        return e5f;
    }
}
