package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* renamed from: a75  reason: default package */
public final class a75 implements mgc {
    public final g03 a = new g03(15);
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final u43 e;
    public final int f;
    public final wt g;

    public a75(boolean z, boolean z2, boolean z3, glc glc, int i, wt wtVar) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = glc;
        this.f = i;
        this.g = wtVar;
    }

    public final vj0[] a(Handler handler, o75 o75, o75 o752, o75 o753, o75 o754) {
        ArrayList arrayList = new ArrayList();
        boolean z = this.b;
        u43 u43 = this.e;
        if (!z) {
            arrayList.add(new i65((glc) u43, this.a, this.g));
        }
        if (!this.c) {
            int i = this.f;
            arrayList.add(new k65(this.d, (glc) u43, i, this.a, this.g));
        }
        return (vj0[]) arrayList.toArray(new vj0[arrayList.size()]);
    }
}
