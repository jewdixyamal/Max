package defpackage;

/* renamed from: yra  reason: default package */
public final /* synthetic */ class yra implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nsa b;
    public final /* synthetic */ String c;

    public /* synthetic */ yra(nsa nsa, String str, int i) {
        this.a = i;
        this.b = nsa;
        this.c = str;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                nsa nsa = this.b;
                nsa.getClass();
                StringBuilder sb = new StringBuilder("set sdp error ");
                String str = this.c;
                sb.append(str);
                nsa.j(sb.toString(), "set.sdp2");
                nsa.J0.log(e0e.callError, "setSdpFailed", (String) null);
                nsa.C0.post(new csa(nsa, str, 3));
                return;
            case 1:
                nsa nsa2 = this.b;
                nsa2.getClass();
                StringBuilder sb2 = new StringBuilder("create sdp error ");
                String str2 = this.c;
                sb2.append(str2);
                nsa2.j(sb2.toString(), "create.sdp2");
                nsa2.J0.log(e0e.callError, "onCreateSDPFailed", (String) null);
                nsa2.C0.post(new csa(nsa2, str2, 1));
                return;
            default:
                nsa nsa3 = this.b;
                msa msa = nsa3.Z0;
                if (msa != null) {
                    msa.g(nsa3, this.c);
                    return;
                }
                return;
        }
    }
}
