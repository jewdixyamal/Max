package defpackage;

import java.util.Collections;

/* renamed from: vt8  reason: default package */
public final /* synthetic */ class vt8 implements f6 {
    public final /* synthetic */ au8 a;
    public final /* synthetic */ es8 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ jy8 d;

    public /* synthetic */ vt8(au8 au8, es8 es8, String str, jy8 jy8) {
        this.a = au8;
        this.b = es8;
        this.c = str;
        this.d = jy8;
    }

    public final void run() {
        au8 au8 = this.a;
        au8.getClass();
        es8 es8 = this.b;
        int i = es8.a.z0.i();
        String str = this.c;
        cu8 cu8 = es8.a;
        if (i == 1) {
            long j = cu8.t0;
            xxc xxc = mg4.o;
            au8.e.a(new k8d(j, Collections.singletonList(Long.valueOf(cu8.b)), (da3) null, true, cu8.U0));
        } else {
            ((k24) au8.a).c.n(cu8.b, new m82(str, 2));
        }
        long j2 = cu8.b;
        dg5 dg5 = (dg5) this.d.c.getValue();
        dg5.getClass();
        StringBuilder sb = new StringBuilder("UploadFileAttachWorker:");
        long j3 = cu8.t0;
        sb.append(j3);
        au1.q(j2, ":", ":", sb);
        sb.append(str);
        dg5.a.c(sb.toString());
        au8.b.c(new l6f(j3, cu8.b, 0));
    }
}
