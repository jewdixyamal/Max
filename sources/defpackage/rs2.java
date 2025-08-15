package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: rs2  reason: default package */
public final class rs2 extends ol implements lme, hua {
    public final long A0;
    public final long X;
    public final int Y;
    public final String Z;
    public final long o;
    public final boolean s0;
    public final String t0;
    public final Map u0;
    public final String v0;
    public final String w0;
    public final a20 x0;
    public final Long y0;
    public final boolean z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rs2(long j, long j2, long j3, int i, String str, boolean z, String str2, HashMap hashMap, String str3, String str4, a20 a20, Long l, boolean z2, long j4) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = i;
        this.Z = str;
        this.s0 = z;
        this.t0 = str2;
        this.u0 = hashMap;
        this.v0 = str3;
        this.w0 = str4;
        this.x0 = a20;
        this.y0 = l;
        this.z0 = z2;
        this.A0 = j4;
    }

    public final int c() {
        e52 C = m().C(this.o);
        if (C == null) {
            return 3;
        }
        k92 k92 = C.b;
        if (k92.a == 0) {
            pl plVar = this.c;
            if (plVar == null) {
                plVar = null;
            }
            if (!k92.f(((hyc) ((q33) plVar.e.getValue())).t())) {
                return 2;
            }
        }
        return 1;
    }

    public final void d() {
        t().d(this.a);
    }

    public final void e(gle gle) {
        ss2 ss2 = (ss2) gle;
        if (ss2.c != null) {
            u();
            m().c0(Collections.singletonList(ss2.c));
        }
        l().c(new pi0(this.a));
    }

    public final byte[] f() {
        Tasks.ChatUpdate chatUpdate = new Tasks.ChatUpdate();
        chatUpdate.requestId = this.a;
        chatUpdate.chatId = this.o;
        chatUpdate.chatServerId = this.X;
        String str = this.v0;
        if (str != null) {
            chatUpdate.theme = str;
        } else {
            chatUpdate.themeIsNull = true;
        }
        String str2 = this.w0;
        if (str2 != null) {
            chatUpdate.photoToken = str2;
        } else {
            chatUpdate.photoTokenIsNull = true;
        }
        a20 a20 = this.x0;
        if (a20 != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = a20.b;
            rect.top = a20.c;
            rect.right = a20.d;
            rect.bottom = a20.e;
            chatUpdate.crop = rect;
        }
        Long l = this.y0;
        if (l != null) {
            chatUpdate.pinMessageId = l.longValue();
        } else {
            chatUpdate.pinMessageIdIsNull = true;
        }
        chatUpdate.notifyPin = this.z0;
        String str3 = this.t0;
        if (str3 != null) {
            chatUpdate.description = str3;
        } else {
            chatUpdate.descriptionIsNull = true;
        }
        return qw8.toByteArray(chatUpdate);
    }

    public final void g(pke pke) {
        if (!f46.U(pke.b)) {
            u();
            if (!(this.v0 == null && this.w0 == null && this.y0 == null)) {
                d();
            }
            ((k4a) j()).j(this.X);
        }
        l().c(new oi0(this.a, pke));
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_CHAT_UPDATE;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        Long l = this.y0;
        if (l != null && l.longValue() == -1) {
            l = 0L;
        }
        Long l2 = l;
        int i = this.Y;
        return new tq2(this.X, i != 0 ? au1.s(i) != 0 ? 3 : 2 : 0, this.Z, this.s0, this.t0, (HashMap) this.u0, this.v0, this.w0, this.x0, l2, this.z0, this.A0);
    }

    public final void u() {
        String str = this.w0;
        long j = this.o;
        if (str != null) {
            m().W(j, v82.b);
        }
        if (this.v0 != null) {
            m().W(j, v82.a);
        }
        if (this.y0 != null) {
            m().W(j, v82.o);
        }
    }
}
