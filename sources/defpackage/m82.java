package defpackage;

import org.webrtc.RTCStats;

/* renamed from: m82  reason: default package */
public final /* synthetic */ class m82 implements qj3, jm7, q7c, b7b, b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ m82() {
        this.a = 5;
        this.b = "payloadType";
    }

    public Object T0(Object obj, bc7 bc7) {
        RTCStats rTCStats = (RTCStats) obj;
        switch (this.a) {
            case 5:
                Object obj2 = rTCStats.getMembers().get(this.b);
                if (obj2 != null) {
                    return e4c.c(obj2);
                }
                return null;
            default:
                Object obj3 = rTCStats.getMembers().get(this.b);
                if (obj3 != null) {
                    return obj3.toString();
                }
                return null;
        }
    }

    public void accept(Object obj) {
        i10 i10;
        String str = this.b;
        switch (this.a) {
            case 0:
                ((u82) obj).h = str;
                return;
            case 2:
                m20 m20 = (m20) obj;
                for (int i = 0; i < m20.b(); i++) {
                    if (s5c.y(str, m20.d(i).r)) {
                        if (i < 0 || i >= m20.b()) {
                            throw new IllegalArgumentException("index < 0 or index >= attaches.size()");
                        }
                        m20.a.remove(i);
                    }
                }
                return;
            case 3:
                Throwable th = (Throwable) obj;
                hm9.o("au8", "Can't update attach async localId = " + str);
                return;
            default:
                j10 j10 = (j10) obj;
                i10 i102 = j10.e;
                if (i102 == null) {
                    i102 = i10.j;
                }
                if (i102 != null) {
                    h10 a2 = i102.a();
                    a2.b = str;
                    i10 = new i10(a2);
                } else {
                    i10 = null;
                }
                j10.e = i10;
                return;
        }
    }

    public Object apply(Object obj) {
        w8f w8f = (w8f) obj;
        w8f.getClass();
        return new sa3(2, new uh(w8f, 29, this.b));
    }

    public void invoke(Object obj) {
        ((u65) obj).getClass();
        hm9.m("u65", "videoDebugListener.onVideoDecoderInitialized decoder = " + this.b, new Object[0]);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 7:
                return ((iq0) obj).c.contains(this.b);
            case 8:
                return ((iq0) obj).c.equals(this.b);
            default:
                String str = ((p8f) obj).a;
                return str != null && str.equals(this.b);
        }
    }

    public /* synthetic */ m82(ed edVar, String str, long j, long j2) {
        this.a = 1;
        this.b = str;
    }

    public /* synthetic */ m82(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
