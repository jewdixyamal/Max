package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* renamed from: w5f  reason: default package */
public final class w5f {
    public static final /* synthetic */ bc7[] j;
    public final j0e a;
    public final j0e b;
    public final sx3 c;
    public final kke d;
    public final String e = w5f.class.getName();
    public final s35 f = new s35(1);
    public volatile boolean g;
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final w4d i = mqd.D();

    static {
        oi9 oi9 = new oi9(w5f.class, "invalidateMarkerJob", "getInvalidateMarkerJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        j = new bc7[]{oi9};
    }

    public w5f(j0e j0e, j0e j0e2, sx3 sx3, kke kke) {
        this.a = j0e;
        this.b = j0e2;
        this.c = sx3;
        this.d = kke;
    }

    public final Object a(e52 e52, l29 l29, Continuation continuation) {
        boolean z = this.g;
        e5f e5f = e5f.a;
        if (!z) {
            long B = fm9.B(e52);
            int f2 = l29.f(B);
            if (f2 < 0) {
                f2 = Math.abs(f2) - 1;
            }
            MessageModel messageModel = (MessageModel) x53.j0(f2, l29.a);
            boolean z2 = messageModel != null && messageModel.c == B;
            if ((f2 != 0 || !l29.c || z2) && messageModel != null) {
                if (B >= messageModel.c) {
                    if (z2) {
                        MessageModel messageModel2 = (MessageModel) x53.j0(f2 + 1, l29.a);
                        if (messageModel2 != null) {
                            if (messageModel2.b != 0) {
                                B = messageModel2.c - 1;
                            }
                        } else if (l29.b) {
                            B++;
                        }
                        B = 0;
                    } else {
                        B = fm9.B(e52);
                    }
                }
                String str = this.e;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, str, ey8.h(B, "Found unreadMarker, mark:"), (Throwable) null);
                }
                this.g = true;
                s35 s35 = this.f;
                s35.getClass();
                Object a2 = s35.b.a(new s5f(B), continuation);
                tx3 tx3 = tx3.a;
                if (a2 != tx3) {
                    a2 = e5f;
                }
                if (a2 == tx3) {
                    return a2;
                }
            } else {
                this.g = false;
                String str2 = this.e;
                ir6 ir62 = hm9.m;
                if (ir62 != null && ir62.c()) {
                    us7 us7 = us7.X;
                    String m = messageModel != null ? messageModel.m() : null;
                    StringBuilder sb = new StringBuilder("Can't find unreadMarker by chatReadMark:");
                    sb.append(B);
                    sb.append(", isExact:");
                    sb.append(z2);
                    ir62.d(us7, str2, zr6.l(sb, ", firstUnread:", m), (Throwable) null);
                }
            }
        }
        return e5f;
    }

    public final void b(boolean z, k56 k56) {
        e52 e52 = (e52) this.a.getValue();
        if (e52 != null) {
            AtomicBoolean atomicBoolean = this.h;
            boolean z2 = true;
            if (z) {
                atomicBoolean.getAndSet(true);
                return;
            }
            if (e52.b.m <= 0) {
                z2 = false;
            }
            if (!z2) {
                atomicBoolean.getAndSet(false);
            } else if (atomicBoolean.getAndSet(false)) {
                this.i.o1(this, j[0], j47.S(this.c, ((w9a) this.d).a(), vx3.b, new v5f(this, e52, k56, (Continuation) null)));
            }
        }
    }
}
