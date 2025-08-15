package defpackage;

/* renamed from: csa  reason: default package */
public final /* synthetic */ class csa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nsa b;

    public /* synthetic */ csa(nsa nsa, int i) {
        this.a = i;
        this.b = nsa;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                nsa nsa = this.b;
                nsa.j1 = false;
                msa msa = nsa.Z0;
                if (msa != null) {
                    msa.c(nsa);
                    return;
                }
                return;
            case 1:
                msa msa2 = this.b.Z0;
                if (msa2 != null) {
                    msa2.d();
                    return;
                }
                return;
            case 2:
                nsa nsa2 = this.b;
                nsa2.getClass();
                nsa2.K0.log("PCRTCClient", "createPeerConnectionFactoryInternal, " + nsa2);
                nsa2.W0 = false;
                return;
            case 3:
                msa msa3 = this.b.Z0;
                if (msa3 != null) {
                    msa3.f();
                    return;
                }
                return;
            case 4:
                nsa nsa3 = this.b;
                msa msa4 = nsa3.Z0;
                if (msa4 != null) {
                    msa4.b(nsa3);
                    return;
                }
                return;
            case 5:
                nsa nsa4 = this.b;
                msa msa5 = nsa4.Z0;
                if (msa5 != null) {
                    msa5.q(nsa4);
                    return;
                }
                return;
            case 6:
                this.b.W0 = true;
                return;
            case 7:
                nsa nsa5 = this.b;
                nsa5.q();
                kj kjVar = nsa5.t0;
                if (kjVar != null) {
                    kjVar.b();
                    kjVar.a.getClass();
                }
                ni niVar = nsa5.v0;
                if (niVar != null) {
                    e24 e24 = niVar.c;
                    if (e24 != null) {
                        e24.c(niVar);
                    }
                    niVar.c = null;
                }
                nsa5.K0.log("PCRTCClient", nsa5 + ": " + jb9.c(nsa5) + " was released");
                return;
            default:
                this.b.q();
                return;
        }
    }

    public /* synthetic */ csa(nsa nsa, String str, int i) {
        this.a = i;
        this.b = nsa;
    }
}
