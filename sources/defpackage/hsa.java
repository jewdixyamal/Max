package defpackage;

import org.webrtc.SessionDescription;

/* renamed from: hsa  reason: default package */
public final /* synthetic */ class hsa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nsa b;
    public final /* synthetic */ SessionDescription c;

    public /* synthetic */ hsa(nsa nsa, SessionDescription sessionDescription, int i) {
        this.a = i;
        this.b = nsa;
        this.c = sessionDescription;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                nsa nsa = this.b;
                nsa.getClass();
                SessionDescription sessionDescription = this.c;
                String str = sessionDescription.description;
                bl5 bl5 = nsa.Q0;
                if (bl5.c) {
                    bl5.b = 0;
                    bl5.a = 0;
                    bl5.c = false;
                }
                long a2 = bl5.a(str);
                bl5.b = a2;
                if (a2 != 0) {
                    long j = bl5.a;
                    if (j != 0) {
                        bl5.c = true;
                        bl5.d.e(j ^ a2);
                    }
                }
                msa msa = nsa.Z0;
                if (msa != null) {
                    msa.m(nsa, sessionDescription);
                    return;
                }
                return;
            default:
                nsa nsa2 = this.b;
                nsa2.getClass();
                SessionDescription sessionDescription2 = this.c;
                String str2 = sessionDescription2.description;
                bl5 bl52 = nsa2.Q0;
                if (bl52.c) {
                    bl52.b = 0;
                    bl52.a = 0;
                    bl52.c = false;
                }
                long a3 = bl5.a(str2);
                bl52.a = a3;
                long j2 = bl52.b;
                if (!(j2 == 0 || a3 == 0)) {
                    bl52.c = true;
                    bl52.d.e(a3 ^ j2);
                }
                msa msa2 = nsa2.Z0;
                if (msa2 != null) {
                    msa2.a(nsa2, sessionDescription2);
                    return;
                }
                return;
        }
    }
}
