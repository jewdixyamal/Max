package defpackage;

/* renamed from: i28  reason: default package */
public final class i28 extends wq5 {
    public final /* synthetic */ int b;
    public final f38[] c;

    public /* synthetic */ i28(f38[] f38Arr, int i) {
        this.b = i;
        this.c = f38Arr;
    }

    public final void g(vae vae) {
        switch (this.b) {
            case 0:
                h28 h28 = new h28(vae, this.c);
                vae.f(h28);
                h28.d();
                return;
            default:
                f38[] f38Arr = this.c;
                int length = f38Arr.length;
                w28 w28 = new w28(vae, length, length <= wq5.a ? new x28(length) : new v28());
                vae.f(w28);
                az azVar = w28.X;
                int length2 = f38Arr.length;
                int i = 0;
                while (i < length2) {
                    f38 f38 = f38Arr[i];
                    if (!w28.Z && azVar.get() == null) {
                        f38.a(w28);
                        i++;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
