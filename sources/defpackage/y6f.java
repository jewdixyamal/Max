package defpackage;

/* renamed from: y6f  reason: default package */
public final /* synthetic */ class y6f implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7f b;

    public /* synthetic */ y6f(d7f d7f, int i) {
        this.a = i;
        this.b = d7f;
    }

    public final void run() {
        d7f d7f = this.b;
        switch (this.a) {
            case 0:
                hm9.m("c7f", "getUploadFromRepository: upload not found in cache,  uploadData=%s", d7f);
                return;
            default:
                hm9.k("c7f", "removeUploadFromRepository: finished for data=" + d7f);
                return;
        }
    }
}
